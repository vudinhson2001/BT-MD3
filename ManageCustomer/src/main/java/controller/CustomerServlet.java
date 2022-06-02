package controller;

import model.Customer;
import service.CustomerDAO;
import service.ICustomerDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    CustomerDAO iCustomerDAO = new CustomerDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("act");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "update":
                showUpdate(request,response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerDAO.findById(id);
        request.setAttribute("spMuonSua", customer);
        requestDispatcher.forward(request,response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        List<Customer> customers = iCustomerDAO.findAll();
        request.setAttribute("dsKH", customers);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("act");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    save(request,response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "update":
                try {
                    editCustomer(request,response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int id = Integer.parseInt(request.getParameter("id"));
        iCustomerDAO.update(id,new Customer(id,name, age));
        response.sendRedirect("/customers");
    }


    private void save(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int id = Integer.parseInt(request.getParameter("id"));
        iCustomerDAO.add(new Customer(id,name, age));
        response.sendRedirect("/customers");
    }
}

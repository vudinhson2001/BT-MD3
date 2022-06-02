package controller;

import model.Class;
import service.ClassService;
import service.impl.ClassServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClassServlet", urlPatterns = "/classes")
public class ClassServlet extends HttpServlet {
    ClassServiceImpl classService = new ClassServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String act = request.getParameter("action");
        if (act == null) {
            act = "";
        }
        switch (act) {
            default:
                showList(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Class> classList = classService.findAll();
        request.setAttribute("dsl", classList);
        request.getRequestDispatcher("class/list.jsp").forward(request, response);
    }
}

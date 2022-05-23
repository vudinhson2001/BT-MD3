package service;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    public CustomerDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2006?useSSL=false", "root", "962001");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void add(Customer customer) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into customer(name,age)values(?,?)");) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setInt(2, customer.getAge());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        }
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement("select * from customer");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                customers.add(new Customer(id, name, age));

            }
        } catch (SQLException e) {

        }
        return customers;
    }

    private void printSQLException(SQLException e) {
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Customer customer) throws SQLException {
        return false;
    }
}

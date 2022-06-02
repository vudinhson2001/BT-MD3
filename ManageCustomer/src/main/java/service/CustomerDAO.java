package service;

import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    List<Customer> customers = new ArrayList<>();

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
             PreparedStatement preparedStatement = connection.prepareStatement("insert into customer(id, name, age)values(?, ?, ?)");) {
            preparedStatement.setInt(1, customer.getId());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setInt(3, customer.getAge());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public int findIndexById(int id) {
        int index = -1;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    public Customer findById(int id) {
        for (Customer customer: customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> findAll() {

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
    public boolean update(int id, Customer customer) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("update customer set name = ?, age= ?  where id = ?;") ){
            statement.setString(1, customer.getName());
            statement.setInt(2, customer.getAge());
            statement.setInt(3, customer.getId());
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
}

package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {
    public void add(Customer customer) throws SQLException;

    int findIndexById(int id);

    Customer findById(int id);


    public List<Customer> findAll();

    public boolean delete(int id) throws SQLException;

    boolean update(int id, Customer customer) throws SQLException;

}

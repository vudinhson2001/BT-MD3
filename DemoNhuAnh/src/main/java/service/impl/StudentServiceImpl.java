package service.impl;

import model.Class;
import model.Student;
import service.ClassService;
import service.StudentService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    ClassService classService = new ClassServiceImpl();
    protected Connection getConnection() {
        Connection connection = null;
        try {
            java.lang.Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from student");) {
            System.out.println(preparedStatement); //in ra câu truy vấn.
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int classId = rs.getInt("classId");
                Class clazz = classService.findById(classId);
                students.add(new Student(id,name, age, clazz));
            }
        } catch (SQLException e) {

        }
        return students;
    }

    @Override
    public void add(Student student) throws SQLException {

    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public boolean update(Student student) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public List<Student> findAllByClass(int classId) {
        return null;
    }

    @Override
    public List<Student> findAllByNameContains(String name) {
        return null;
    }
}

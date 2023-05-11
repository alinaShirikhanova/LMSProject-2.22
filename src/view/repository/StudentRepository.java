package view.repository;

import model.Student;

import java.sql.*;

public class StudentRepository {
    public static void getAll() {
        String url = "jdbc:postgresql://localhost:5432/java";
        try {
            Connection connection = DriverManager.getConnection(url, "postgres", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from students");

            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                new Student(id, name, surname);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Не удалось подключиться к базе данных");
            System.out.println(e.getMessage());
        }

    }


    public static void insertStudent(String name, String surname) {
        String url = "jdbc:postgresql://localhost:5432/java";
        try {
            Connection connection = DriverManager.getConnection(url, "postgres", "root");
            String query = "insert into students(name, surname) values (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);


            statement.setString(1, name);
            statement.setString(2, surname);
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Не удалось подключиться к базе данных");
            System.out.println(e.getMessage());
        }
    }
}

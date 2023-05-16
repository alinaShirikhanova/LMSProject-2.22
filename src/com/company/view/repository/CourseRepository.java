package com.company.view.repository;

import com.company.model.Course;

import java.sql.*;

public class CourseRepository {
    public static void getAll() {
        String url = "jdbc:postgresql://localhost:5432/java";
        try {
            Connection connection = DriverManager.getConnection(url, "postgres", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from courses");

            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("id"));
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                new Course(id, title, description);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println("Не удалось подключиться к базе данных");
            System.out.println(e.getMessage());
        }

    }


    public static void insertCourse(String title, String description) {
        String url = "jdbc:postgresql://localhost:5432/java";
        try {
            Connection connection = DriverManager.getConnection(url, "postgres", "root");
            String query = "insert into courses(title, description) values (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);


            statement.setString(1, title);
            statement.setString(2, description);
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Не удалось подключиться к базе данных");
            System.out.println(e.getMessage());
        }
    }
}

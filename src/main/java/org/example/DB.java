package org.example;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "55555555k";

    public static void main(String[] args) {

    }

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ArrayList<Auto> getAllAutos() throws SQLException {
        String SQL = "select * from autos";
        try (Connection conn = connect();
             Statement st = conn.createStatement();
             ResultSet resultSet = st.executeQuery(SQL)) {
            while (resultSet.next()) {
                Auto a = new Auto();
                a.setId(resultSet.getInt("ID"));
                a.setCreatedYear(resultSet.getInt("created_year"));
                a.setColor(resultSet.getString("color"));
                a.setName(resultSet.getString("name"));
                a.setPrice(resultSet.getInt("price"));
                getAllAutos().add(a);

            }
            return null;
        }
    }
}
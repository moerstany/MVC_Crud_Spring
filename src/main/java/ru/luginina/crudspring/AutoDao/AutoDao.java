package ru.luginina.crudspring.AutoDao;

import org.springframework.stereotype.Component;
import ru.luginina.crudspring.models.Auto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class AutoDao {
    private static int AvtoCount;


    private static final String URL = "snuffleupagus.db.elephantsql.com/mine";
    private static final String USERNAME = "sjappxlr";
    private static final String PASSWORD = "8pFqnAMCzYkIahI1OD7a3sHmKNY1Hyqs";

    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Auto> index() {
        List<Auto> autos = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM auto";
            ResultSet resultSet = statement.executeQuery(SQL);

            while(resultSet.next()) {
                Auto auto = new Auto();

                auto.setId(resultSet.getInt("id"));
                auto.setName(resultSet.getString("name"));
                auto.setBrend(resultSet.getString("brend"));
                auto.setNumber(resultSet.getString("number"));
                auto.setPrice(resultSet.getDouble("price"));
                autos.add(auto);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return autos;
    }
    public Auto show(int id) {
        Auto auto= null;

        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM Auto WHERE id=?");

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            auto = new Auto();

            auto.setId(resultSet.getInt("id"));
            auto.setName(resultSet.getString("name"));
            auto.setBrend(resultSet.getString("brend"));
            auto.setNumber(resultSet.getString("number"));
            auto.setPrice(resultSet.getDouble("price"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return auto;
    }

    public void save(Auto auto) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO Auto VALUES(1, ?, ?, ?, ? )");

            preparedStatement.setString(1, auto.getName());
            preparedStatement.setString(2, auto.getBrend());
            preparedStatement.setString(3, auto.getNumber());
            preparedStatement.setDouble(4, auto.getPrice());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void update(int id, Auto updatedAuto) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE Auto SET name=?, brend=?, number=?, price=? WHERE id=?");

            preparedStatement.setString(1, updatedAuto.getName());
            preparedStatement.setString(2, updatedAuto.getBrend());
            preparedStatement.setString(3, updatedAuto.getNumber());
            preparedStatement.setDouble(4, updatedAuto.getPrice());
            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete(int id) {
        PreparedStatement preparedStatement =
                null;
        try {
            preparedStatement = connection.prepareStatement("DELETE FROM Auto WHERE id=?");

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}


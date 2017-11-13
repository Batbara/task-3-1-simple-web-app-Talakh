package by.tr.web.task032.dao.impl;

import by.tr.web.task032.exception.DAOException;
import by.tr.web.task032.dao.UserDAO;
import by.tr.web.task032.domain.User;
import by.tr.web.task032.exception.MessageUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLUserDAO implements UserDAO {

    @Override
    public List<User> findUser(String name, String surname) throws DAOException {
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;

        String FIND_USER_QUERY = "SELECT users.usertable.name, users.usertable.surname, " +
                "users.usertable.phoneNumber, users.usertable.email FROM users.usertable " +
                "WHERE users.usertable.name = '" + name + "' AND users.usertable.surname = '" + surname+"'";
        try {
            connection = ConnectorDB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(FIND_USER_QUERY);

            if (!resultSet.isBeforeFirst()) {
                return null;
            }
            List<User> users = createUserList(resultSet);
            return users;

        } catch (SQLException e) {
            throw new DAOException(MessageUtil.SQL_EXCEPTION_MESSAGE);
        } finally {
            try {
                if(connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                ConnectorDB.closeConnection(connection);
            }
        }

    }

    private List<User> createUserList(ResultSet resultSet) throws SQLException {
        List<User> users = new ArrayList<>();
        int columnIndex = 1;
        while (resultSet.next()) {

            User user = new User();
            user.setName(resultSet.getString(columnIndex++));
            user.setSurname(resultSet.getString(columnIndex++));
            user.setPhoneNumber(resultSet.getString(columnIndex++));
            user.seteMail(resultSet.getString(columnIndex));

            users.add(user);
            columnIndex = 1;
        }
        return users;

    }

}

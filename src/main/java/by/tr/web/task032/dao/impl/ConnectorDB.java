package by.tr.web.task032.dao.impl;

import by.tr.web.task032.exception.DAOException;
import by.tr.web.task032.exception.MessageUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    private static final String RESOURCE_NAME = "database";
    private static final String PASSWORD = "db.password";
    private static final String USER = "db.user";
    private static final String URL = "db.url";
    private static final String DRIVER = "db.driver";

    public static Connection getConnection() throws DAOException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_NAME);
        String url = resourceBundle.getString(URL);
        String user = resourceBundle.getString(USER);
        String password = resourceBundle.getString(PASSWORD);
        try {
            Class.forName(resourceBundle.getString(DRIVER));
        } catch (ClassNotFoundException e) {
            throw new DAOException(MessageUtil.DRIVER_CLASS_NOT_FOUND);
        }
        try {
            return DriverManager.getConnection(url,user,password);// только этот оператор должен повторяться при открытии нового соединения
            // все остальное выше должно выполняться только один раз за всю жизни приложения
        } catch (SQLException e) {
            throw new DAOException(MessageUtil.FAIL_TO_CONNECT_MESSAGE);
            // потеряла при перевыбросе реальное исключение,  и сообщения в логах и при генерации исключение не выносятся в именовынные константы - они исключение
            // throw new DAOException("my message", e);
        }
    }
    public static void closeConnection(Connection connection) throws DAOException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DAOException(MessageUtil.FAIL_TO_CLOSE_CONNECTION);
        }
    }
}

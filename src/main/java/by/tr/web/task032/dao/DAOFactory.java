package by.tr.web.task032.dao;


import by.tr.web.task032.dao.impl.SQLUserDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final SQLUserDAO sqlUserDAO = new SQLUserDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public SQLUserDAO getSqlUserDAO() {
        return sqlUserDAO;
    }
}

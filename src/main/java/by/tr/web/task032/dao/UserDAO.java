package by.tr.web.task032.dao;


import by.tr.web.task032.entity.User;
import by.tr.web.task032.exception.DAOException;

import java.util.List;

public interface UserDAO {
    List<User> findUser(String name, String surname) throws DAOException;
}

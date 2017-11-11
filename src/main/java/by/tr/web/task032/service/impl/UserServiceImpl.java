package by.tr.web.task032.service.impl;


import by.tr.web.task032.exception.DAOException;
import by.tr.web.task032.dao.DAOFactory;
import by.tr.web.task032.dao.UserDAO;
import by.tr.web.task032.entity.User;
import by.tr.web.task032.exception.MessageUtil;
import by.tr.web.task032.service.UserService;
import by.tr.web.task032.exception.UserServiceException;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> findUser(String name, String surname) throws UserServiceException{

        if(name == null || surname == null){
            throw new UserServiceException(MessageUtil.VALIDATION_EXCEPTION_MESSAGE);
        }
        UserDAO userDAO = DAOFactory.getInstance().getSqlUserDAO();
        List<User> users;
        try {
            users = userDAO.findUser(name, surname);
        } catch (DAOException e) {
            throw new UserServiceException(e);
        }
        return users;
    }
}

package by.tr.web.task032.service;

import by.tr.web.task032.domain.User;
import by.tr.web.task032.exception.UserServiceException;

import java.util.List;

public interface UserService {
    List<User> findUser(String name, String surname) throws UserServiceException;
}

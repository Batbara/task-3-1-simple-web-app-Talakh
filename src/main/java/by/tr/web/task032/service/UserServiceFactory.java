package by.tr.web.task032.service;


import by.tr.web.task032.service.impl.UserServiceImpl;

public final class  UserServiceFactory {
    private static final UserServiceFactory instance = new UserServiceFactory();
    private final UserServiceImpl userService = new UserServiceImpl();

    private UserServiceFactory(){}

    public static UserServiceFactory getInstance(){
        return instance;
    }

    public UserServiceImpl getUserService() {
        return userService;
    }
}

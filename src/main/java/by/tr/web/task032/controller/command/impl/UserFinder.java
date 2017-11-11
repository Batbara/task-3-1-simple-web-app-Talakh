package by.tr.web.task032.controller.command.impl;

import by.tr.web.task032.controller.command.Command;
import by.tr.web.task032.entity.User;
import by.tr.web.task032.service.UserService;
import by.tr.web.task032.exception.UserServiceException;
import by.tr.web.task032.service.UserServiceFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserFinder implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, UserServiceException {
        String name = request.getParameter(Command.NAME_PARAMETER);
        String surname = request.getParameter(Command.SURNAME_PARAMETER);
        String USER_DATA_URL = "/WEB-INF/jsp/userData.jsp";

        UserService userService = UserServiceFactory.getInstance().getUserService();
        List<User> users = userService.findUser(name,surname);

        request.setAttribute(Command.ENTITY_ATTRIBUTE,users);

        RequestDispatcher dispatcher = request.getRequestDispatcher(USER_DATA_URL);
        dispatcher.forward(request,response);

    }
}

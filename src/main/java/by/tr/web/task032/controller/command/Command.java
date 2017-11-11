package by.tr.web.task032.controller.command;

import by.tr.web.task032.exception.UserServiceException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Command {
    String NAME_PARAMETER = "name";
    String SURNAME_PARAMETER = "surname";
    String ENTITY_ATTRIBUTE = "users";
    void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, UserServiceException;
}

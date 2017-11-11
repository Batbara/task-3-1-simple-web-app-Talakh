package by.tr.web.task032.controller;

import by.tr.web.task032.controller.command.Command;
import by.tr.web.task032.controller.command.CommandDirector;
import by.tr.web.task032.controller.command.CommandNames;
import by.tr.web.task032.exception.UserServiceException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        CommandDirector commandDirector = new CommandDirector();
        Command command = commandDirector.getCommand(CommandNames.FIND_USER);
        try {
            command.execute(request, response);
        } catch (UserServiceException e) {
            String ERROR_PAGE_URL = "/WEB-INF/jsp/error.jsp";
            String ERROR_ATTRIBUTE = "error";

            request.setAttribute(ERROR_ATTRIBUTE, e.getMessage());

            RequestDispatcher dispatcher = request.getRequestDispatcher(ERROR_PAGE_URL);
            dispatcher.forward(request, response);
        }
    }
}

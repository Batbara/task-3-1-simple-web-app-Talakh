package by.tr.web.task032.controller.command;

import by.tr.web.task032.controller.command.impl.UserFinder;

import java.util.HashMap;
import java.util.Map;

public class CommandDirector {
    private Map<CommandNames, Command> commands = new HashMap<>();

    public CommandDirector() {

        commands.put(CommandNames.FIND_USER, new UserFinder());
    }

    public Command getCommand(CommandNames name) {
        return commands.get(name);
    }
}

package by.tr.web.task032.controller.command;

import by.tr.web.task032.controller.command.impl.UserFinder;

import java.util.HashMap;
import java.util.Map;

public class CommandDirector {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandDirector() {

        commands.put(CommandName.FIND_USER, new UserFinder());
    }

    public Command getCommand(String name) {
        CommandName commandName = CommandName.valueOf(name);
        return commands.get(commandName);
    }
}

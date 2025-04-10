package org.example;

import org.example.commands.Command;
import org.example.exceptions.NoSuchCommandException;

import java.util.HashMap;

public class CommandManager {

    HashMap<String, Command> commands = new HashMap<>();

    public HashMap<String, Command> getCommands() {
        return commands;
    }

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public Command getCommandByKey(String key) throws NoSuchCommandException {
        if (!commands.containsKey(key)) {
            throw new NoSuchCommandException(key);
        }
        return commands.get(key);
    }


}

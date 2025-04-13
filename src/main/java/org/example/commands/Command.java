package org.example.commands;

public interface Command {

    void execute(String arg);
    String getDescription();
    String getName();
}

package org.example.commands;

public interface Command {

    void execute();
    String getDescription();
    String getName();
}

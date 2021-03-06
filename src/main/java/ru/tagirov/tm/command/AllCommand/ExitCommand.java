package ru.tagirov.tm.command.AllCommand;

import ru.tagirov.tm.command.AbstractCommand;
import ru.tagirov.tm.init.Bootstrap;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class ExitCommand extends AbstractCommand {

    public ExitCommand(Bootstrap bootstrap) {
        super(bootstrap);
    }

    @Override
    public String getRoleCommand() {
        return "all";
    }

    @Override
    public String getName() {
        return "exit - account";
    }

    @Override
    public String getDescription() {
        return "log out of your profile";
    }

    @Override
    public void execute() throws IOException {
        if(!(bootstrap.user == null)){
            bootstrap.user = null;
            System.out.println();
        }else{
            System.out.println("[YOU ARE ALREADY LOGGED OUT OF YOUR ACCOUNT!]");
            System.out.println();
        }
    }
}
package ru.tagirov.tm.command.projectCommand;

import ru.tagirov.tm.init.Bootstrap;
import ru.tagirov.tm.command.AbstractCommand;
import ru.tagirov.tm.entity.Project;

import java.io.IOException;
import java.util.Map;

public class ProjectRemoveCommand extends AbstractCommand {

    public ProjectRemoveCommand(Bootstrap bootstrap){
        super(bootstrap);
    }

    @Override
    public String getRoleCommand() {
        return "user";
    }

    @Override
    public String getName() {
        return "project remove";
    }

    @Override
    public String getDescription() {
        return "delete the selected project";
    }

    @Override
    public void execute() throws IOException {
        if(!(bootstrap.user == null)) {
            System.out.println("[PROJECT REMOVE]");
            System.out.println("ENTER PROJECT NAME:");
            name = reader.readLine();
            for (Map.Entry<String, Project> tmp : bootstrap.projectService.findAll().entrySet()) {
                if (tmp.getValue().getName().equals(name) && tmp.getValue().getUserId().equals(bootstrap.user.getUserId())) {
                    bootstrap.projectService.remove(tmp.getValue());
                }
            }
            System.out.println("[OK]");
            System.out.println();
        }else{
            System.out.println("[YOU ARE NOT LOGGED IN TO YOUR ACCOUNT!]");
            System.out.println();
        }
    }
}

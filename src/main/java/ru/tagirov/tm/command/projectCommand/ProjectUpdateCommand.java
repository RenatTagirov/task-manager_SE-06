package ru.tagirov.tm.command.projectCommand;

import ru.tagirov.tm.init.Bootstrap;
import ru.tagirov.tm.command.AbstractCommand;
import ru.tagirov.tm.entity.Project;

import java.io.IOException;
import java.util.Map;

public class ProjectUpdateCommand extends AbstractCommand {

    public ProjectUpdateCommand(Bootstrap bootstrap){
        super(bootstrap);
    }

    @Override
    public String getRoleCommand() {
        return "user";
    }

    @Override
    public String getName() {
        return "project update";
    }

    @Override
    public String getDescription() {
        return "edit the selected project";
    }

    @Override
    public void execute() throws IOException {
        if(!(bootstrap.user == null)) {
            System.out.println("[PROJECT UPDATE]");
            System.out.println("ENTER PROJECT NAME:");
            name = reader.readLine();
            System.out.println("WHAT YOU WANT TO UPDATE?");
            System.out.println("NAME OR DESCRIPTION:");
            or = reader.readLine();
            if (or.equalsIgnoreCase("name")) {
                for (Map.Entry<String, Project> tmp : bootstrap.projectService.findAll().entrySet()) {
                    if (tmp.getValue().getName().equals(name) && tmp.getValue().getUserId().equals(bootstrap.user.getUserId())) {
                        System.out.println("ENTER NEW NAME:");
                        tmp.getValue().setName(reader.readLine());
                        tmp.getValue().setDateUpdate(bootstrap.getDate.getDate());
                    }
                }
                System.out.println("[OK]");
                System.out.println();
            } else if (or.equalsIgnoreCase("description")) {
                for (Map.Entry<String, Project> tmp : bootstrap.projectService.findAll().entrySet()) {
                    if (tmp.getValue().getName().equals(name) && tmp.getValue().getUserId().equals(bootstrap.user.getUserId())) {
                        System.out.println("ENTER NEW DESCRIPTION:");
                        tmp.getValue().setDescription(reader.readLine());
                        tmp.getValue().setDateUpdate(bootstrap.getDate.getDate());
                    }
                }
                System.out.println("[OK]");
                System.out.println();
            } else {
                System.out.println("[YOU COMMAND IS INVALID]");
                System.out.println();
            }
        }else{
            System.out.println("[YOU ARE NOT LOGGED IN TO YOUR ACCOUNT!]");
            System.out.println();
        }
    }
}

import Controllers.IController;
import Controllers.NoteController;
import Model.Fields;
import Model.Note;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ViewNote implements IViewNote{

    private IViewOperations viewOperations;

    public ViewNote(IViewOperations viewOperations) {
        this.viewOperations = viewOperations;
    }

    public void run(){
        boolean isContinue = true;
        viewOperations.showHelp();
        while (isContinue){
            try{

                String command = viewOperations.prompt("Enter the command: ");
                Commands com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT){
                    isContinue = false;
                    continue;
                }

                switch (com){
                    case CREATE:
                        viewOperations.create();
                        break;
                    case READ:
                        viewOperations.read();
                        break;
                    case UPDATE:
                        viewOperations.update();
                        break;
                    case LIST:
                        viewOperations.list();
                        break;
                    case HELP:
                        viewOperations.showHelp();
                        break;
                    case DELETE:
                        viewOperations.delete();
                        break;
                }
            }catch (Exception e){
                System.out.println("An error has occurred");
            }
        }
    }



}
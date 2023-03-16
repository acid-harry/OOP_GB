import Lesson_5.Controllers.UserController;
import Lesson_5.Model.Fields;
import Lesson_5.Model.User;
import Lesson_5.Utils.PhoneException;
import Lesson_5.Utils.Validate;

import java.util.Scanner;

public class ViewUser {

    private final UserController userController;
    private final Validate validate;

    public ViewUser(UserController userController, Validate validate) {
        this.userController = userController;
        this.validate = validate;
    }

    public void run(){
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Enter the command: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case LIST:
                        list();
                        break;
                    case DELETE:
                        delete();
                        break;
                    case HELP:
                        showHelp();
                }
            }
            catch(Exception ex) {
                System.out.println("An error has occurred: " + ex.toString());
            }
        }
    }
    private void read() throws Exception {
        String id = prompt("User ID: ");
        User user_ = userController.readUser(id);
        System.out.println(user_);
    }
    private void update() throws Exception {
        String userid = prompt("User ID: ");
        String field_name = prompt("What is field (NAME, SIRNAME, TELEPHONE): ");
        String param = null;
        if (Fields.valueOf(field_name) == Fields.TELEPHONE) {
            param = catchTelephone(param);
            if(param == null) {
                return;
            }
        }
        else {
            param = prompt("Enter on what you want to change: ");
        }
        User _user = userController.readUser(userid);
        userController.updateUser(_user, Fields.valueOf(field_name.toUpperCase()), param);
    }
    public String catchTelephone(String telephone) throws Exception {
        while(true) {
            try {
                telephone = prompt("Enter what you want to change, enter the phone number (enter 0 to escape): ");
                if(telephone.equals("0")) {
                    System.out.println("You refused to enter to change the user");
                    return null;
                }
                validate.checkNumber(telephone);
                return telephone;
            } catch(PhoneException ex) {
                System.out.println("An error has occurred: " + ex.toString());
            }
        }
    }
    private void list() throws Exception {
        for (User user : userController.getUsers()) {
            System.out.println(user);
        }
    }
    private void create() throws Exception {
        String firstName = prompt("Name: ");
        String lastName = prompt("Sirname: ");
        String phone = null;
        phone = catchTelephone(phone);
        if(phone == null) {
            return;
        }

        userController.saveUser(new User(firstName, lastName, phone));
    }
    private void delete() throws Exception {
            String userid = prompt("Enter the ID of the user you want to delete: ");
            User _user = userController.readUser(userid);
            userController.deleteUser(_user);
        }
    
    private void showHelp() {
        System.out.println("List of commands:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
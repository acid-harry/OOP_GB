import Lesson_5.Controllers.UserController;
import Lesson_5.Model.FileOperation;
import Lesson_5.Model.FileOperationImpl;
import Lesson_5.Model.Repository;
import Lesson_5.Model.RepositoryFile;
import Lesson_5.Utils.Validate;
import Lesson_5.Views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}
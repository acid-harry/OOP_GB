import Controllers.IController;
import Model.Fields;
import Model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewOperations implements IViewOperations{

    private IController noteController;

    public ViewOperations(IController controller) {
        this.noteController = controller;
    }

    public void read() throws Exception {
        String id = prompt("ID: ");
        Note note = noteController.readNote(id);
        System.out.println(note);
    }

    public void delete() throws Exception{
        String id = prompt("ID: ");
        noteController.deleteNote(id);
    }

    public void update() throws Exception {
        String noteId = prompt("ID: ");
        String fieldName = prompt("What is field (HEAD, TEXT): ");
        String param = prompt("Enter what you want to replace: ");

        Note note = noteController.readNote(noteId);
        noteController.updateNote(note, Fields.valueOf(fieldName.toUpperCase()), param);
    }

    public void list() throws Exception {
        List<Note> noteList = noteController.getNotes();
        for (Note note : noteList){
            System.out.println(note);
        }
    }
    public void create() throws Exception {
        String head = prompt("Header: ");
        String text = prompt("Text: ");

        Note note = new Note(head, text);
        noteController.saveNote(note);
    }

    public void showHelp(){
        System.out.println("Commands list:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}
package model;

import java.util.List;

public class Service {
    private NoteBook noteBook;
    public Service() {
        noteBook = new NoteBook();
    }

    public void addNote(String text){
        Note note = new Note(text);
        noteBook.addNote(note);
    }

    public String getNotes(){
        return noteBook.getNotes().toString();
    }


}

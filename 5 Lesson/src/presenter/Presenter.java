package presenter;

import model.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addRecord(String record) {
        service.addNote(record);
    }

    public void getRecords() {
        String answer = service.getNotes();
        view.print(answer);

    }


}

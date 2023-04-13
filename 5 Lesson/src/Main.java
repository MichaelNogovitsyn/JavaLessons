import model.Service;
import presenter.Presenter;
import view.Console;
import view.View;

public class Main {
    public static void main(String[] args) {

        View view = new Console();
        Service service = new Service();
        Presenter presenter = new Presenter(view, service);

        view.start();

    }
}
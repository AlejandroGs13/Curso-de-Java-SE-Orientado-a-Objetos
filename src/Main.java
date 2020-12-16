import static UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.setName("Alejandro");
        myDoctor.showId();
        Doctor myDoctor2 = new Doctor();
        myDoctor.setName("David");
        myDoctor.showId();
        Doctor myDoctor3 = new Doctor();
        myDoctor.setName("garcia");
        myDoctor.showId();

        showMenu();
    }
}

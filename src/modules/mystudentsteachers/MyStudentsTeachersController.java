package modules.mystudentsteachers;

import mains.Model;
import mains.controllers.PersonController;

import javax.swing.*;

public class MyStudentsTeachersController extends JInternalFrame {
    private MyStudentsTeachersView view;

    public MyStudentsTeachersView getView() {
        return view;
    }

    public MyStudentsTeachersController(PersonController controller, Model model){

    }
}
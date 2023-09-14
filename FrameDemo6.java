import java.awt.*;
import java.awt.event.*;

class Cal {

}

class DemoFrame extends WindowAdapter implements ActionListener {
    public Frame fobj;
    public Button b;
    public TextField t1, t2;
    public Label lb1, lb2, lb3;

    public DemoFrame(String name) {
        fobj = new Frame(name);
        fobj.setSize(500, 500);
        fobj.setVisible(true);
        fobj.setLayout(null);

        lb1 = new Label(" fisrst number");
        lb1.setBounds(5, 50, 170, 30);
        fobj.add(lb1);

        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
        fobj.add(t1);

        t2 = new TextField();
        t2.setBounds(200, 80, 150, 30);
        fobj.add(t2);

        lb2 = new Label("second number");
        lb2.setBounds(5, 80, 150, 30);
        fobj.add(lb2);

        lb3 = new Label("Result");
        lb3.setBounds(90, 140, 150, 30);
        fobj.add(lb3);

        b = new Button("+");
        b.setBounds(90, 200, 100, 30);
        fobj.add(b);

        fobj.addWindowListener(this);
        b.addActionListener(this);

    }

    public void windowClosing(WindowEvent obj) {
        fobj.dispose();
    }

    public void actionPerformed(ActionEvent obj) {
        System.out.println("Hello")
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;

        if (obj.getSource().equals(b)) {
            c = a + b;
            lb3.setText(String.valueOf("Result:" + c));
        }

    }
}

public class FrameDemo6 {
    public static void main(String arg[]) {
        DemoFrame dobj = new DemoFrame("calculater");

    }

}

import javax.swing.*;
import java.awt.*;

public class BMIWithGui {
    public static void main(String[] args) {
        JFrame okienkoDlaAdrianka = new JFrame();
        FlowLayout typZmiennej = new FlowLayout();
        Dimension dim = new Dimension();
        dim.setSize(200, 400);
        okienkoDlaAdrianka.setMinimumSize(dim);
        okienkoDlaAdrianka.setLayout(typZmiennej);
        JLabel tekst = new JLabel("tekst dla Adrianka");
        okienkoDlaAdrianka.add(tekst);
        okienkoDlaAdrianka.setVisible(true);
    }
}

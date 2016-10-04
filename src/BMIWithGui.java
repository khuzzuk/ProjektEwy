import javax.swing.*;
import java.awt.*;

public class BMIWithGui {
    public static void main(String[] args) {
        JFrame okienkoDlaAdrianka = new JFrame();
        GridBagConstraints ramy = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();

        okienkoDlaAdrianka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = okienkoDlaAdrianka.getContentPane();
        contentPane.setBackground(new Color(245,247,255));
        Dimension dim = new Dimension();
        dim.setSize(800, 800);
        okienkoDlaAdrianka.setMinimumSize(dim);
        okienkoDlaAdrianka.setLayout(layout);
        JLabel tekst = new JLabel("Kalkulator BMI");
        okienkoDlaAdrianka.add(tekst);
ramy.gridy = 1;

        JLabel tekst2 = new JLabel("Wpisz swój wzrost");
        okienkoDlaAdrianka.add (tekst2);
        layout.setConstraints(tekst2,ramy);
                JLabel tekst3 = new JLabel("Wpisz swoją wagę");
        okienkoDlaAdrianka.add(tekst3);
        JButton przycisk = new JButton("oblicz");
        okienkoDlaAdrianka.add(przycisk);
        CalculatingBMI akcjaPrzycisku = new CalculatingBMI();
        przycisk.addActionListener(akcjaPrzycisku);
        okienkoDlaAdrianka.setVisible(true);

    }
}

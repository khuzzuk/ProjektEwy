import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Ewunia on 2016-10-04.
 */
/* public class CalculatingBMI  extends AbstractAction {
    public void actionPerformed (ActionEvent e){
        System.out.println("EWa jest fantastyczna!");
    }

}
*/
    public class CalculatingBMI extends AbstractAction{
public void actionPerformed (ActionEvent akcja) {
        JFrame drugieOkienko = new JFrame();
        GridBagConstraints ramy = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        drugieOkienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = drugieOkienko.getContentPane();
        contentPane.setBackground(new Color(230,7,10));
        Dimension dim = new Dimension();
        dim.setSize(400, 400);
        drugieOkienko.setMinimumSize(dim);
        drugieOkienko.setLayout(layout);
        JLabel tekst = new JLabel("Ewa jest fantastyczna");
        drugieOkienko.add(tekst);
        drugieOkienko.setVisible(true);
    }

    }
package Kasir;

import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class targetForm {
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JPanel rootTarget;

    public targetForm() {
        rootTarget.addComponentListener(new ComponentAdapter() {
        });
    }

    public void createLayout(){
         JFrame JFrame = new JFrame("Target Form");
         JFrame.setContentPane(rootTarget);
         JFrame.pack();
         JFrame.setLocationRelativeTo(null);
         JFrame.setVisible(true );
    }
    public void receiveData (String textNama, String textHarga, String textJumlah){
        Label1.setText(textNama);
        Label2.setText(textHarga);
        Label3.setText(textJumlah);
    }
}

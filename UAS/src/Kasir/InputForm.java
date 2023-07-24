package Kasir;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


public class InputForm {
    private JTextField textNama;
    private JTextField textHarga;
    private JTextField textJumlah;
    private JButton nextFormButton;
    private JButton enterButton;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JPanel rootPanel;
    private JButton hapusButton;
    private JButton perbaharuiButton;
    private JButton tambahButton;
    private DefaultTableModel tableModel;


    public InputForm() {
        enterButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(rootPanel, "Stock Barang", "Information", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(rootPanel, "Error on Message", "Error", JOptionPane.ERROR_MESSAGE);
            int result = JOptionPane.showConfirmDialog(rootPanel, "Mohon Melengkapi Isian Data ");
            if (result == JOptionPane.YES_OPTION) {
                String message = JOptionPane.showInputDialog("Input Your Message");
                JOptionPane.showMessageDialog(rootPanel,"Inputted message:   "+message ,"Information",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        nextFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                targetForm targetForm = new targetForm();
                targetForm.createLayout();
                targetForm.receiveData(textNama.getText(), textHarga.getText(), textJumlah.getText());
            }
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("InputForm");
        frame.setContentPane(new InputForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,300);
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Nama");
        columnNames.add("Harga");
        columnNames.add("Jumlah");

        Vector<Vector<Object>> data =new Vector<>();
        data.add(new Vector<Object>(Arrays.asList("Beras", "Rp.15.000", "5")));
        data.add(new Vector<Object>(Arrays.asList("Beras", "Rp.15.000", "5")));
        data.add(new Vector<Object>(Arrays.asList("Beras", "Rp.15.000", "5")));

    }
}

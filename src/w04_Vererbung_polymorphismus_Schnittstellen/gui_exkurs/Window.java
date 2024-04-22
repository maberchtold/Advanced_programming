package w04_Vererbung_polymorphismus_Schnittstellen.gui_exkurs;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    JLabel name;
    JLabel vorname;
    JLabel pizza;
    JTextField tfName;
    JTextField tfVorname;
    JTextField tfPizza;
    JButton reset;
    JButton order;
    public Window(){
        setLayout(new GridLayout(0,2));

        name = new JLabel("Name");
        vorname = new JLabel("Vorname");
        pizza = new JLabel("Pizza");
        tfName = new JTextField();
        tfVorname = new JTextField();
        tfPizza = new JTextField();
        reset = new JButton("Reset");
        order = new JButton("Order");

        add(name);
        add(tfName);
        add(vorname);
        add(tfVorname);
        add(pizza);
        add(tfPizza);
        add(reset);
        add(order);
    }
    public static void main(String[] args) {

        Window f = new Window();
        f.setSize(800,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

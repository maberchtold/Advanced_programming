package w05_exceptions.gui_exkurs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        ActionHandler ah = new ActionHandler();
        reset.addActionListener(ah);
        order.addActionListener(ah);

        add(name);
        add(tfName);
        add(vorname);
        add(tfVorname);
        add(pizza);
        add(tfPizza);
        add(reset);
        add(order);
    }

    class ActionHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == reset){
                tfName.setText("");
                tfVorname.setText("");
                tfPizza.setText("");
            }
            if(e.getSource() == order){
                System.out.println("Bestellung von " + tfName.getText() + " " + tfVorname.getText() + " Pizza: "+ tfPizza.getText());
            }
        }
    }


}

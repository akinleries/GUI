package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsUserInterface implements ActionListener {
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    int count = 0;
    public GraphicsUserInterface() {

             frame = new JFrame();

            JButton button = new JButton();
            button.addActionListener(this);
              label = new JLabel("Number of clicks");
              panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 3));
            panel.setLayout(new GridLayout(0, 1));
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("our GUI");
            frame.pack();
            frame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks : " + count);

    }

    public static void main(String[] args) {
        new GraphicsUserInterface();

    }

}

package za.co.diputu.view;

import za.co.diputu.SpringUtilities;

import javax.swing.*;

public class NewHero extends JFrame {

    private JTextField HeroName  = new JTextField(15);

    public void SetWindow() {
        final JFrame frame = new JFrame("JTextField Demo");

        JLabel lblFName = new JLabel("First Name:");
        JTextField tfFName = new JTextField(20);
        lblFName.setLabelFor(tfFName);

        JLabel lblLName = new JLabel("Last Name:");
        JTextField tfLName = new JTextField(20);
        lblLName.setLabelFor(tfLName);

        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());

        panel.add(lblFName);
        panel.add(tfFName);
        panel.add(lblLName);
        panel.add(tfLName);

        SpringUtilities.makeCompactGrid(panel,
                2, 2,  //rows, cols
                6, 6,  //initX, initY
                6, 6); //xPad, yPad

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public int getHeroName(){
        return Integer.parseInt(HeroName.getText());
    }
}


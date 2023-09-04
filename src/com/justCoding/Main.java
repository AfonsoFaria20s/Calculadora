package com.justCoding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static double first_number;
    public static double second_number;
    public static double numbers;
    public static int index;

    public static void main(String[] args) throws InterruptedException {

        Color aC = new Color(142, 199, 240);
        Color bC = new Color(109, 152, 184);
        Color cC = new Color(153, 160, 255);
        Color cin = new Color(77, 77, 77);
        Color vC = new Color(201, 230, 159);

        // Data-Base connection

        // Calculator Frame

        JFrame principal_frame = new JFrame("Calculadora");
        JPanel panel = new JPanel();
        ImageIcon icon = new ImageIcon("C:\\Users\\Utilizador\\IdeaProjects\\Calculadora\\src\\images\\calc.jpg");
        principal_frame.setSize(350, 450);
        principal_frame.setLayout(null);
        principal_frame.setResizable(false);
        principal_frame.setDefaultCloseOperation(principal_frame.EXIT_ON_CLOSE);
        principal_frame.setIconImage(icon.getImage());
        principal_frame.setLocationRelativeTo(null);
        principal_frame.setVisible(true);
        panel.setLayout(null);
        panel.setSize(350, 450);
        panel.setVisible(true);
        principal_frame.add(panel);

        JButton one = new JButton("1");
        one.setBorderPainted(false);
        JButton two = new JButton("2");
        two.setBorderPainted(false);
        JButton three = new JButton("3");
        three.setBorderPainted(false);
        JButton four = new JButton("4");
        four.setBorderPainted(false);
        JButton five = new JButton("5");
        five.setBorderPainted(false);
        JButton six = new JButton("6");
        six.setBorderPainted(false);
        JButton seven = new JButton("7");
        seven.setBorderPainted(false);
        JButton eight = new JButton("8");
        eight.setBorderPainted(false);
        JButton nine = new JButton("9");
        nine.setBorderPainted(false);
        JButton equals = new JButton("=");
        equals.setBorderPainted(false);
        JButton plus = new JButton("+");
        plus.setBorderPainted(false);
        JButton minus = new JButton("-");
        minus.setBorderPainted(false);
        JButton divide = new JButton("÷");
        divide.setBorderPainted(false);
        JButton times = new JButton("x");
        times.setBorderPainted(false);

        one.setBounds(10, 320, 60, 60);
        one.setBackground(cC);
        one.setVisible(true);
        panel.add(one);
        two.setBounds(80, 320, 60, 60);
        two.setBackground(cC);
        two.setVisible(true);
        panel.add(two);
        three.setBounds(150, 320, 60, 60);
        three.setBackground(cC);
        three.setVisible(true);
        panel.add(three);
        four.setBounds(10, 250, 60, 60);
        four.setBackground(cC);
        four.setVisible(true);
        panel.add(four);
        five.setBounds(80, 250, 60, 60);
        five.setBackground(cC);
        five.setVisible(true);
        panel.add(five);
        six.setBounds(150, 250, 60, 60);
        six.setBackground(cC);
        six.setVisible(true);
        panel.add(six);
        seven.setBounds(10, 180, 60, 60);
        seven.setBackground(cC);
        seven.setVisible(true);
        panel.add(seven);
        eight.setBounds(80, 180, 60, 60);
        eight.setBackground(cC);
        eight.setVisible(true);
        panel.add(eight);
        nine.setBounds(150, 180, 60, 60);
        nine.setBackground(cC);
        nine.setVisible(true);
        panel.add(nine);

        equals.setBounds(220, 320, 105, 60);
        equals.setVisible(true);
        equals.setBackground(aC);
        panel.add(equals);
        plus.setBounds(220, 180, 50, 62);
        plus.setBackground(bC);
        plus.setVisible(true);
        panel.add(plus);
        minus.setBounds(274, 180, 50, 62);
        minus.setBackground(bC);
        minus.setVisible(true);
        panel.add(minus);
        divide.setBounds(220, 250, 50, 62);
        divide.setBackground(bC);
        divide.setVisible(true);
        panel.add(divide);
        times.setBounds(274, 250, 50, 62);
        times.setBackground(bC);
        times.setVisible(true);
        panel.add(times);

        JMenuBar mb = new JMenuBar();
        JMenu home = new JMenu("Mais");
        JMenu history = new JMenu("Historico");
        // JMenu breve = new JMenu("breve");
        mb.add(home);
        mb.add(history);
        // mb.add(breve);
        principal_frame.setJMenuBar(mb);

        JMenuItem normal = new JMenuItem("Calculadora Normal");
        JMenuItem cientifica = new JMenuItem("Calculadora Cientifica");
        home.add(normal);
        home.addSeparator();
        home.add(cientifica);

        JMenuItem futurmente = new JMenuItem("Futuramente");
        history.add(futurmente);

        JButton lin1 = new JButton();
        lin1.setBounds(0, 165, 360, 3);
        lin1.setEnabled(false);
        lin1.setBackground(cin);
        lin1.setVisible(true);
        panel.add(lin1);
        JButton lin2 = new JButton();
        lin2.setEnabled(false);
        lin2.setBounds(213, 95, 3, 500);
        lin2.setBackground(cin);
        lin2.setVisible(true);
        panel.add(lin2);
        JButton lin3 = new JButton();
        lin3.setEnabled(false);
        lin3.setBounds(0, 95, 500, 3);
        lin3.setBackground(cin);
        lin3.setVisible(true);
        panel.add(lin3);

        JLabel calculation = new JLabel("Calculo");
        calculation.setFont(new Font("Arial", Font.PLAIN, 20));
        calculation.setBounds(10, 10, 500, 20);
        calculation.setVisible(true);
        panel.add(calculation);
        JLabel result = new JLabel("Resultado");
        result.setFont(new Font("Arial", Font.PLAIN, 10));
        result.setBounds(218, 100, 50, 10);
        result.setVisible(true);
        panel.add(result);

        JRadioButton ON = new JRadioButton("ON");
        JRadioButton OFF = new JRadioButton("OFF");
        ON.setBounds(10, 105, 70, 20);
        ON.setVisible(true);
        ON.setSelected(true);
        OFF.setBounds(10, 135, 70, 20);
        OFF.setVisible(true);
        panel.add(ON);
        panel.add(OFF);

        final JLabel[] Result = { new JLabel("      N/A") };
        Result[0].setFont(new Font("Arial", Font.PLAIN, 20));
        Result[0].setBounds(220, 120, 130, 40);
        Result[0].setVisible(true);
        panel.add(Result[0]);

        JLabel calc = new JLabel("");
        calc.setFont(new Font("Arial", Font.PLAIN, 30));
        calc.setBounds(10, 40, 500, 40);
        calc.setVisible(true);
        panel.add(calc);

        ON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OFF.setSelected(false);
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                seven.setEnabled(true);
                eight.setEnabled(true);
                nine.setEnabled(true);

                equals.setEnabled(true);
                plus.setEnabled(true);
                minus.setEnabled(true);
                divide.setEnabled(true);
                times.setEnabled(true);
            }
        });
        OFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ON.setSelected(false);
                one.setEnabled(false);
                two.setEnabled(false);
                three.setEnabled(false);
                four.setEnabled(false);
                five.setEnabled(false);
                six.setEnabled(false);
                seven.setEnabled(false);
                eight.setEnabled(false);
                nine.setEnabled(false);

                equals.setEnabled(false);
                plus.setEnabled(false);
                minus.setEnabled(false);
                divide.setEnabled(false);
                times.setEnabled(false);
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "2");
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText(calc.getText() + "9");
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_number = Integer.valueOf(calc.getText()).intValue();
                calc.setText("");
                index = 1;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_number = Integer.valueOf(calc.getText()).intValue();
                calc.setText("");
                index = 2;
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_number = Integer.valueOf(calc.getText()).intValue();
                calc.setText("");
                index = 3;
            }
        });

        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_number = Integer.valueOf(calc.getText()).intValue();
                calc.setText("");
                index = 4;
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                second_number = Integer.valueOf(calc.getText()).intValue();
                if (index == 1) {
                    numbers = first_number + second_number;
                } else if (index == 2) {
                    numbers = first_number - second_number;
                } else if (index == 4) {
                    numbers = first_number * second_number;
                } else if (index == 3) {
                    numbers = first_number / second_number;
                }
                Result[0].setText(String.valueOf(numbers));
                calc.setText("");
            }
        });

        JButton clear = new JButton("C");
        clear.setVisible(true);
        clear.setBorderPainted(false);
        clear.setBackground(vC);
        clear.setBounds(155, 107, 50, 50);
        panel.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc.setText("");
            }
        });

        JButton clearAll = new JButton("CA");
        clearAll.setVisible(true);
        clearAll.setBorderPainted(false);
        clearAll.setBackground(vC);
        clearAll.setBounds(95, 107, 50, 50);
        panel.add(clearAll);
        clearAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result[0].setText("");
                calc.setText("");
            }
        });

        ON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear.setEnabled(true);
                ON.setEnabled(false);
                OFF.setEnabled(true);
                clearAll.setEnabled(true);
            }
        });
        OFF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear.setEnabled(false);
                OFF.setEnabled(false);
                ON.setEnabled(true);
                clearAll.setEnabled(false);
                Result[0].setText("");
                calc.setText("");
            }
        });

        panel.revalidate();
    }
}
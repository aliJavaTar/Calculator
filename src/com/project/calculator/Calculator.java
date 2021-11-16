package com.project.calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel calculator;
    private JTextField textDisplay;
    private JButton btnPower;
    private JButton btnLog;
    private JButton btnAc;
    private JButton btnZ;
    private JButton button5;
    private JButton  btnSqrt;
    private JButton btnSin;
    private JButton btnP1;
    private JButton btn7;
    private JButton btn4;
    private JButton btnLn;
    private JButton btnCos;
    private JButton btnP2;
    private JButton btn8;
    private JButton btn5;
    private JButton btnPi;
    private JButton btnTan;
    private JButton btnDelete;
    private JButton btn9;
    private JButton btn6;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSubtract;
    private JButton btn0;
    private JButton btnDecimal;
    private JButton btnEqual;
    private JButton btnDivision;

    private void btn0ActionPerformed(ActionEvent event)
    {
        textDisplay.setText(textDisplay.getText()+"0");
    }

    public Calculator() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        btnPower.addActionListener(listener);
        btnSqrt.addActionListener(listener);
        btnSin.addActionListener(listener);
        btnP1.addActionListener(listener);
        btn7.addActionListener(listener);
        btn4.addActionListener(listener);
        btnLn.addActionListener(listener);
        btnLog.addActionListener(listener);
        btnZ.addActionListener(listener);
        button5.addActionListener(listener);
        btnCos.addActionListener(listener);
        btnP2.addActionListener(listener);
        btn8.addActionListener(listener);
        btnPi.addActionListener(listener);
        btnTan.addActionListener(listener);
        btnDelete.addActionListener(listener);
        btn9.addActionListener(listener);
        btn6.addActionListener(listener);
        btn5.addActionListener(listener);
        btnAc.addActionListener(listener);
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn0.addActionListener(listener);

        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn0ActionPerformed(event);
            }
        });


        btnDecimal.addActionListener(listener);
        btnEqual.addActionListener(listener);
        btnDivision.addActionListener(listener);
        btnSubtract.addActionListener(listener);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new Calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


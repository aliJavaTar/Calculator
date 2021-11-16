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
    private JButton btnTan;
    private JButton btnSqrt;
    private JButton btnSin;
    private JButton btnP1;
    private JButton btnLn;
    private JButton btnCos;
    private JButton btnP2;
    private JButton btnSubtract;
    private JButton btnDecimal;
    private JButton btnEqual;
    private JButton btnDivision;
    private JButton btnPi;
    private JButton btnDelete;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnAdd;


    private void btn0ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn0.getText());
    }

    private void btn1ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn1.getText());
    }

    private void btnPiActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + Math.PI);
    }

    private void btn2ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn2.getText());
    }

    private void btn3ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn3.getText());

    }
    private void btnZActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnZ.getText());
    }

    private void btn4ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn4.getText());
    }

    private void btn5ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn5.getText());
    }

    private void btn6ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn6.getText());
    }

    private void btn7ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn7.getText());
    }

    private void btn8ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn8.getText());
    }

    private void btn9ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btn9.getText());

    }
    private void btnSubtractActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnSubtract.getText());

    }

    private void btnSinActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnSin.getText());
    }

    private void btnPowerActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnPower.getText());
    }

    private void btnDivisionActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnDivision.getText());
    }

    private void btnAddActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnAdd.getText());
    }

    private void btnAcActionPerformed(ActionEvent event) {
        textDisplay.setText("");
    }

    private void BtnDeleteActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText().substring(0, textDisplay.getText().length() - 1));
    }

    private void btnDecimalActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnDecimal.getText());
    }

    private void btnLnActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnLn.getText());
    }
    private void btnEqualActionPerformed(ActionEvent event)
    {
        Calculate calculate = new Calculate();
        calculate.evaluation(textDisplay.getText(),true);
    }
    private void btnSqrtActionPerformed(ActionEvent e) {
        textDisplay.setText(textDisplay.getText() + btnSqrt.getText());
    }

    private void btnP2ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnP2.getText());
    }

    private void btnP1ActionPerformed(ActionEvent event) {
        textDisplay.setText(textDisplay.getText() + btnP1.getText());
    }

    public Calculator() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        btnPower.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btnPowerActionPerformed(event);
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                BtnDeleteActionPerformed(event);
            }
        });
        btnAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAcActionPerformed(e);
            }
        });
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btnSinActionPerformed(event);
            }
        });
        btnP1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btnP1ActionPerformed(event);
            }
        });
        btnLn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn0ActionPerformed(event);
            }
        });
        btnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn0ActionPerformed(event);
            }
        });
        btnZ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btnZActionPerformed(event);
            }
        });
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn0ActionPerformed(event);
            }
        });
        btnP2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btnP2ActionPerformed(event);
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDecimalActionPerformed(e);
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn9ActionPerformed(event);
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn8ActionPerformed(event);
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn7ActionPerformed(event);
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn6ActionPerformed(event);
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn5ActionPerformed(event);
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn4ActionPerformed(event);
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn3ActionPerformed(event);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn2ActionPerformed(event);
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn1ActionPerformed(event);
            }
        });
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                btn0ActionPerformed(event);
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                btnEqualActionPerformed(event);
            }
        });
        btnSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSqrtActionPerformed(e);
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSubtractActionPerformed(e);
            }
        });
        btnPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPiActionPerformed(e);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAddActionPerformed(e);
            }
        });
        btnEqual.addActionListener(listener);
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDivisionActionPerformed(e);
            }
        });
        btnAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAcActionPerformed(e);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new Calculator().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


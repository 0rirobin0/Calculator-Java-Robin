package CalculatorApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;






public class CalApp implements ActionListener {
                                    //Variables
    double num1=0,num2=0,Result=0;
    int Calculation;










                                       //Swing Javaframe Class Object Declaration//
    JFrame frame=new JFrame("Calculator-Robin");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("ON");
    JRadioButton offRadioButton = new JRadioButton("OFF");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("Clr");
    JButton buttonDelete = new JButton("Del");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonCube = new JButton("x\u00B3");
    JButton buttonCubert = new JButton("\u221Bx");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221Ax");
    JButton buttonpercent = new JButton("\u0025");



                                              //UserGraphics Methods//

    //frame
    public void prepareGUI()
    {
        frame.setSize(305,600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
                                                    //Components Methods


    public void AddComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10, 40, 270, 60);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,100,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.red);
        frame.add(onRadioButton);

        offRadioButton.setBounds(80,100,60,40);
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setSelected(false);
        frame.add(offRadioButton);

        //help to select one Button
        ButtonGroup Buttongrp= new ButtonGroup();
        Buttongrp.add(onRadioButton);
        Buttongrp.add(offRadioButton);


        buttonZero.setBounds(10, 510, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonOne.setBounds(10, 450, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 450, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 450, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonFour.setBounds(10, 390, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 390, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 390, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonSeven.setBounds(10, 330, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 330, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 330, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);


        buttonDot.setBounds(150, 510, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);


        buttonEqual.setBounds(220, 450, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.DARK_GRAY);
        buttonEqual.setForeground(Color.white);
        frame.add(buttonEqual);


        buttonDiv.setBounds(220, 270, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(Color.BLACK);
        buttonDiv.setForeground(Color.white);
        frame.add(buttonDiv);


        buttonMul.setBounds(220, 210, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(Color.BLACK);
        buttonMul.setForeground(Color.WHITE);


        frame.add(buttonMul);

        buttonMinus.setBounds(220, 330, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.black);
        buttonMinus.setForeground(Color.white);
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 390, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.black);
        buttonPlus.setForeground(Color.white);
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 270, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(Color.orange);
        frame.add(buttonSquare);

        buttonSqrt.setBounds(10, 270, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(Color.orange);
        frame.add(buttonSqrt);


        buttonReciprocal.setBounds(150, 270, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(Color.orange);
        frame.add(buttonReciprocal);


        buttonDelete.setBounds(150, 150, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.black);
        frame.add(buttonDelete);

        buttonClear.setBounds(220, 150, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.black);
        frame.add(buttonClear);

        buttonCube.setBounds(80, 210, 60, 40);
        buttonCube.setFont(new Font("Arial", Font.BOLD, 20));
        buttonCube.setBackground(Color.orange);
        frame.add(buttonCube);

        buttonCubert.setBounds(10, 210, 60, 40);
        buttonCubert.setFont(new Font("Arial", Font.BOLD, 20));
        buttonCubert.setBackground(Color.orange);
        frame.add(buttonCubert);


        buttonpercent.setBounds(150, 210, 60, 40);
        buttonpercent.setFont(new Font("Arial", Font.BOLD, 12));
        buttonpercent.setBackground(Color.orange);
        buttonpercent.setForeground(Color.black);
        frame.add(buttonpercent);

    }
                                  //Action Listener Event//24 Button

    public void addActionEvent()
    {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonCube.addActionListener(this);
        buttonCubert.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonpercent.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDot.addActionListener(this);









    }










                                              //Constructor for call methods
    CalApp(){
        prepareGUI();
        AddComponents();
        addActionEvent();





    }




                                               //Main Class//
    public static void main(String[] args) {

        CalApp Calculator=new CalApp();







    }

      //created method for ActionListner Abstract class which is implemented
    @Override
    public void actionPerformed(ActionEvent e) {

        //action will be performed for each button

        Object source=e.getSource();

        //when Calculator is ON
        if(source==onRadioButton)
        {
        enable(); //enable method will works!
        }else if(source==offRadioButton)
        {
            disable();
        }




    }
    //creating enable method
    public void enable()
    {

      onRadioButton.setEnabled(false);
      offRadioButton.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonCube.setEnabled(true);
        buttonCubert.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonpercent.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonDot.setEnabled(true);
    }



    //Creating Disable Method

    public void disable()
    {

        onRadioButton.setEnabled((true));
        offRadioButton.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonCube.setEnabled(false);
        buttonCubert.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonpercent.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonDot.setEnabled(false);
    }





}

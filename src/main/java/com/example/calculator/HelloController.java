package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public TextField display;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btnPlus;
    public Button btnDivide;
    public Button btnMultiply;
    public Button btnEquel;
    public Button clear;
    public Label label1;

    private int operand1;
    private int operand2;

    private String oper1 = "";
    private String oper2 = "";

    private int flag;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label1.setFont(Font.font("Arial Black", 26));
        label1.setTextFill(Color.GREEN);
    }

    public void addition(ActionEvent actionEvent) {
        this.operand1 = Integer.parseInt(display.getText());
        this.flag = 0;
        display.setText("");
    }

    public void clearDisplay(ActionEvent actionEvent) {
        display.setText("");
    }

    public void clickBtn8(ActionEvent actionEvent) {
        if (display.getText().equals("")){
            oper1 = "8";
        }else{
            oper1 = display.getText()+"8";
            oper1 = display.getText()+"1";
        }
        display.setText(oper1);
    }

    public void clickBtn1(ActionEvent actionEvent) {
        if (display.getText().equals("")){
            oper1 = "1";
        }else{
            oper1 = display.getText()+"8";
            oper1 = display.getText()+"1";
        }
        display.setText(oper1);
    }

    public void clickBtn9(ActionEvent actionEvent) {
        if (display.getText().equals("")){
            oper1 = "9";
        }else{
            oper1 = display.getText()+"9";
        }
        display.setText(oper1);
    }

    public void calculate(ActionEvent actionEvent) {
        this.operand2 = Integer.parseInt(display.getText());
        switch (flag){
            case 0:
                display.setText(String.valueOf(this.operand1+this.operand2));
                break;
            case 1:
                display.setText(String.valueOf(this.operand1-this.operand2));
                break;
            case 2:
                display.setText(String.valueOf(this.operand1*this.operand2));
                break;
            case 3:
                display.setText(String.valueOf(this.operand1/this.operand2));
                break;
            default:
                display.setText("Error operation");
        }
    }



}




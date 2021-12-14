package com.lab33;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        args= new String[]{"0.5", "0.5", "-3.2", "2.8", "0.1", "6.4"};//коэффициенты многочлена
        if(args.length==0){
            System.out.println("Невозможео табулировать многочлен, для которого" +
                    " не задано ни одного коэффициента!");
            System.exit(-1);
        }
        double[] coefficients=new double[args.length];
        int i=0;
        try{
            for(String arg: args){
                coefficients[i++]=Double.parseDouble(arg);
            }
        }catch (NumberFormatException ex){
            System.err.println("Ошибка преобразования строки '"+ args[i] +
                    "' в число типа Double");
            System.exit(-2);
        }
        MainFrame frame=new MainFrame(coefficients);//создание интерфейса
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

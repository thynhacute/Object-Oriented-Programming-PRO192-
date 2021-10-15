/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;
/**
 *
 * @author NhaThy
 */

public class MyToys {
    private static Scanner sc = new Scanner(System.in);
    public static int getAChoice(String inputMsg, String errorMsg, int lowerBound,
            int upperBound){
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        int n;
        while(true){
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if(n < lowerBound || n > upperBound)
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound){
        int n;
        while(true){
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if(n < lowerBound)
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    public static double getAnDouble(String inputMsg, String errorMsg, double lowerBound){
        double i;
        while(true){
            try {
                System.out.println(inputMsg);
                i = Double.parseDouble(sc.nextLine());
                if(i < lowerBound)
                    throw new Exception();
                return i;
            } catch (Exception e) {
                System.out.println("Error! Please input the number greater than" + lowerBound + ".");
            }
        }
    }
    public static String getString(String inputMsg, String errorMsg) {
        String code;
        while(true){
            System.out.println(inputMsg);
            code = sc.nextLine().trim();
            if(code.length() == 0 || code.isEmpty())
                System.out.println(errorMsg);
            else
                return code;
        }
    }
    public static String getCode(String inputMsg, String errorMsg){
        String code;
        while(true){
            System.out.println(inputMsg);
            code = sc.nextLine().trim().toUpperCase();
            if(code.length() == 0 || code.isEmpty())
                System.out.println(errorMsg);
            else
                return code;
        }
    }
    
}

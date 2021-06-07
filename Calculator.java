package com.calculator2;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable{
    private ArrayList<String> operations = new ArrayList<>();
    private double result = 0;

    public void performOperations(Object input){
        String stringInput = String.valueOf(input);
        operations.add(stringInput);
        if(stringInput.equals("=")) {
            operations.remove(operations.size()-1);

            //Multiply and Divide First
            int i = 0;
            while (i < operations.size() && !operations.isEmpty()) {

                if(operations.get(i).equals("*")) {

                    double num1 = Double.parseDouble(operations.get(i-1));
                    double num2 = Double.parseDouble(operations.get(i+1));
                    String num = String.valueOf(num1 * num2);
                    operations.remove(i);
                    operations.remove(i);
                    operations.remove(i-1);
                    operations.add(i-1,num);
                    i=0;

                } else if(operations.get(i).equals("/")) {

                    double num1 = Double.parseDouble(operations.get(i-1));
                    double num2 = Double.parseDouble(operations.get(i+1));
                    String num = String.valueOf(num1 / num2);
                    operations.remove(i);
                    operations.remove(i);
                    operations.remove(i-1);
                    operations.add(i-1,num);
                    i=0;

                }
                i++;
            }

            //Add and Subtract last
            int j = 0;
            while (j < operations.size() && !operations.isEmpty()) {

                if(operations.get(j).equals("+")) {

                    double num1 = Double.parseDouble(operations.get(j-1));
                    double num2 = Double.parseDouble(operations.get(j+1));
                    String num = String.valueOf(num1 + num2);
                    operations.remove(j);
                    operations.remove(j);
                    operations.remove(j-1);
                    operations.add(j-1,num);
                    j=0;

                } else if(operations.get(j).equals("-")) {

                    double num1 = Double.parseDouble(operations.get(j-1));
                    double num2 = Double.parseDouble(operations.get(j+1));
                    String num = String.valueOf(num1 - num2);
                    operations.remove(j);
                    operations.remove(j);
                    operations.remove(j-1);
                    operations.add(j-1,num);
                    j=0;

                }
                j++;
            }

        }
        //final answer will be the only thing left in array
        result = Double.parseDouble(operations.get(0));
    }

    public double getResults() {
        operations.remove(0);
        return result;
    }

}

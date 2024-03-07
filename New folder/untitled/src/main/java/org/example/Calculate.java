
package org.example;
public class Calculate{
    public int sum(int number1,int number2){
        return  number1 +number2;
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate();
        int result = obj.sum(45,54);
        System.out.print(result);
    }
}
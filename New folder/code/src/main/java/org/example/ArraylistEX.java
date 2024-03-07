package org.example;
import java.util.Scanner;
import  java.util.ArrayList;
public class ArraylistEX {
    public static void main(String[] args) {
        //syntax

        ArrayList<Integer> list = new ArrayList<>(10);
       /*list.add(54);
        list.add(544);
        list.add(542);
        list.add(541);
        list.add(544);
        list.add(5445);
        System.out.println(list.set(0,104));
        list.add(524);
        System.out.println( list.contains(54));
        System.out.println(list);
list.remove(3);


        System.out.println(list);
    }

}*/
        Scanner in =  new Scanner(System .in );

        for(int k = 0; k <10 ; k++) {
            list.add(in.nextInt());
                    }
        for (int j = 0; j <10;j++) {
System.out.println(list.get(j));
    }
        System.out.println(list);
}}
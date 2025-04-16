package org.example;
import org.example.feature;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        feature f=new feature();
        int result = f.add(5,3);
        System.out.println("Result: " + result);
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
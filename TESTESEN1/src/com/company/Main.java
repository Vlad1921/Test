package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fut = 0;
        float cm = 0;
        System.out.println("Введите фут или сантиметры");
        String choice = input.nextLine();

        if (Objects.equals(choice, "фут")){
            cm = input.nextFloat();
            fut = getFut(cm);
            System.out.println(fut);
        } else {
            fut = input.nextFloat();
            cm = getCm(fut);
            System.out.println(cm);
        }
    }

    public static float getCm(float fut) {
        return (float) (fut * 30.48);
    }

    public static float getFut(float cm) {
        return (float) (cm / 30.48);
    }
}
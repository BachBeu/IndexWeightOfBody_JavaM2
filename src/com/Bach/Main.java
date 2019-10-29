package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng: ");
        weight = sc.nextFloat();
        System.out.println("Nhập vào chiều cao: ");
        height = sc.nextFloat();
        float BMI = weight/(height*height);
        if(BMI<18.5){
            System.out.println("Chỉ sô" + BMI + "của bạn là Underweight");
        }else if(BMI < 25){
            System.out.println("Chỉ sô" + BMI + "của bạn là Normal");
        }else if(BMI < 30){
            System.out.println("Chỉ sô" + BMI + "của bạn là Overweight");
        }else{
            System.out.println("Chỉ sô" + BMI + "của bạn là Obese");
        }
    }
}

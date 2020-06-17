package com.kpcompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int a= in.nextInt();
    if(a>99||a<10){
        System.out.println("Введите двузначное число");
        return;
    }
    System.out.println(a/10);






    }
}

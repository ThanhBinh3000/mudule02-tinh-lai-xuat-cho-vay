package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double menny = 0;
    double hybrid = 1.0;
    int month = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số tiền");
        menny = sc.nextDouble();
        System.out.println("mời nhập lãi xuất");
        hybrid = sc.nextDouble();
        System.out.println("mời nhập thời gian");
        month = sc.nextInt();
        double tien =0;
        for (int i =0;i<month;i++){
            tien = menny*(hybrid/100/12)*3;
        }
        System.out.println("số tiền lãi cho vay là: "+tien + "$");
    }
}

package com.kirthika;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d",factorial(num));
    }

    public static int factorial(int num){
        return (num==1||num==0)?1:num*factorial(num-1);
    }
}

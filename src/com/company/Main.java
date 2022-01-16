package com.company;

public class Main {
    public static void main(String[] args) {
	    System.out.println(Fibonacci(6));
    }
    public static int Fibonacci(int n){
        if (n>2){
            return Fibonacci(n-1)+Fibonacci(n-2);
        }else{
            return 1*n;
        }
    }
}

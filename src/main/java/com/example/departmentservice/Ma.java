package com.example.departmentservice;

import java.util.ArrayList;
import java.util.List;

public class Ma {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=454;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

        String original = "Harshita";
        String reverse = "";
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        System.out.println(reverse);
    }


}

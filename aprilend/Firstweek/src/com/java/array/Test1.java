package com.java.array;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String[] arr= {"99", "21", "72","78", "43"};
        System.out.println(largestNumber(arr));

        String str="akshay";
        System.out.println(findFirstNonRepeatingCharacter(str));

    }



    //write a java code to form the largest number using integer array

    public static String largestNumber(String[] arr){
        Arrays.sort(arr,(num1, num2)->(num1+num2).compareTo(num2+num1));

        StringBuilder str= new StringBuilder();
        for(String s:arr){
            str.append(s);
        }
        return str.toString();
    }

    //write a java code to find first non repeating character in string

    public static int findFirstNonRepeatingCharacter(String s){
        for(int i=0; i<s.length();i++){
            char c =s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }

}

package com.java.array;

import java.util.Arrays;
import java.util.List;

public class StringProb2 {
    public static void main(String[] args) {


        String str1 = "akshay";
        String str3 = "akshay";
        String str2 = "ashish";

        String generated = String.valueOf(new StringBuilder(str1).hashCode());
        String generated2 =String.valueOf(new StringBuilder(str3).hashCode());
        System.out.println(generated);
        System.out.println(generated2);

        System.out.println("***************************************************");


        List<String> words= Arrays.asList("hello", "world", "stream", "Flatmap");

        List<String> distinctLetters =words.stream()
                .map(word->word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        System.out.println(distinctLetters);
        System.out.println("**************************************************");

        //find the words start with given letter
        List<String> startswith =words.stream()
                .filter(word->word.startsWith("h"))
                .toList();
        System.out.println(startswith);
        System.out.println("***************************************************");

        String str5 ="nayan";
        System.out.println(checkPaLindrome(str5));


    }

    public static boolean checAnagram(String str1, String str2){
        str1=str1.replaceAll("//s", " ");
        str2=str2.replaceAll("//s", " ");
        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());

    }

    public static boolean checkPaLindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }
}

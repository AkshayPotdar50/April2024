package com.java.array;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class IteratorExample{
    public static void main(String[] args) {

        // Example with List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("iterating over list");
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("*****************************************");

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("iterating over set");
        Iterator<Integer> setIterator= set.iterator();
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("iterating over map");
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        while(mapIterator.hasNext()){
            Map.Entry<String, Integer> entry = mapIterator.next();
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        //using enhanced for loop
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }


    }
}

class Person1 implements Cloneable{

     String name;

     public Person1(String name){
         this.name=name;
     }

    @Override
    public Person1 clone() {
        try {
            Person1 clone = (Person1) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
public class Test24 {
    public static void main(String[] args) {
        Person1 person= new Person1("akshay");
        Person1 person1 = person;
        Person1 person3 = new Person1("akshay");

        System.out.println(person.name);
        System.out.println(person1.name);
        System.out.println(person3.clone().name);


        /*******************************************/
        System.out.println("***************************************");

        String [] array1 ={"akshay", "kolhapur", "iitm", "ashta", "gauri"};
        String Longest = Arrays.stream(array1)
                .reduce((str1, str2)->str1.length()>str2.length() ?str1:str2).get();
        String Shortest = Arrays.stream(array1).reduce((str1, str2)->str1.length()<str2.length() ?str1:str2).get();

        System.out.println(Longest +" "+Shortest);
        /**************************************************/
        System.out.println("*******************************************");


        List<String> list = new ArrayList<>();
        list.add("akshay");
        list.add("kehsav");

        Iterator<String> iterator= list.iterator();
        list.add("smita");
        try{
            while(iterator.hasNext()){
                String item = iterator.next();
                System.out.println(item);
            }
        }catch (Exception e){
            System.out.println("Exception" +e.getClass().getSimpleName());
        }
        System.out.println("***********************************************************");

        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("item 1");
        list1.add("item2");
        list1.add("item3");

        Iterator<String> iterator1 =list1.iterator();
        list1.add("new item");

        while(iterator1.hasNext()){
            String item = iterator1.next();
            System.out.println(item);
        }

        System.out.println("**************************************************");

        //convert half string uppercase and half into lowercase
        String example ="this is practice session to get job";
        int mid=example.length()/2;
        StringBuilder uppercase= new StringBuilder();
        StringBuilder lowecase = new StringBuilder();
        for(int i=0; i<example.length(); i++){
            if(i<mid){
                lowecase.append(Character.toLowerCase(example.charAt(i)));
            }else{
                uppercase.append(Character.toUpperCase(example.charAt(i)));
            }
        }
        System.out.println(lowecase +uppercase.toString());

        String input4 ="hello world 123";
        long vowelCount =input4.chars()
                .mapToObj((ch)-> (char)ch)
                .map(Character::toLowerCase)
                .filter(ch->"aeiou".contains(String.valueOf(ch)))
                .count();
        System.out.println(vowelCount);
        System.out.println("********************************************");

        long consonantCount =input4.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .filter(ch->Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch))).count();
        System.out.println(consonantCount);

    }

}

package course.Daniel.Java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        treeSetDemo();

    }
    public static void treeSetDemo(){

        //set Methods
        //add,remove
        Set<String> names = new TreeSet<>();


        System.out.println(names.add("Codee"));//true
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Mike"));//true
        System.out.println(names.add("Dave"));//true
        System.out.println(names.add("Moe"));//true
        System.out.println(names.add("Moana"));//true
        System.out.println(names.add("Maui"));//true

        names.forEach(System.out::println);
    }

    public static void hashsetDemo(){
        //set Methods
        //add,remove
        Set<String> names = new HashSet<>();


        System.out.println(names.add("Codee"));//true
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Codee"));//false
        System.out.println(names.add("Mike"));//true
        System.out.println(names.add("Dave"));//true
        System.out.println(names.add("Moe"));//true
        System.out.println(names.add("Moana"));//true
        System.out.println(names.add("Maui"));//true

        names.forEach(System.out::println);


    }

    //consumer example:
    public static void print(String s) {
        System.out.println(s);}




}

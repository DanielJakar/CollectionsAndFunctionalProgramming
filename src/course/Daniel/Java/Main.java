package course.Daniel.Java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Contact> map = new HashMap<>();
        map.put("Moe", new Contact("Moe", "green", "0503453434"));//android Sharepref, Bundle, Intent (Bundle)

        Map<String, Contact> tree = new TreeMap<>();
        tree.put("A", new Contact("Dave", "D", "D"));
        tree.put("C", new Contact("Aba", "D", "D"));
        tree.put("B", new Contact("Gil", "D", "D"));

        for (String s : tree.keySet()){
            System.out.println(s);
            System.out.println(tree.get(s));
        }
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

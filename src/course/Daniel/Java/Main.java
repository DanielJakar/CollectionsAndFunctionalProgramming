package course.Daniel.Java;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getNames();

    }

    public static Queue<String> getNames(){
        //very bad for random access
        Deque<String> names = new LinkedList<>();


        names.add("Codee");
        names.add("Mike");
        names.add("Dave");
        names.add("Moe");
        names.add("Moana");
        names.offer("Maui");

        System.out.println(names.peek());//Codee - retreives or null
        System.out.println(names.element());//Codee - retreives or throws exception
        System.out.println(names.poll());//Codee - remove or null
        System.out.println(names.remove());//Mike - remove or throws exception

        //Stack - Lifo
        //DeQue:
        names.pop(); // remove element or throw
        names.push("Mira");//push



        return names;
    }
}

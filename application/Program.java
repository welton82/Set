package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Notebook");
        set.add("Video Game");


        for(String p: set){
            System.out.println(p);
        }

        set.removeIf(x ->x.charAt(0) == 'V');
        for(String p: set){
            System.out.println(p);
        }

    }
}

package application;

import java.lang.reflect.Array;
import java.util.*;

public class Exemplo2 {
    public static void main(String[] args) {

        Set<Integer> a = new LinkedHashSet<>(Arrays.asList(-150,-12,10,25,48,65,74,125));


        Set<Integer> b = new LinkedHashSet<>(Arrays.asList(-1,-150,-12,-25,-3,65,25));

        System.out.println("A:  " + a);
        System.out.println("B: " + b);
        //União
        Set<Integer> c = new LinkedHashSet<>(a);
        c.addAll(b);
        System.out.println("A e B: " + c);

        //Intersecção
        Set<Integer>d = new LinkedHashSet<>(a);
        d.retainAll(b);
        System.out.println("contém A e B:" + d);

        //Diferença
        Set<Integer> e = new LinkedHashSet<>(a);
        e.removeAll(b);
        System.out.println("Diferença: " + e);
    }
}

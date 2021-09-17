package com.prathviraj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class learnArrayList {
    public static void arr(){

        //List is interface used to implement ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(25));
        list.add(1,4);
        list.add(90);
        list.set(0,20);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(15);
        System.out.println("newList : "+newList);
        list.addAll(newList); //append list
        System.out.println("list: "+list);

        list.remove(0); //by idx
        list.remove(Integer.valueOf(90)); //by val
//      newList.clear();
        list.removeAll(newList);

        System.out.println("list: "+list);

        System.out.println("list.contains(90): "+list.contains(90));

        System.out.println(" ");

        ArrayList<Character> ch = new ArrayList<Character>();

        ch.add('p');
        ch.add('r');
        ch.add('a');
        ch.add('t');
        ch.add('h');
        ch.add('v');
        ch.add('i');
        System.out.println(ch);

        for (int i = 0; i < ch.size(); i++) {
            System.out.print(ch.get(i));
        }
        System.out.println("");
        for(Character x:ch){
            System.out.print(x);
        }
        System.out.println();
        Iterator<Character> it = ch.iterator();

        while(it.hasNext()){
            System.out.print(it.next());
        }



    }
}

/*
OUTPUT:
        newList : [15]
        list: [20, 4, 90, 15]
        list: [4]
        list.contains(90): false

        [p, r, a, t, h, v, i]
        prathvi
        prathvi
        prathvi
*/

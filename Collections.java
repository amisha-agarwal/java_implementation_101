import java.util.ArrayList;
import java.io.*;
import java.util.*;

class Collections {
    public static void main(String[] args) {
        System.out.println("hello");
        // Object[] a = new Object[10];
        // a[0] = new Object();
        // a[1] = new Integer(10);
        // a[2] = new String("Principal");
        // System.out.println(a[0] + "====" + a[1] + "====" + a[2] + "====");
        // string type arraylist list1

        // int [] a = {10,20,30,40,50,60};
        // int [] b = {80,90};
        // a = b;
        // b = a;
        // System.out.println("array a elements = "+a[0]+"---"+a[1]+"---"+a[2]+"---");

        ArrayList<String> list1 = new ArrayList<String>();

        // abstract arraylist list2
        ArrayList list2 = new ArrayList();

        // 1. adding data to list1
        list1.add("I am ");
        list1.add("INTERN ");
        list1.add("at");
        list1.add("Principal");
        list1.add("Global");
        list1.add("Services");
        list1.add("Pune");

        // 2. adding data to list2

        list2.add(10);
        list2.add("Amisha");
        list2.add(6.6);

        // printing the elements from the list the way we added to the list

        System.out.println("list1 elements :" + list1);
        System.out.println("list2 elements :" + list2);

        // get elements fom the list

        String name = list1.get(1);
        System.out.println("Name =" + name);
        Object ob = list2.get(1);
        System.out.println("element = " + ob);

        // update element of the list
        list1.set(2, "Fionna");
        System.out.println("list1 elements :" + list1);

        // Remove an element from the list
        list1.remove(1);
        System.out.println("list1 elements :" + list1);

        // list1.clear() remove all the elements from the list

        // search in the list1 for a word in it
        if (list1.contains("principal")) {
            System.out.println("yes, it is present");
        }
        // iterate in ArrayList

        System.out.println("========== iterating with Normal for loop ====");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println("=====================");
        System.out.println("========== iterating with enhanced for loop ====");
        for (String str : list1) {
            System.out.println(str);
        }
        System.out.println("=====================");
        System.out.println("========== iterating with iterator ====");
        Iterator<String> itr = list1.iterator();
        System.out.println("1. " + itr.next());
        System.out.println("2. " + itr.next());

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str.equals("Principal")) {
                itr.remove();
            }
        }
        System.out.println("=====================");

        System.out.println("list1 after iteration " + list1);

    }
}
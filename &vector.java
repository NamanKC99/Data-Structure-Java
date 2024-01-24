
--------------------Vector--------------------
Vector implements a dynamic array which means it can grow or shrink as required. Like an array, 
it contains components that can be accessed using an integer index.

They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
It also maintains an insertion order like an ArrayList. Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
Syntax: 

public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
Here, E is the type of element.

import java.util.Vector;

class vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        // boolean add()
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("e");
        // add(int index,"element") add in specific position
        v.add(3, "d");
        // d added at index 3

        System.out.println(v);// [a, b, c, d, e]
        // for each loop-
        // iterating
        for (String s : v) {
            System.out.println(s);
            /*
             * a
             * b
             * c
             * d
             * e
             */
        }

        // boolean remove
        // v.remove(int index) or v.remove(object name)
        v.remove(3);
        v.remove("e");

        System.out.println("-----Element Removed----");
        for (String s : v) {
            System.out.println(s);
            /*
             * //element Removed
             * a
             * b
             * c
             */
        }
        // size
        System.out.println("size() -" + v.size());
        // find index no.
        // Indexof Method willl not support in list interface
        System.out.println("indexOf(obj)" + v.indexOf("a"));
        // find index no. from that index
        System.out.println("indexOf(obj)" + v.indexOf("b", 2));
        // find indext no.from last
        System.out.println("lastIndexOf(obj) " + v.lastIndexOf("a"));

        // contain will return true if it contains object
        System.out.println("contains(obj) " + v.contains("a"));

        // clear all element-
        // v.clear()

    }

}

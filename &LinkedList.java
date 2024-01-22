import java.util.LinkedList;
import java.util.List;

class Linkedl {
    public static void main(String args[]) {
        List<String> Ll = new LinkedList<>();
        Ll.add("A");
        Ll.add("B");
        Ll.add("C");
        Ll.add("D");
        // Printing List-
        System.out.println(Ll);// [A, B, C, D]

        // add() in specific position
        Ll.add(0, "adding in 1");// [Adding in 1, A, B, C, D]
        System.out.println(Ll);// [Adding in 1, A, B, C, D]

        // remove( int index)
        Ll.remove(0);// [A, B, C, D]
        System.out.println(Ll);// [A, B, C, D]

        // remove(Object name);
        Ll.remove("A");// [B, C, D]
        System.out.println(Ll);// [B, C, D]

        // indexOf() - Get Index no. of object.
        System.out.println("Index No of Element B is " + Ll.indexOf("B"));// Index No of Element B is 0

        // for loop - iterating By For Loop-
        System.out.println("For loop");

        for (int i = 0; i < Ll.size(); i++) {
            System.out.print(Ll.get(i) + " ");// B C D

        }

        System.out.println();
        System.out.println("Foreach loop");

        // Foreach Loop - Iterating the List
        for (String s : Ll) {
            System.out.println(s);
            // B
            // C
            // D
        }
    }

}

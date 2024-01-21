import java.util.List;
import java.util.ArrayList;

class Alist {

    public static void main(String[] args) {
        ArrayList<String> Al = new ArrayList<String>();
        // Adding
        Al.add("n");
        Al.add("a");
        Al.add("m");
        Al.add("a");
        Al.add("n");
        System.out.println(Al);
        System.out.println("Size of the ArrayList -" + Al.size());
        // Removing -
        Al.remove(0);
        // Using For Loop-

        // Iterating-    
        System.out.print("By for each loop-");
        for (String i : Al) {
            System.out.println(i + " ");
        }
        // By for Loop
        System.out.println("By For loop-");
        for (int i = 0; i < Al.size(); i++) {
            System.out.println(Al.get(i));
        }

        // getMethod
ā        System.out.println("getmethod-" + Al.get(1));

    }

}

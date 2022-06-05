package ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> departments=new ArrayList<>();
        departments.add("CSE");
        departments.add("ECE");
        departments.add("EEE");
        departments.add("IT");

        ListIterator<String> listIterator=departments.listIterator();
        System.out.println("Forward Direction Iteration:");
        String dept;
        while (listIterator.hasNext()) {
            dept =listIterator.next();
            System.out.println(dept);
            if(dept.equals("IT")) {
                listIterator.add("ME");
            }else if(dept.equals("ME")) {
                listIterator.add("CIVIL");
            }
            System.out.println(listIterator.nextIndex());
        }

        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            dept =listIterator.previous();
            System.out.println(dept);
            if(dept.equals("IT")) {
                listIterator.remove();
            }else if(dept.equals("ME")) {
                listIterator.set("MECH");
            }
            System.out.println(listIterator.previousIndex());
        }
    }
}

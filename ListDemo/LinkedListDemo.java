package ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Long> linkedList=new LinkedList<>();
        System.out.println(" boolean add(Object) ");
        Boolean status=linkedList.add(1L);
        System.out.println("status: " +status);
        linkedList.add(2L);
        System.out.println(linkedList); // [1, 2]

        System.out.println(" boolean remove(index) ");
        linkedList.remove(1);
        System.out.println(linkedList); // [1]

        System.out.println(" boolean remove(Object) ");
        linkedList.remove(1L);
        System.out.println(linkedList); // []

        List arrayList=new ArrayList<>();
        arrayList.add(5L);
        arrayList.add(6L);
        System.out.println(arrayList);  // [5, 6]

        System.out.println(" boolean addAll(list) ");
        linkedList.addAll(arrayList);
        System.out.println(linkedList);  // [5, 6]

        System.out.println(" boolean removeAll(List) ");
        linkedList.removeAll(arrayList);
        System.out.println(linkedList); // []

        linkedList.add(7L);
        linkedList.add(8L);
        linkedList.add(9L);
        linkedList.add(10L);
        arrayList.add(9L);
        System.out.println(" boolean removeIf(predicate condition) ");
        System.out.println(" filter odd numbers :");
        Predicate<Long> longPredicate= num -> num%2==0;
        linkedList.removeIf(longPredicate);
        System.out.println(linkedList); // [7,9]

        System.out.println(" boolean retainAll(list) ");
        linkedList.add(11L);
        linkedList.add(12L);
        linkedList.retainAll(arrayList);
        System.out.println(linkedList); // [9]

        System.out.println(" Object[] toArray() ");
        Object[] objectArray=linkedList.toArray();
        System.out.println(Arrays.toString(objectArray)); // [9]

        System.out.println(" <T> T[] toArray(T[] a) ");
        Long[] longArray=linkedList.toArray(new Long[linkedList.size()]);
        System.out.println(Arrays.toString(longArray)); // [9]

        System.out.println(" boolean isEmpty() ");
        System.out.println(linkedList.isEmpty()); // [false]

        System.out.println(" boolean isEmpty() ");
        List<Long> newlinkedList=new ArrayList<>();
        System.out.println(newlinkedList); // [true]

        System.out.println(" boolean equals(list) ");
        System.out.println(linkedList.equals(newlinkedList)); // [false]

        System.out.println(" boolean equals(list) ");
        newlinkedList.add(9L);
        System.out.println(linkedList.equals(newlinkedList)); // [true]

        System.out.println(" int hashCode() ");
        System.out.println(linkedList.hashCode()); // 40


        System.out.println(" Different ways of Iterating or transversing the list.  ");
        System.out.println(" Using while loop using iterator");

        System.out.println(" Iterator iterator() ");
        Iterator itr=linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(" Using for loop ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println(" Using enhanced for loop ");
        for (Long e:linkedList) {
            System.out.println(e);
        }

        System.out.println(" Using lambda foreach ");
        linkedList.forEach(value-> System.out.println(value));
        linkedList.forEach(System.out::println);
       



    }

}

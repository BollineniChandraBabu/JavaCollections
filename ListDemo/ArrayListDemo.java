package ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListDemo {
    public static void main(String args[]){
        List<Long> genericList=new ArrayList<>();

        System.out.println(" boolean add(Object) ");
        Boolean status=genericList.add(1L);
        System.out.println("status: " +status);
        genericList.add(2L);
        System.out.println(genericList); // [1, 2]

        System.out.println(" boolean remove(index) ");
        genericList.remove(1);
        System.out.println(genericList); // [1]

        System.out.println(" boolean remove(Object) ");
        genericList.remove(1L);
        System.out.println(genericList); // []

        List arrayList=new ArrayList<>();
        arrayList.add(5L);
        arrayList.add(6L);
        System.out.println(arrayList);  // [5, 6]

        System.out.println(" boolean addAll(list) ");
        genericList.addAll(arrayList);
        System.out.println(genericList);  // [5, 6]

        System.out.println(" boolean removeAll(List) ");
        genericList.removeAll(arrayList);
        System.out.println(genericList); // []

        genericList.add(7L);
        genericList.add(8L);
        genericList.add(9L);
        genericList.add(10L);
        arrayList.add(9L);
        System.out.println(" boolean removeIf(predicate condition) ");
        System.out.println(" filter odd numbers :");
        Predicate<Long> longPredicate=num -> num%2==0;
        genericList.removeIf(longPredicate);
        System.out.println(genericList); // [7,9]

        System.out.println(" boolean retainAll(list) ");
        genericList.add(11L);
        genericList.add(12L);
        genericList.retainAll(arrayList);
        System.out.println(genericList); // [9]

        System.out.println(" Object[] toArray() ");
        Object[] objectArray=genericList.toArray();
        System.out.println(Arrays.toString(objectArray)); // [9]

        System.out.println(" <T> T[] toArray(T[] a) ");
        Long[] longArray=genericList.toArray(new Long[genericList.size()]);
        System.out.println(Arrays.toString(longArray)); // [9]

        System.out.println(" boolean isEmpty() ");
        System.out.println(genericList.isEmpty()); // [false]

        System.out.println(" boolean isEmpty() ");
        List<Long> newGenericList=new ArrayList<>();
        System.out.println(newGenericList); // [true]

        System.out.println(" boolean equals(list) ");
        System.out.println(genericList.equals(newGenericList)); // [false]

        System.out.println(" boolean equals(list) ");
        newGenericList.add(9L);
        System.out.println(genericList.equals(newGenericList)); // [true]

        System.out.println(" int hashCode() ");
        System.out.println(genericList.hashCode()); // 40


        System.out.println(" Different ways of Iterating or transversing the list.  ");
        System.out.println(" Using while loop using iterator");

        System.out.println(" Iterator iterator() ");
        Iterator itr=genericList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(" Using for loop ");
        for (int i = 0; i < genericList.size(); i++) {
            System.out.println(genericList.get(i));
        }

        System.out.println(" Using enhanced for loop ");
        for (Long e:genericList) {
            System.out.println(e);
        }

        System.out.println(" Using lambda foreach ");
        genericList.forEach(value-> System.out.println(value));
        genericList.forEach(System.out::println);
    }
}

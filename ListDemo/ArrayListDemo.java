package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String args[]){
        List<Long> genericList=new ArrayList<>();
        genericList.add(1L);
        genericList.add(2L);
        genericList.add(3L);
        genericList.add(4L);
        System.out.println(genericList);
        genericList.remove(3);
        System.out.println(genericList);
        genericList.remove(2L);
        System.out.println(genericList);

        List nonGenericList=new ArrayList<>();
        nonGenericList.add(5L);
        nonGenericList.add(6L);
        nonGenericList.add(7L);
        nonGenericList.add(8L);
        System.out.println(nonGenericList);
        genericList.addAll(nonGenericList);
        System.out.println(genericList);
    }
}

package ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        List<String> namesList=new ArrayList<>();
        namesList.add("chandra");
        namesList.add("babu");
        namesList.add("bollineni");
        System.out.println(" Spliterator<E> spliterator() ");
        Spliterator spliterator=namesList.spliterator();

        int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;

        System.out.println(spliterator.characteristics() == expected);  //true

        if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }

        if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }

        if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }

        if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }

        if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }

        if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }

        if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }

        System.out.println(spliterator.estimateSize());
        System.out.println(spliterator.getExactSizeIfKnown());

        Spliterator<String> spliterator2 = spliterator.trySplit();
        spliterator.forEachRemaining(list-> System.out.println(list));
        System.out.println(" ============== ");
        spliterator2.forEachRemaining(list-> System.out.println(list));
    }
}

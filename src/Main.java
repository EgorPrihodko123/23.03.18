import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<String> collection = new ArrayDeque<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");
        collection.add("F");
        collection.add("G");
        collection.add("H");
        collection.add("I");
        collection.add("J");
        collection.add("K");
        collection.add("L");
        collection.add("M");
        collection.add("N");
        collection.add("O");
        collection.add("P");
        collection.add("Q");
        collection.add("R");
        collection.add("S");
        collection.add("T");
        collection.add("U");
        collection.add("V");
        collection.add("W");
        collection.add("x");
        collection.add("Y");
        collection.add("Z");
        System.out.println(collection);
        for (int i = 0; i <4; i++) {
            if (i % 2 == 0) {
                collection.pollFirst();

            }
        }
        System.out.println(collection);
    }
}

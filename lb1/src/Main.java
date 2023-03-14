import java.util.*;

public class Main {
    static Random rnd = new Random();

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        String arrayListStr = "arrayList";
        String linkedListStr = "linkedList";
        int elementsCount = 100_000;
        int insertCount = 1_000;


        fill(array, elementsCount, arrayListStr);
        fill(linked, elementsCount, linkedListStr);
        randomAccess(array, arrayListStr);
        randomAccess(linked, linkedListStr);
        sequentialAccess(array, arrayListStr);
        sequentialAccess(linked, linkedListStr);
        insertIntoBegin(array, insertCount, arrayListStr);
        insertIntoBegin(linked, insertCount, linkedListStr);
        insertIntoEnd(array, insertCount, arrayListStr);
        insertIntoEnd(linked, insertCount, linkedListStr);
        insertIntoMiddle(array, insertCount, arrayListStr);
        insertIntoMiddle(linked, insertCount, linkedListStr);

    }

    private static void fill(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++)
            list.add(i, rnd.nextInt(count));
        System.out.printf("Fill %s: %s%n", listType, System.currentTimeMillis() - time);
        System.out.println();
    }

    private static void randomAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int index = rnd.nextInt(list.size());
            list.get(index);}
        System.out.printf("Random Access in %s: %s%n", listType, System.currentTimeMillis() - time);
        System.out.println();
    }

    private static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (Integer i : list) {
            Integer s = i;}
        System.out.printf("Sequential Access %s: %s%n", listType, System.currentTimeMillis() - time);
        System.out.println();
    }

    private static void insertIntoBegin(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(i, rnd.nextInt(count+1));
        }
        System.out.printf("Insert at the beginning of %s: %s%n", listType, System.currentTimeMillis() - time);
        System.out.println();
    }

    private static void insertIntoEnd(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(rnd.nextInt(count+1));
        }
        System.out.printf("Insert at the end of %s: %s%n", listType, System.currentTimeMillis() - time);
        System.out.println();
    }

    private static void insertIntoMiddle(List<Integer> list, int count, String listType) {
        long time = System.currentTimeMillis();
        int index = list.size()/2;
        for (int i = 0; i < count; i++) {
            list.add(index++, rnd.nextInt(count+1));
        }
        System.out.printf("Insert into the middle of %s: %s%n", listType, System.currentTimeMillis() - time);
        System.out.println();
    }

}
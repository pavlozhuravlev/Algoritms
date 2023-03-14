package SortedLists;

import Factory.Sorter;

import java.util.ArrayList;

public class BubbleSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> data) {
        boolean isAscending = false;
        int temp;

        while (!isAscending) {
            isAscending = true;

            for (int i = 0; i < data.size() - 1; i++) {
                if (data.get(i) > data.get(i + 1)) {
                    temp = data.get(i);
                    data.set(i, data.get(i + 1));
                    data.set(i + 1, temp);
                    isAscending = false;
                }
            }
        }

        return data;
    }
}

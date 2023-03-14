package SortedLists;

import Factory.Sorter;
import java.util.ArrayList;

public class ShellSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        int t = 1;
        while (t * 3 < input.size())
            t = t * 3 + 1;
        while (t >= 1) {
            hSort(input, t);
            t = t / 3;
        }
        return input;
    }

    private void hSort(ArrayList<Integer> arrayList, int h) {
        for (int i = h; i < arrayList.size(); i++) {
            for (int j = i; j >= h; j = j - h) {
                if (arrayList.get(j) < arrayList.get(j - h))
                    swap(arrayList, j, j - h);
                else
                    break;
            }
        }
    }

    private void swap (ArrayList<Integer> arrayList, int n, int m) {
        int temp;
        temp = arrayList.get(n);
        arrayList.set(n,arrayList.get(m));
        arrayList.set(m,temp);
    }
}

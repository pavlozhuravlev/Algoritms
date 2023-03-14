package SortedLists;

import Factory.Sorter;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class QuickSorter implements Sorter {
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        quickSort(input, 0, input.size()-1);
        return input;
    }

    private void quickSort(ArrayList<Integer> input, int firstElem, int lastElem) {
        if (firstElem < lastElem) {
            int compareElem = divide(input, firstElem, lastElem);

            quickSort(input, firstElem, compareElem - 1);
            quickSort(input, compareElem, lastElem);
        }
    }

    private int divide(ArrayList<Integer> input, int firstIndex, int lastIndex) {
        int compElem = input.get(firstIndex);

        int left = firstIndex;
        int right = lastIndex;

        while (left <= right) {
            while (input.get(left) < compElem) {
                left++;
            }
            while (input.get(right) > compElem) {
                right--;
            }
            if (left <= right) {
                swap(input, right, left);
                left++;
                right--;
            }
        }
        return left;
    }
}

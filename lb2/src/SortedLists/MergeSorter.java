package SortedLists;

import Factory.Sorter;
import java.util.ArrayList;

public class MergeSorter implements Sorter {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> data) {

        divide(data, 0, data.size()-1);
        return data;
    }

    private void divide (ArrayList<Integer> data, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex && (lastIndex - firstIndex) >= 1) {
            int middle = (lastIndex + firstIndex) / 2;
            divide(data, firstIndex, middle);
            divide(data, middle+1, lastIndex);
            merger(data, firstIndex, middle, lastIndex);
        }
    }

    private void merger(ArrayList<Integer> data, int firstIndex, int middleIndex, int last) {
        ArrayList<Integer> sort = new ArrayList<>();

        int left = firstIndex;
        int right = middleIndex+1;

        while (left <= middleIndex && right <= last) {
            if (data.get(left) <= data.get(right)) {

                sort.add(data.get(left));
                left++;
            } else {

                sort.add(data.get(right));
                right++;
            }
        }
        while (left <= middleIndex) {
            sort.add(data.get(left));
            left++;
        }
        while (right <= last) {
            sort.add(data.get(right));
            right++;
        }

        int i = 0;
        int j = firstIndex;

        while(i<sort.size()){
            data.set(j, sort.get(i++));
            j++;
        }
    }

}

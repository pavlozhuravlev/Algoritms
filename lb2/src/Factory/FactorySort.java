package Factory;

import SortedLists.*;

public class FactorySort {
    public static Sorter sortList(SortingType type) {
        switch (type) {
            case BUBBLE: return new BubbleSorter();
            case MERGE: return new MergeSorter();
            case QUICK: return new QuickSorter();
            case SHELL: return new ShellSorter();
            default: throw new RuntimeException();
        }

    }
}

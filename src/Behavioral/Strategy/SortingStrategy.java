package Behavioral.Strategy;

public class SortingStrategy {
    private Sorting sorting;

    public void setStrategy(Sorting sorting) {
        this.sorting = sorting;
    }

    public void executeSorting(int[] array) {
        sorting.sort(array);
    }
}

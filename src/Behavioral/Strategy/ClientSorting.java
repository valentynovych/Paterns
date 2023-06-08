package Behavioral.Strategy;

public class ClientSorting {
    public static void main(String[] args) {
        SortingStrategy sortingStrategy = new SortingStrategy();
        int[] array = new int[] {5,1,2,4,9,6,8};

        System.out.println("Start sort array on growth");
        sortingStrategy.setStrategy(new GrowthSort());
        sortingStrategy.executeSorting(array);

        System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_ ");
        System.out.println("Start sort array on decrease");
        sortingStrategy.setStrategy(new DecreaseSort());
        sortingStrategy.executeSorting(array);
    }
}

package Behavioral.Strategy;

public class DecreaseSort implements Sorting {
    @Override
    public void sort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {

                if (array[j - 1] < array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }

            }
        }

        for (int elem : array) {
            System.out.print(elem + ", ");
        }
    }
}

package stepit.hw;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] array = new int[10];
        arrayRandom(array);

        int min = array[0];
        for (int a : array) {
            if (a < min) min = a;
        }
        System.out.println("Minimal element of your Array is: " + min);
    }

    static void arrayRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.println(array[i]);
        }
    }
}


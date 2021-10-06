package stepit.hw;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        int a = array.length;
        int temp;

        for (int i=0; i< a/2; i++) {
            temp = array[a-i-1];
            array[a-i-1] = array[i];
            array[i] = temp;
        }
        for (int i=0; i< array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

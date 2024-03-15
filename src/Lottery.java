import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();

        int[] first = initializeArray(7);
        int[] second = initializeArray(7);

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println("First array:  " + Arrays.toString(first));
        System.out.println("Second array: " + Arrays.toString(second));

        int count = 0;
        System.out.print("Array elements that have matches: ");
        for (int i = 0; i < first.length; i++) {
            if(first[i] == second[i]){
                count++;
                System.out.print(first[i] + ", ");
            }
        }
        if (count == 0) {
            System.out.println("none");
        }
        System.out.println();
        System.out.println("Number of matches: " + count);
    }


    public static int[] initializeArray(int lengthArray){
        Random random = new Random();
        int[] array = new int[lengthArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}

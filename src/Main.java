import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task_1");
        int[] inputArray1 = {150, 250, 774, 325, 500};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i : inputArray1) {

            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
            sum += i;
        }
        float middle = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min, middle};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Task_2");
        int[] inputArray2 = {54200, 61780, 58645, 55800, 72500};
        int index = 0;
        float[] outputArray2 = new float[inputArray2.length];
        for (int salary : inputArray2) {
            float tax = (float) salary * 13 / 100;
            outputArray2[index] = tax;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println();

        System.out.println("Task_3");
        int[] inputArray3 = {5800, 5000, 4800, 6300, 3500};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index3 = 0;
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[index3] = true;
            }
            index3++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println();

        System.out.println("Task_4");
        int[] inputArray4 = {580, 475, 120, -50, 0};
        boolean[] outputArray4 = {true};
        for (int accountBalance : inputArray4) {
            if (accountBalance < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println();

        System.out.println("Task_5");
        int[] inputArray5 = {3000, -2000, 0, 6300, -3500};
        int[] outputArray5 = new int[1];
        int count = 0;
        for (int profit : inputArray5) {
            if (profit < 0) {
                count++;
            }
            outputArray5[0] = count;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task_1");
        int[] inputArray1 = {150, 250, 774, 325, 500};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i : inputArray1) {
            sum += i;
        }
        for (int i : inputArray1) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : inputArray1) {
            if (min > i) {
                min = i;
            }
        }
        float middle = (float) sum / inputArray1.length;
        float[] outputArray1 = {sum, max, min, middle};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println();

        System.out.println("Task_2");
        int ivanov = 0;
        int petrov = 1;
        int lebedeva = 2;
        int gref = 3;
        int durov = 4;
        int[] inputArray2 = {ivanov, petrov, lebedeva, gref, durov};
        inputArray2[0] = 54200;
        inputArray2[1] = 61780;
        inputArray2[2] = 58645;
        inputArray2[3] = 55800;
        inputArray2[4] = 72500;
        int index = 0;
        float[] outputArray2 = {ivanov, petrov, lebedeva, gref, durov};
        for (int salary : inputArray2) {
            float tax = (float) salary * 13 / 100;
            outputArray2[index] = tax;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println(outputArray2[ivanov]);
        System.out.println();

        System.out.println("Task_3");
        int[] inputArray3 = {5800, 5000, 4800, 6300, 3500};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index3 = 0;
        for (int bonus : inputArray3) {
            if (bonus > 5000) {
                outputArray3[index3] = true;
            } else {
            }
            index3++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println();

        System.out.println("Task_4");
        int[] inputArray4 = {580, 475, 120, -50, 0};
        boolean[] outputArray4 = new boolean[inputArray4.length];
        int index4 = 0;
        for (int accountBalance : inputArray4) {
            if (accountBalance < 0) {
                outputArray4[index4] = false;
                System.out.println("На счету клиента в " + (index4 + 1) + " месяце был отрицательный балланс.");
                break;
            } else {
                outputArray4[index4] = true;
            }
            index4++;
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        System.out.println();

        System.out.println("Task_5");
        int[] inputArray5 = {3000, -2000, 0, 6300, -3500};
        boolean[] outputArray5 = new boolean[inputArray5.length];
        int index5 = 0;
        for (int profit : inputArray5) {
            if (profit >= 0) {
                outputArray5[index5] = true;
            } else {
                System.out.println("В " + (index5 + 1) + " месяце зафиксирован убыток.");
            }
            index5++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}
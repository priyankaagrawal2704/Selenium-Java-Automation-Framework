package JavaPractice;

public class Secondlargest {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];
        int secondmax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax) {
                secondmax = arr[i];
            }
        }
        System.out.print("Second largest element " + secondmax);
        System.out.print(" largest element " + max);

    }
}

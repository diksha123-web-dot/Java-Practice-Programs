import java.util.Scanner;

public class sizevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("The values in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
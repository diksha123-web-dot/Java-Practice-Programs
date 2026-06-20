public class sumofarr {
    public static void main(String[] args) {
        int[] arr = {5,7,6,1,3,4};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
    
}

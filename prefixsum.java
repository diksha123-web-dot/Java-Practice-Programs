public class prefixsum {
    public static void main(String[] args) {
        int[] arr = {5,8,1,2,4};
        int[] prefixSum = new int[arr.length];
        
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("The prefix sum array is:");
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.println(prefixSum[i]);
        }
    }
    
}

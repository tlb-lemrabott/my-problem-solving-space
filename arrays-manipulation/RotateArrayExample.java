public class RotateArrayExample{
    public static void reverseArrayInnerLoop(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateByKTwoLoop(int []arr, int k){
        k = k % arr.length;
        int []output = new int[arr.length];
        int j = 0;
        for(int i = arr.length - k; i<arr.length; i++){
            output[j++] = arr[i];
        }
        for(int i=0; i<arr.length - k; i++){
            output[j++] = arr[i];
        }
        System.out.println(Arrays.toString(output));
    }

    private static void reverseArrayTwoPointer(int []arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void RotateByKUSingHelper(int []arr, int k){
        reverseArrayTwoPointer(arr, 0, arr.length-1);
        reverseArrayTwoPointer(arr, 0, k-1);
        reverseArrayTwoPointer(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
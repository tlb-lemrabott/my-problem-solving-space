https://leetcode.com/problems/count-good-triplets/
// Add solution for CountGoodTriplets leetcode problem.
public int countGoodTriplets(int[] arr, int a, int b, int c) {
    int count = 0;
    for(int i=0; i<arr.length-2; i++){
        for(int j=0; j<arr.lenght-1; j++){
            if(Math.abs(arr[i] - arr[j]) <= a){
                for(int k=0; k<arr.lenght; k++){
                    if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        count++;
                    }
                }
            }
        }
    }
    return count;
}
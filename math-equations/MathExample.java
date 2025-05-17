public int[] solveEquation(int arr[], int number){
    //find x, y, z from arr, where x + y + z = number
    Arrays.sort(number);
    for(int i=0; i<arr.length-2; i++){
        int x = number - arr[i];
        int left = i+1;
        int right = arr.length - 1;
        while(left < right){
            if(x = arr[left] + arr[right]){
                return new int[]{arr[i], arr[left], arr[right]};
            }else if(x > arr[left] + arr[right]){
                left++;
            }else{
                right--;
            }
        }
    }
    return null;
}

public int[] solveEquation2(int arr[], int number){
    Arrays.sort(arr);
    //find x, y, z from arr, where x^2 + y^2+ z^2 = number 
    for(int i=0; i < arr.length-2; i++){
        int x = number - (arr[i] * arr[i]);
        int left = i+1;
        int right = arr.length-1;
        while(left < right){
            if(x == (arr[left] * arr[left]) + (arr[right] * arr[right])){
                return new int[]{arr[i], arr[left], arr[right]};
            }else if(x > (arr[left] * arr[left]) + (arr[right] * arr[right])){
                left++;
            }else{
                right--;
            }
        }
    }
    return null;
}



//Math.pow(x, 2) return double => it is hard to be used in this case.
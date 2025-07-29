//Solution for equation x + y + z = number 
public int[] solveEquation(int arr[], int number){
    //find x, y, z from arr, where x + y + z = number
    Arrays.sort(arr);
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


//Solution for equation x^2 + y^2+ z^2 = number 
public int[] solveEquation(int arr[], int number){
    Arrays.sort(arr);
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
//Note Math.pow(x, 2) return double => it is hard to be used in this case.


//Improving solution for equation x + y + z = target to return all possibilities
public List<List<Integer>> solveEquation(int arr[], int number){
    Arrays.sort(arr);
    List<List<Integer>> result = new ArrayList<>();
    for(int i=0; i < arr.length; i++){
        if(i > 0 && arr[i] == arr[i-1]) continue;
        int x = number - arr[i];
        int left = i+1;
        int right = arr.length - 1;
        while(left < right){
            if(x == arr[left] + arr[right]){
                result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                while(left < right && arr[left] == arr[left+1]) left++;
                while(left < right && arr[right] == arr[right-1]) right--;
                left++;
                right--;
            }else if(x > arr[left] + arr[right]){
                left++;
            }else{
                right--;
            }
        }
    }
    return result;
}


public int[] solveEquation(int arr[], int target){
    Arrays.sort(arr);
    for(int i=0; i<arr.length-2; i++){
        int num = arr[i];
        int x = target - num;
        int left = i+1;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] == x){
                return new int[]{num, arr[left], arr[right]};
            }else if(arr[left] + arr[right] < x){
                left++;
            }else{
                right--;
            }
        }
    }
    return new int{-1, -1, -1};
}
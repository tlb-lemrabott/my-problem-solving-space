//Anagram if they have the same element
public boolean isAnagramArray(int []arr1, int []arr2){
    if(arr1.length != arr2.length) return false;
    boolean []visited = new boolean[arr1.length];
    for(int i=0; i<arr1.length; i++){
        boolean found;
        for(int j=0; j<arr2.length; j++){
            if(!visisted[j] && arr1[i] != arr2[j]){
                found = true;
                visited[j] = true;
                break;
            }
        }
        if(!boolean) return false;
    }
    return true;
}

public boolean isAnagramArray(int []arr1, int []arr2){
    Map<Integer, Integer> map = new HashMap<>();
    for(int num : arr1){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for(int num : arr2){
        if(!map.containsKey(num)) return false;
        map.put(num, map.get(num) - 1);
        if(map.get(num) == 0) map.remove(num);
    }
    return map.isEmpty();
}

public boolean isAnagramSortedArrays(int []arr1, int []arr2){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0; i<arr1.length; i++){
        if(arr1[i] != arr2[i]) return false;
    }
    return true;
}


1 2 5 7 9 10 11 12
1 2 0 5 7 9 10 11
insert 3 
1 2 3 5 7 9 10 11

public void insertElementInSortedArray(int []arr, int k){
    for(int i=0; i<arr.lenght; i++){
        if(arr[i] > k){
            int temp = arr[i];
            arr[i] = k;
            k = temp;
        }
    }
}

public void insertElementInSortedArray(int []arr, int k){
    for(int i=0; i<arr.length-1; i++){
        if(arr[i] > k){
            int temp = arr[i]; // 5 7
            arr[i] = k; // 0 5
            k = temp; //5 7
        }
    }
}




-1 3 -4 6 7 9 -2 -3 8 0 9
-1 -4 -2 -3 | 3 6 7 9 8 0 9

// 1 2 -1

// 1 -1 2

// 1 -1 
// -1 -2
// -1 1 -2


// 1 -1 -3 -5 8 
// -1 1 -3 -5 8
// -1 -3 1 -5 8
// -1 -3 -5 1 8
// -1 -3 -5 1 8

// -1 3 -4 6 7 9 -2 -3 8 0 9
// -1 3 -4 6 7 9 -2 -3 8 0 9
// -1 -4 3 6 7 9 -2 -3 8 0 9
// -1 -4 3 6 7 9 -2 -3 8 0 9
// -1 -4 3 6 7 -2 -3 9 8 0 9

boolean swapped = false;
boolean skippedPositive = false;
int lastNegativeIndex = 0;
do{
    swapped = false;
    for(int i=lastNegativeIndex+1; i<arr.length; i++){
        if(arr[i-1] > 0 && arr[i] < 0){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
            swapped = true;
            if(!skippedPositive){
                lastNegativeIndex = i-1;
            }
        } else {
            skippedPositive = true;
        }
    }
}while(swapped);

======
// 1 -1 2 3 -3
// -1 1 2 -3 3
// -1 1 -3 2 3
// -1 -3 1 2 3

void segregateArray(int arr[]){
    int[] output = new int[arr.lenght];
    int k = 0;
    for(int i=0; i < arr.lenght; i++){
        if(arr[i] < 0){
            output[k++] = arr[i];
        }
    }

    for(int i=0; i < arr.lenght; i++){
        if(arr[i] > 0){
            output[k++] = arr[i];
        }   
    }

    for(int i=0; i < arr.lenght; i++){
        arr[i] = output[i];
    }
}




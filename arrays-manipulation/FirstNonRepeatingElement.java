public static int firstNonRepeatingElement(int arr[]){
        Map<Integer, Integer> mapElement = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mapElement.put(arr[i], mapElement.getOrDefault(arr[i], 0) + 1);
        }
        for (int num : arr) {
            if (mapElement.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 1, 2, 0, 4};
        int[] arr2 = {1, 2, 2, 1, 3, 4, 4};
        int[] arr3 = {7, 7, 7, 7};

        System.out.println("First non-repeating element in arr1: " + firstNonRepeatingElement(arr1));
        System.out.println("First non-repeating element in arr2: " + firstNonRepeatingElement(arr2));
        System.out.println("First non-repeating element in arr3: " + firstNonRepeatingElement(arr3));
    }

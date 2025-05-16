public class PossiblePermutationExample{

    // [[1, 2], [3, 4]]

    public static List<List<Integer>> getPossiblePermutationArray(int []arr){
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i]);
                tempList.add(arr[j]);
                result.add(tempList);
            }
            
        }
        return result;
    }



    public static List<List<Integer>> getPossiblePermutationArray(int []arr){

    }

}
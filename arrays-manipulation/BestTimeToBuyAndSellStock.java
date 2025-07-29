https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int price: prices){
        if(price < minPrice){
            minPrice = price;
        }else if(price - minPrice > maxProfit){
            maxProfit = price - minPrice;
        }
    }
    return maxProfit;
}

public void print2darray(int [][]arr){
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

public void bubbleSort(int []arr){
    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

public int factorial(int n){
    if(n==0 || n==1){
        return 1;
    }else{
        return n * factorial(n-1);
    }
}

public int fibonnaci(int n){
    if(n <= 1){
        return n;
    }else{
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
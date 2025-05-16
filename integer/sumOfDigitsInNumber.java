public int sumOfDigitsInNumber(int n){
    int sum = 0;
    n = Math.abs(n);
    while(n > 0){
        sum += n % 10;
        n = n / 10;
    }
    return sum;
}
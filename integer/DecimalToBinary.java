public int[] decimalToBinary(int input){
    if(input == 0){
        return new int[]{0};
    }
    int temp = input;
    int length = 0;
    while(temp > 0){
        length++;
        temp /= 2;
    }
    int []binary = new int[length];
    for(int i=length-1; i>=0; i--){
        binary[i] = input % 2;
        input = input / 2;
    }
    return binary;
}
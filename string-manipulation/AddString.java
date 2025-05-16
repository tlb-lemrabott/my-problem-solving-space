public static int addStringsByParsing(String num1, String num2) {
    return Integer.parseInt(num1) + Integer.parseInt(num2);
}
public static String addStringsByParsing(String num1, String num2) {
    //String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
    return Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2))
}

//---------------------------------

public BigInteger addStringsUsingBigInteger(String num1, String num2) {
    BigInteger number1 = new BigInteger(num1);
    BigInteger number2 = new BigInteger(num2);
    return number1.add(number2); //.toString();
}


//---------------------------------


public static int addStrings(String num1, String num2) {
    int result = 0;
    int carry = 0;
    int place = 1;
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    while(i >= 0 || j >= 0 || carry > 0){
        int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
        int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
        int sum = digit1 + digit2 + carry;
        int digit = sum % 10;
        carry = sum / 10;
        result += digit * place;
        place *= 10;
        i--;
        j--;
    }
    return result;
}



public static String addStrings(String num1, String num2) {
    String result = "";
    int carry = 0;
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    while(i >= 0 || j >= 0 || carry > 0){
        int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
        int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
        int sum = digit1 + digit2 + carry;
        int digit = sum % 10;
        carry = sum / 10;
        result = digit + result;
        //StringBuilder result.insert(0, digit);
        i--;
        j--;
    }
    return result;
}


public static int addStrings(String num1, String num2) {
    

}
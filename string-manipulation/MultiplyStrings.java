https://leetcode.com/problems/multiply-strings/description/


public String multiply(String num1, String num2) {
        // Edge case: if either number is "0", return "0"
        if (num1.equals("0") || num2.equals("0")) return "0";
        
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m + n];
        
        // Multiply from rightmost digits
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];
                
                res[i + j + 1] = sum % 10;       // current digit
                res[i + j] += sum / 10;          // carry to next position
            }
        }
        
        // Convert to string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        for (int val : res) {
            if (!(sb.length() == 0 && val == 0)) {  // skip leading zeros
                sb.append(val);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
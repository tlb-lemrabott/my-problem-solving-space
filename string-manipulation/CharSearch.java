public boolean searchCharInString(String str, char target){
    str = str.toLowerCase();
    int left = 0;
    int right = name.length()-1;
    boolean flag = false;
    while(left <= right){
        if (name.charAt(left) == target || name.charAt(right) == target) {
            flag = true;
            break;
        }
        left++;
        right--;
    }
    return flag;
}
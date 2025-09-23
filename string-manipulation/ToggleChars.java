// https://www.geeksforgeeks.org/dsa/program-toggle-characters-string/

public class ToggleChars {
    public String toggleChars(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }else{
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
}

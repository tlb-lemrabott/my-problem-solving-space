// Reverse characters or words
// hello world => dlrow olleh (character reverse)
// hello world => world hello (word reverse)
// hello world => olleh dlrow (individual world reverse)
// world => wlrod (reverson from index 1 to index 3) 

public class ReserveExample{

    public String completeReverse(String input){
        String ouput = "";
        for(int i=input.length()-1; i>=0; i++){
            ouput += input.charAt(i);
        }
        return ouput;
    }

    public wordReverse(String input){
        String word;
        String result;
        int i = input.length() - 1;
        while(i >= 0){
            while(i >= 0 && input.charAt(i) == ' ') i--;
            while(i >= 0 && input.charAt(i) != ' '){
                word = input.charAt(i) + word;
                i--;
            }
            if(word != ""){
                if(result != ""){
                    result += " ";
                }
                result += word;
            }
        }
        return result;
    }

    public static String wordReverseUsingFor(String input){
        String output = "";
        String word = "";
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) != ' '){
                word += input.charAt(i);
            }else {
                if(!word.isEmpty()){
                    output = word + " " + output;
                    word = "";
                }
            }
        }
        if(!word.isEmpty()){
            output = word + " " + output;
        }
        return output.toLowerCase();
    }

    public String individualReverse(String input){
        String output = "";
        String word = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                word = input.charAt(i) + word;
            }else {
                output += word + " ";
                word="";
            }
        }
        output += word;
        return output;
    }

    public String individualReverseUsingBuilder(String input){
        StringBuilder output = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) != ' '){
                word.insert(0, input.charAt(i));
            }else{
                output.append(word).append(" ");
                word.setLength(0);
            }
        }
        output.append(word);
        return output.toString();
    }

    public String reverseInterval(String input, int start, int end){
        if(input == null || start < 0 || end > input.length()-1 || start >= end){
            throw new IllegalArgumentException("Illegal arguments passed!");
        }
        String leftOutput = "";
        String rightOutput = "";
        String innnerOutput = "";
        for (int i=0; i<input.length(); i++){
            if(i < start){
                leftOutput += input.charAt(i);
            }else if(i >= start && i <= end){
                innnerOutput = input.charAt(i) + innnerOutput;
            }else{
                rightOutput += input.charAt(i);
            }
        }
        return leftOutput + innnerOutput + rightOutput;
    }

    


}
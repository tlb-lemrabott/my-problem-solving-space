https://leetcode.com/problems/valid-parentheses/description/

public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
            stack.push(s.charAt(i));
        }else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
            if(stack.isEmpty() || !isMatched(stack.pop(), s.charAt(i))){
                return false;
            }
        }
    }
    return stack.isEmpty();
}

private static boolean isMatched(char open, char close){
    return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
}
package StringProblems;

import java.util.Stack;


public class ValidParenthesis {

    public boolean validparenthesis(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0 ; i < s.length() ; i++){

            if(s.charAt(i) == '('){
                stack.push(')');
            }
            else if(s.charAt(i) == '{'){
                stack.push('}');
            }
            else if(s.charAt(i) == '['){
                stack.push(']');
            }

            if(s.charAt(i) == stack.peek()){
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

}

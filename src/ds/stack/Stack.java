package ds.stack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Stack {
    public static void main(String[] args) {
        System.out.println(validExpression());
    }

    static boolean validExpression(){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        Set<Character> openingSet = new HashSet<>(Arrays.asList('{', '[', '('));
        Set<Character> closingSet = new HashSet<>(Arrays.asList('}', ']', ')'));
        String exp = "[{(a + b) - (c-d}) + (e *f)]){";
        for (Character c : exp.toCharArray()){
            if(openingSet.contains(c)){
                stack.push(c);
            }
            if(closingSet.contains(c)){
                Character openingBrace = stack.pop();
                if(!isValidOpeningBrace(openingBrace, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isValidOpeningBrace(Character opening, Character closing){
        if(closing.equals('}')){
            return opening.equals('{');
        }
        if(closing.equals(']')){
            return opening.equals('[');
        }
        if(closing.equals(')')){
            return opening.equals('(');
        }
        return false;
    }
}

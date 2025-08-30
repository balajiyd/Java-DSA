public class Main {
    
    public static boolean isBalancedParentheses(String string){
        Stack<Character> s = new Stack<>();
        
        for(char c: string.toCharArray()){
            if(c=='('){
                s.push(c);
            }
            else if(c==')'){
               if(s.isEmpty() || s.peek() != '('){return false;} 
               s.pop();
            }
        }
        return s.isEmpty();
        
    }


    public static void main(String[] args) {
        System.out.println("These tests confirm isBalancedParentheses");
        System.out.println("works for empty strings, simple pairs,");
        System.out.println("nested parentheses, and unbalanced cases.");
        System.out.println();

        // Test 1
        System.out.println("Test 1: Empty String");
        System.out.println("Input: ''");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses(""));
        System.out.println();

        // Test 2
        System.out.println("Test 2: Single Pair");
        System.out.println("Input: '()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()"));
        System.out.println();

        // Test 3
        System.out.println("Test 3: Missing Open");
        System.out.println("Input: ')'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses(")"));
        System.out.println();

        // Test 4
        System.out.println("Test 4: Missing Close");
        System.out.println("Input: '('");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("("));
        System.out.println();

        // Test 5
        System.out.println("Test 5: Multiple Pairs");
        System.out.println("Input: '()()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()()"));
        System.out.println();

        // Test 6
        System.out.println("Test 6: Nested Balanced");
        System.out.println("Input: '(())'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("(())"));
        System.out.println();

        // Test 7
        System.out.println("Test 7: Nested Unbalanced");
        System.out.println("Input: '(()'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("(()"));
        System.out.println();

        // Test 8
        System.out.println("Test 8: Complex Balanced");
        System.out.println("Input: '(()())()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("(()())()"));
        System.out.println();

        // Test 9
        System.out.println("Test 9: Complex Unbalanced");
        System.out.println("Input: '())(()'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("())(()"));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm isBalancedParentheses
            works for empty strings, simple pairs,
            nested parentheses, and unbalanced cases.

            Test 1: Empty String
            Input: ''
            Expected: true
            Actual: true

            Test 2: Single Pair
            Input: '()'
            Expected: true
            Actual: true

            Test 3: Missing Open
            Input: ')'
            Expected: false
            Actual: false

            Test 4: Missing Close
            Input: '('
            Expected: false
            Actual: false

            Test 5: Multiple Pairs
            Input: '()()'
            Expected: true
            Actual: true

            Test 6: Nested Balanced
            Input: '(())'
            Expected: true
            Actual: true

            Test 7: Nested Unbalanced
            Input: '(()'
            Expected: false
            Actual: false

            Test 8: Complex Balanced
            Input: '(()())()'
            Expected: true
            Actual: true

            Test 9: Complex Unbalanced
            Input: '())(()'
            Expected: false
            Actual: false
        */
        
    }
    
}


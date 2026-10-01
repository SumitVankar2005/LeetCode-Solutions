class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('#');
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                char top = stack.peek();
                if(top == '(' && ch == ')' || top == '[' && ch == ']' || top == '{' && ch == '}'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }

        if(stack.peek() == '#'){
            return true;
        }else{
            return false;
        }
    }
}
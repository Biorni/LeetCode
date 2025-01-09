class Solution {
    public boolean isValid(String s) {

        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(characters[0]==']' || characters[0]==')' || characters[0]=='}')
            return false;

        for(int i=0; i<characters.length; i++){
            if(characters[i]=='(' || characters[i]=='{' || characters[i]=='[')
                stack.push(characters[i]);
            else {
               if(stack.isEmpty())
                    return false;

               char previous = stack.peek();
               char current = characters[i];
               if(previous=='(' && current==')')
                    stack.pop();
               else if(previous=='[' && current==']')
                    stack.pop(); 
               else if(previous=='{' && current=='}')
                    stack.pop();                     
               else
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
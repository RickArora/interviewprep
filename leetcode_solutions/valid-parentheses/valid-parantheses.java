import java.util.Stack;
class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>(); // declaring a stack which accepts Character (generic)
    for (char c : s.toCharArray()) { // transforming our string to a character array then using an iterator to traverse each element
      if (c == '[' || c == '(' || c == '{') { // checking to if we have an opening character if yes then we push it onto the stack
        stack.push(c);
      } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') { // checking for a closing bracket, if c is one and the next element in the stack is an opening one we pop
        stack.pop();
      } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
        stack.pop();
      } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
        stack.pop();
      } else {
        return false;
      }
    }
    return stack.isEmpty(); // if the stack isEmpty then we have checked everything successfully.
  }
}
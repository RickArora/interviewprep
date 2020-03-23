class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        if len(s) % 2 != 0: 
            return False
        for c in s: 
            if c == '(' or c =='[' or c =='{':
                stack.append(c)
            elif (c == ']' and len(stack) > 0 and stack.pop() != '['):
                return False
            elif (c == ')' and len(stack) > 0 and stack.pop() != '(' ):
                return False
            elif (c == '}' and len(stack) > 0 and stack.pop() != '{' ):
                return False
        return len(stack) == 0
    
    # make a variable i = stack.pop to avoid unexpected behavior

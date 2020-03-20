class Solution:
    def reverse(self, x: int) -> int:
        result = 0
        while x != 0:
            digit = x % 10
            result = result * 10
            result += digit
            x = int(x / 10)
        if x > (1<<32)-1 or x < ((1<<32)*-1):
            return 0
        return result
    
# 123 -> digit = 3, result = 0, result = 3
# digit = 2, result = 30, result = 32, x = 
        
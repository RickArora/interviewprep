# we can sort it if we want to save on space.
# O(log n) time and its O(1) space

def is_perm(s1,s2):
    if ''.join(sorted(s1)) == ''.join(sorted(s2)):
        return True  
    return False

print(is_perm("hi", "ih")) # True
print(is_perm("hiix", "ixih")) # True
print(is_perm("hr", "hx"))  # False

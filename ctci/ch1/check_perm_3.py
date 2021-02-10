def check_perm(s1,s2):
    if len(s1) is not len(s2):
        return False
    char_set_of_s1 = 128 * [0]
    for c in s1: 
        char_set_of_s1[ord(c)]+=1
    for c in s2: 
        char_set_of_s1[ord(c)]-=1
    for i in char_set_of_s1:
        if i > 0:
            return False
    return True
    
print(check_perm("ricky","ickyr")) # True
print(check_perm("hih","ihi")) # False
print(check_perm("ricy","ickyr")) # #False 

def pali_perm(s1,s2):
    dict_s1 = {}
    dict_s2 = {}
    count = 0
    
    
    if len(s1) != len(s2):
        return False 
    
    for c in s1: 
        if s1.count(c) != s2.count(c):
            counter = abs(s1.count - s2.count) + counter
    
    return counter < 2
    
    # for c in s1:
    #     if dict_s1.get(c,-1) != -1:
    #         updated_value = dict_s1.get(c) + 1
    #         dict_s1.update({c:updated_value})
    #     else: 
    #         dict_s1.update({c:1})
    
    # for c in s2:
    #     if dict_s1.get(c,-1) != -1:
    #        s2.count(c) != dict
            
             
    
    
    
    
    
    
    
            
    

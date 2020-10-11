def is_perm(s1,s2):
    dict = {}
    for c in s1:
        if dict.get(c,-1) != -1:
            update_count = dict.get(c) + 1
            dict.update({c:update_count})
        else:
            dict.update({c:1})
    for c in s2:
        if dict.get(c,-1) != -1:
            updated_value = dict.get(c) - 1
            dict.update({c:updated_value})
            if dict.get(c) == 0:
                dict.pop(c)
        else: 
            return False
    return len(dict.items()) == 0


print(is_perm("hi", "ih"))  # True
print(is_perm("hiix", "ixih"))  # True
print(is_perm("hr", "hx"))  # False

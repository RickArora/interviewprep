import sys

def is_unique(s1):
  # Assuming 128 ascii set
  if len(s1) >= 128:
    return False
  charSet = [0] * 128
  for c in s1:
    charSet[ord(c)] = charSet[ord(c)] + 1
  for char in charSet: 
    if char > 1:
          return False
  return True 

print(is_unique("hi")) # true
print(is_unique("ihi")) # false
print(is_unique("ricky")) # true
print(is_unique("rricky")) # false
  

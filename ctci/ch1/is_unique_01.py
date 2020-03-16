import sys

def is_unique(s1):
  s1ToSet = set()
  for c in s1:
    if c in s1ToSet:
      return False
    s1ToSet.add(c)
  return True

print(is_unique("strings"))
print(is_unique("testing"))
print(is_unique("hi"))
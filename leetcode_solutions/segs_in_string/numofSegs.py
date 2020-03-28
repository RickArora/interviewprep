class Solution:
    def countSegments(self, s: str) -> int:
        s = s.strip()
        if s == "":
            return 0
        s = len(re.split("\\s+", s))
        return s
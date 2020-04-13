class not_working_solution {
    public boolean validPalindrome(String s) {
        int diff = 0;
        char[] sArray = s.toCharArray();
        int sLength = s.length() - 1;
        for(int i = 0; i < s.length()/2; i++) {
            if (sArray[i] == sArray[sLength]) {
                sLength--;
            }
            else {
                diff++;
                if(sArray[i+1] == sArray[sLength]) {
                    
                }
                else if (sArray[i] == sArray[sLength-1]) {
                    sLength--;
                    i--;
                }
                else {
                    diff++;
                }
            }
        }
        return !(diff > 1);
    }
}
class numofSegs {
    public int countSegments(String s) {
        s = s.trim(); // removes trailing whitespace
        if (s.equals("")) { // base case 
            return 0;
        }
        return s.split("\\s+").length; // splits based on all whitespaces
    }
}
import java.util.Arrays;
class PalindromePerm_01 {
    public static void main(String[] args) {
        System.out.println(isPaliPerm("taco cat", "atco cta"));
    }

    public static boolean isPaliPerm(String s1, String s2) {
        // Solution one, n log n time complexity O(n) space sort both strings and compare
        char[] s1_split = s1.toCharArray();
        char[] s2_split = s2.toCharArray();
        Arrays.sort(s1_split);
        Arrays.sort(s2_split);
        s1 = new String(s1_split);
        s2 = new String(s2_split);
        return s1.equals(s2);
    }
}
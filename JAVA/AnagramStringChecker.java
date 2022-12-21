package DailyCodingProblem;
import java.util.Scanner;

public class AnagramStringChecker {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String az = "abcdefghijklmnopqrstuvwxyz";
        a = a.toLowerCase();
        b = b.toLowerCase();
        int aFreq = 0;
        int bFreq = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < az.length(); j++) {
                if(a.charAt(i)==az.charAt(j)){
                    aFreq += az.indexOf(az.charAt(j));
                }
            }
        }
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < az.length(); j++) {
                if(b.charAt(i)==az.charAt(j)){
                    bFreq += az.indexOf(az.charAt(j));
                }
            }
        }
        if(a.length() != b.length()){
            return false;
        }
        else if(aFreq != bFreq){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

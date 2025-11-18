package JavaConcepts;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static void main (String[] args) {

        System.out.println("=== TEST STARTS ===");

        // Regular Reverse
        RegularReverse("Hey how are you");

        //LettersReverseInWord
        LettersReverseInWord("Im Good yaar!");

    }

    //Regular Reverse
    public static String RegularReverse (String Reverse){
       // Reverse = "hj";
        int len = Reverse.length();
        System.out.println("Length :"+len);
        String gs ="";
        for(int i=len-1;i>=0;i--){
            gs = gs.concat( String.valueOf(Reverse.charAt(i)) );
        }
        System.out.println(gs);
        return gs;
    }


    //LettersReverseInWord
    public static String LettersReverseInWord(String gh) {
         //gh = "";
        String[] jk = gh.split(" ");
        int Arr_lenz = jk.length;
        //System.out.println("Array length "+Arr_lenz);
        String rev = "";
        String rev2 = "";
        for (int i =0;i<=Arr_lenz-1;i++) {

           rev = jk[i];

               for (int j=rev.length()-1;j>=0;j--){
                   rev2 = rev2+ String.valueOf(rev.charAt(j));
               }
            rev2 = rev2+" ";
        }
        System.out.println(rev2.trim());
        return rev2.trim();
    }



}

/*10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)*/

/*
A pangram is a sentence where every letter of the English alphabet appears at least once.
*/
public class PangramSentence {
    public static void main(String[] args) {


        int count = 0;
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < alphabet.length(); i++) {
                if(isPangram(sentence, alphabet.charAt(i)))
                    count++;

        }
        if(count == 26)
            System.out.println("Pengram Sentence");
        else
            System.out.println("Not a Pengram Sentence");
    }

    static boolean isPangram(String sen, char a) {

        for(int i = 0; i < sen.length(); i++) {
            if(a == sen.charAt(i))
                return true;
        }
        return false;

    }

}

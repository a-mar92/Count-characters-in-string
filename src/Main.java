// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Map<Character,Integer>counta = count("aabbbac");
        System.out.println(counta);
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character,Integer>charcount = new HashMap<>();
        for (char c :str.toCharArray()) {

            if(charcount.containsKey(c)){
                int count = charcount.get(c);
                charcount.put(c,count+1);

            }
            else {
                charcount.put(c,1);
            }

        }
        return charcount;
    }
}

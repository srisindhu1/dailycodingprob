package dailycodingproblems;
import java.util.*;
//Implement a URL shortener with the following methods:
//
//shorten(url), which shortens the url into a six-character alphanumeric string, such as zLg6wl.
//restore(short), which expands the shortened string into the original url. If no such shortened string exists, return null.
public class Urlchange_02_06_2022 {
    public static String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static int Base=CHARACTERS.length();
    public static int currentIndex;
    public static Map<Integer, String> map;
    public Urlchange_02_06_2022(int startIndex) {
        //This map is used as in memory db
        map = new HashMap<>();
        currentIndex = startIndex;
    }
   static String encode(String url) {
        ++currentIndex;
        StringBuilder stringBuilder = new StringBuilder();
        int current = currentIndex;
        while (current > 0) {
            stringBuilder.append(CHARACTERS.charAt(current % CHARACTERS.length()));
            current = current / Base;
        }
        map.put(currentIndex, url);
        System.out.println(stringBuilder.reverse().toString());
        return stringBuilder.reverse().toString();
    }
    String decode(String shortUrl) {

        int num = 0;
        for (char c : shortUrl.toCharArray()) {
            num = num * Base + CHARACTERS.indexOf(c);
        }
        return map.get(num);
    }



}

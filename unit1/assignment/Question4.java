package assignment;



public class Question4 {
    static String check(String str, String word)

    {
        int slen = str.length();
        int wlen = word.length();
        String s = "";
        for (int i = 0; i < slen-wlen+1; i++) {
            String tmp = str.substring(i,i+wlen);
            if (i > 0 && tmp.equals(word))
            {
                s += str.substring(i-1,i);
            }
            if (i < slen-wlen && tmp.equals(word))
            {
                s += str.substring(i+wlen,i+wlen+1);
            }
        }
        return s;

    }

    public static void main(String[] args) {
        System.out.println(check("abcXY123XYijk", "XY"));

        System.out.println(check("XY123XY", "XY"));

        System.out.println(check("XY1XY", "XY"));
    }


}

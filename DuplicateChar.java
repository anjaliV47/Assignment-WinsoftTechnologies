//A Java Program to find the duplicate characters in a string.

public class DuplicateChar{
    public static void main(String[] args){
        String str = "Winsoft Technologies";
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ' || ch[i] == '\0') {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\0';
                }
            }
            if (count > 1) {
                System.out.println(ch[i]);
            }

            }
        }
    }

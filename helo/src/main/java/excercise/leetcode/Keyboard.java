package excercise.leetcode;

public class Keyboard {
    public static void main(String[] args) {
        String [] words = { "Hello","Alaska","Dad","Peace"};
        findWords(words);
    }
    public static String[] findWords(String[] words) {
        String [] keyboard= {
                "qwertyuiop",
                "asdfghjkl",
                "zxcvbnm"
        };
//        words = ["Hello","Alaska","Dad","Peace"]
        int countTotal = 0;
        for (int i = 0; i < words.length; i++) {
            String itemLowerCase = words[i].toLowerCase();
            int count = 0;
            for (int j = 0; j < itemLowerCase.length(); j++) {
                for(int k = 0;k< keyboard.length;k++) {
                    if (keyboard[k].contains(itemLowerCase.toCharArray()[j] + "")) {
                        count++;
                    }
                }
            }
            if (count == itemLowerCase.length()) {
                countTotal++;
            }
        }
        System.out.println(countTotal);
        return null;
    }
}

# September15_2025
The problem that i solved today in leetcode

There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

Code:
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] x=text.split(" ");
        Set<Character> set=new HashSet<>();
        for(char c:brokenLetters.toCharArray())
            set.add(c);
        int cnt=0;
        for(String a:x)
        {
            boolean flag=true;
            for(char c:a.toCharArray())
            {
                if(set.contains(c))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                cnt++;
        }
        return cnt;
    }
}

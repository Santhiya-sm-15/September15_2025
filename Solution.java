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
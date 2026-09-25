class Solution {
    public String sortVowels(String s) {
        List<Character> li=new ArrayList<>();
        for(char i:s.toCharArray())
        {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U') li.add(i);
        }
        Collections.sort(li);
        StringBuilder str=new StringBuilder();
        int idx=0;
        for(char i:s.toCharArray())
        {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U') str.append(li.get(idx++));
            else str.append(i);
        }
        return str.toString();
    }
}
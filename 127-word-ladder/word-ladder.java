class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> jha = new HashSet<>(wordList);
        if(!jha.contains(endWord)) return 0;
        Queue<String> ans = new LinkedList<>();
        ans.offer(beginWord);
        int levels = 1;

        while(!ans.isEmpty()){
            int size = ans.size();
            for(int i = 0;i<size;i++){
              String word = ans.poll();
              if(word.equals(endWord)) return levels;
              char[] chars = word.toCharArray();
              for(int j = 0;j<chars.length;j++){
                char original = chars[j];
                for(char ch = 'a';ch<='z';ch++){
                    chars[j] = ch;
                    String next = new String(chars);
                    if(jha.contains(next)){
                        ans.offer(next);
                        jha.remove(next);
                    }
                }
                chars[j] = original;
              }
            }
            levels++;
        }
        return 0;
    }
}
class Solution {
    int count = 0;
    public int numTilePossibilities(String tiles) {
        boolean[] used = new boolean[tiles.length()];
        char[] ch = tiles.toCharArray();
        Arrays.sort(ch);
        back(used,0,ch);
        return count ;
    }
    public void back(boolean[] used , int index , char[] ch){
        if(index == ch.length){
            return ;
        }
        for(int i=0;i<ch.length;i++){
            if(used[i]){
                continue ;
            }
            if(i>0 && ch[i] == ch[i-1] && !used[i-1]){
                continue ;
            }
            used[i] = true ;
            count ++ ;
            back(used , index+1 , ch);
            used[i] = false ;
        }
    }
}
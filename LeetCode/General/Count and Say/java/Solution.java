1class Solution {
2    public String countAndSay(int n) {
3        StringBuilder last = new StringBuilder("1");
4
5        for(int i = 2;i <= n;i++){
6            StringBuilder str = new StringBuilder();
7            int count = 1;
8            for(int j = 1;j < last.length();j++){
9                if(last.charAt(j) != last.charAt(j - 1)){
10                    str.append(count); str.append(last.charAt(j - 1));
11                    count = 1;
12                }else{
13                    count++;
14                }
15            }
16            if(count >= 0){
17               str.append(count); str.append(last.charAt(last.length() - 1)); 
18            }
19
20            last = str;
21        }
22        return last.toString();
23    }
24}
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> pair : knowledge){
            map.put(pair.get(0),pair.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) != '('){
                ans.append(s.charAt(i));
            }
            else{
                i++;
                StringBuilder sb = new StringBuilder();
                while(s.charAt(i) != ')'){
                    sb.append(s.charAt(i));
                    i++;
                }
                String key = sb.toString();
                if(map.containsKey(key)){
                    ans.append(map.get(key));
                }
                else{
                    ans.append("?");
                }
            }
        }
        return ans.toString();
    }
}
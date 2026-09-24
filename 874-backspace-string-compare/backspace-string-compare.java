class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(ch);
            }
        }
        for(int i=0 ; i<t.length() ; i++){
            char ch = t.charAt(i);
            if(ch == '#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
              else{
                    st2.push(ch);
                }
        }
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        // for(char x : st1){
        //     sb1.append(x);
        // }
        // for(char x : st2){
        //     sb2.append(x);
        // }
        // return sb1.toString().equals(sb2.toString());
        return st1.equals(st2);
    }
}
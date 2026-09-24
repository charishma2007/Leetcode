class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<n ; i++){
            String op = operations[i];
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            else if(op.equals("+")){
                st.push(st.peek() + st.get(st.size() - 2));
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int x : st){
            sum += x;
        }
        return sum;
        
    }
}
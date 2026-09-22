class Solution {
    public String predictPartyVictory(String senate) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        ArrayDeque<Integer> r = new ArrayDeque<>();
        for(int i=0 ; i<senate.length() ; i++){
            if(senate.charAt(i) == 'D'){
                d.offer(i);
            }
            else{
                r.offer(i);
            }
        }
        while(!d.isEmpty() && !r.isEmpty()){
            if(d.peek() < r.peek()){
                d.offer(d.poll()+senate.length());
                r.poll();
            }
            else{
                d.poll();
                r.offer(r.poll()+senate.length());
                
            }
        }
        if(d.isEmpty()){
            return "Radiant";
        }
        return "Dire";
    }
}
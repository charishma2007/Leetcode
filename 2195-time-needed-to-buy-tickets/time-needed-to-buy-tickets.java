class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0 ; i<tickets.length ; i++){
            q.offer(i);
        }
        int turns=0;
        while(tickets[k] > 0){
            int front = q.poll();
            tickets[front]--;
            turns++;
            if(tickets[front] > 0){
                q.offer(front);
            }
            
        }
        return turns;
    }
}
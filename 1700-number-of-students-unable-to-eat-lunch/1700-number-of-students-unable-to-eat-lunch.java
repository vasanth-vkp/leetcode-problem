class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count=0;
        Queue<Integer>qu=new LinkedList<>();
        for(int num:students){
            qu.offer(num);
        }
        Stack<Integer>st=new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int rotations=0;
         while (!qu.isEmpty()&&!st.isEmpty()) {
            int val = qu.poll();
            int top = st.peek();

            if (val != top) {
                qu.offer(val);
                rotations++;
                if (rotations==qu.size()) {
                    break;
                }
            } else {
                st.pop();
                rotations = 0; 
            }
        }
        return qu.size();
    }
}
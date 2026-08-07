class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()&& ch!='#'){
                st.push(ch);
            }
            else if(ch=='#'){
                if(st.isEmpty()){
                    continue;
                }
                else{
                st.pop();
                } 
            }
            else{
                st.push(ch);
            }
        }
        Stack<Character>st2=new Stack();
        for(char ch:t.toCharArray()){
            if(st2.isEmpty() && ch!='#'){
                st2.push(ch);
            }
            else if(ch=='#'){
                if(st2.isEmpty()){
                    continue;
                }
                else{
                st2.pop();
                } 
            }
            else{
                st2.push(ch);
            }
        }
        StringBuilder ans1=new StringBuilder();
        while(!st.isEmpty()){
            ans1.append(st.pop());
        }
        StringBuilder abs2=new StringBuilder();
        while(!st2.isEmpty()){
            abs2.append(st2.pop());
        }
        return ans1.toString().equals(abs2.toString());
    }
}
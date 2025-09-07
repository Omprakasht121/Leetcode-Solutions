class Solution {
    public int lastRemaining(int n) {

        //brute force approach
        // List<Integer>list =new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     list.add(i);
        // }
        // boolean flag =true;
        // while(list.size() > 1){
        //     if(flag){
        //         int i =0;
        //         if(list.size() %2==0){
        //             i=list.size()-2;
        //         }
        //         else i =list.size()-1;
                
        //         while(i>=0){
        //             list.remove(i);
        //             i = i-2;
        //         }
        //     }
        //     else if(!flag){
        //         int j=list.size()-1;
        //         while(j>=0){
        //             list.remove(j);
        //             j =j-2;
        //         }
        //     }
        //     flag = !flag; 
            
        //     }
        // return list.get(0);

        int head =1;
        int step =1;
        int remaining  =n;
        boolean left =true;
        while(remaining >1){
            if(left || remaining % 2 ==1){
                head =head +step;
            }
            step = step*2;
            remaining = remaining/2;
            left = !left;
        }
        return head;
    }
}
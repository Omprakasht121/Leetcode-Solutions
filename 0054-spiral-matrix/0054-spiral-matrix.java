class Solution {
   
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list= new ArrayList<>();
        helper(matrix, 0, matrix[0].length, 0, matrix.length,list);
        return list;
    }
    public void helper(int[][] matrix, int left, int right, int top,int bottom, List<Integer> list){
        if(left>=right || top>=bottom){
            return;
        }
        for(int i =left;i<right;i++){
            list.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<bottom;i++){
            list.add(matrix[i][right-1]);
        }
        right--;
        if(top<bottom){
            for(int i=right-1;i>=left;i--){
                list.add(matrix[bottom-1][i]);
            }
            bottom--;
        }
        if(left<right){
            for(int i=bottom-1;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
        }
        
        helper(matrix, left,right, top, bottom, list);
    }
}
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        float dia = (float)0;
        int area = 0;
        for(int temp[] : dimensions){
            int a =(int) Math.pow(temp[0],2);
            int b =(int) Math.pow(temp[1],2);
            float dia1 =(float) Math.sqrt(a+b);
            if(dia1>dia){
                dia = dia1;
                area = temp[0] * temp[1]; 
            }
            else if(dia1 == dia){
                area = (int) Math.max(area,temp[0]*temp[1]);
            }
        }
        return area;
    }
}
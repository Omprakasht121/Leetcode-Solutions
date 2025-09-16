class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        Map<Integer,String> map = new HashMap<>();
        for(int i=0;i<10;i++){
            map.put(i,String.valueOf(i));
        }
        map.put(10,"a");
        map.put(11,"b");
        map.put(12,"c");
        map.put(13,"d");
        map.put(14,"e");
        map.put(15,"f");
        long n = num & 0xFFFFFFFFL;
        // String map = "0123456789abcdef".toCharArray();
        String ans = "";
        while(n>0){
            int x = (int)(n % 16);
            ans = map.get(x) + ans;
            n = n/16;
        }
        return ans;
    }
}
class Solution {
    public String getHint(String secret, String guess) {
        int bull =0;
        int cow=0;
        int gcount[] = new int[10];
        int scount[] = new int[10];
        for(int i=0;i<secret.length();i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s == g){
                bull++;
            }
            else{
                gcount[g-'0']++;
                scount[s-'0']++;
            }
        }
        for(int i=0;i<10;i++){
            cow+= Math.min(scount[i], gcount[i]);
        }

        return bull + "A" + cow + "B";
    }
}
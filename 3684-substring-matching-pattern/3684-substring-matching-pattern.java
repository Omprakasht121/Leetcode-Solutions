class Solution {
    public boolean hasMatch(String s, String p) {
        int index = p.indexOf('*');
        String p1 = p.substring(0,index);
        String p2 = p.substring(index+1,p.length());
        int a = s.indexOf(p1);
        if(a==-1) return false;
        if(p2 == "") return true;
        int b = s.indexOf(p2,a+p1.length());
        
        return b!=-1;

        // StringBuilder sb = new StringBuilder(s);
        // for(int i=0;i<p.length();i++){
        //     char c = p.charAt(i);
        //     if(c == '*') continue;
        //     else if(s.contains(String.valueOf(c))){
        //         int a = s.indexOf(c);
        //         s = s.substring(0,a)+s.substring(a+1,s.length());
               
        //     }
        //     else return false;
            
        // }
        // return true;
    }
}
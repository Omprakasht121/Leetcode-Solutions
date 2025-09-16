import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            ans.add(num);

           
            while (ans.size() >= 2) {
                int last = ans.get(ans.size() - 1);
                int secondLast = ans.get(ans.size() - 2);

                int gcd = findGCD(secondLast, last);

                if (gcd == 1) {
                    break; 
                }

               
                int lcm = (secondLast / gcd) * last;

              
                ans.remove(ans.size() - 1);
                ans.remove(ans.size() - 1);
                ans.add(lcm);
            }
        }

        return ans;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

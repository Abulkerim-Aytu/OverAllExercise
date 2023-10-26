package algo_beginner;

import java.util.HashSet;
import java.util.Set;

public class findGreaterElement {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pgtrwwkewpoql"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength= 0;
        int left = 0;
        char [] arr = s.toCharArray();

        Set<Character> cha = new HashSet();

        for(int right = 0; right< arr.length; right++){
            if(!cha.contains(arr[right])){
                cha.add(arr[right]);
                maxLength= Math.max(maxLength,right - left +1);
            }else{
                while(cha.contains(arr[right])){
                    cha.remove(arr[left]);
                    left++;
                }
                cha.add(arr[right]);
            }
        }

        return maxLength;
    }
}

import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] newList = Arrays.stream(nums).distinct().toArray();
        return Math.min(nums.length / 2, newList.length);
    }
}
package Main;


public class Main {
    public static void main(String[] args) {
        int x = 1234321;
        int x1 = 1;
        int x2 = 0;
        int i = -1;
        String s = Integer.toBinaryString(i);

        System.out.println(s);
    }

    public static boolean number(int key){
        if(key < 0) return false;
        if(key <= 9) return true;
        int num = 0,tmp = key;
        while (tmp > 0){
            int x = tmp % 10;
            num = num * 10 + x;
            tmp = tmp / 10;
        }
        return num == key;
    }
    public static boolean numberTwo(int key){
        if(key < 0) return false;
        if(key <= 9) return true;
        String s = String.valueOf(key);
        StringBuffer sb = new StringBuffer(s);
        String s1 = sb.reverse().toString();
        return s.equals(s1);
    }
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left < right ){
            if(nums[left] + nums[right] < target){
                left++;
            }
            if(nums[left] + nums[right] > target){
                right--;
            }
            if(nums[left] + nums[right] == target){
                return new int[]{left,right};
            }
        }
        return null;
    }
}

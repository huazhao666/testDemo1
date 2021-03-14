package 测试;

import java.util.*;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-03-13
 * Time : 16:08
 */
public class Main3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
        double x = 0.6332;

            String s = "a1234b0122232";
            Stack<Integer> stack = new Stack<>();
            List<String> list = new ArrayList<>();
            int i = 0;
            for (; i < s.length() ; i++) {
                char x111 = s.charAt(i);
                if(x >= '0' && x <= '9'){
                    stack.push(i);
                }else {
                    if(!stack.isEmpty()){
                        int top = stack.peek();
                        while (stack.size() > 1){
                            stack.pop();
                        }
                        int bottom = stack.pop();
                        list.add(s.substring(bottom,top+1));
                    }
                }
            }
        if(!stack.isEmpty()){
            int top = stack.peek();
            while (stack.size() > 1){
                stack.pop();
            }
            int bottom = stack.pop();
            list.add(s.substring(bottom,top+1));
        }
        List<String> list1 = new ArrayList<>();
            for (String s1 : list) {
                int j = 0;
                for (; j <s1.length()-1; j++) {
                    if(s1.charAt(j) != '0'){
                        break;
                    }
                }

                list1.add(s1.substring(j));

            }




    }

}
class Base{

    public Base() {
    }
}
class  a extends Base{
     public void fun(int n){

    }
}

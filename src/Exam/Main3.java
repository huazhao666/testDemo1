package Exam;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-03-17
 * Time : 19:43
 */
public class Main3 {
    public static void main (String[] args){
        int numYear = 15;
        String s1 = "";
        String s2 = "";
        for(int i = 1;i <= 15;i++){
            s1 = s1+ "第"+ i + "年"+" ";
            s2 = s2+help(i) + " ";
        }
        System.out.println(s1);
        System.out.println(s2);
    }
    public static int help(int n){
        int count = 1;
        for(int i = 1; i <= n;i++){
            //第二年
            if( i == 2){
                count = count + help(n-2);
            }else {
                //第四年
                if(i == 4){
                    count = count+help(n-4);
                }else {
                    //第五年；
                    if(i == 5){
                        count = count -1;
                    }
                }
            }
        }
        return count;
    }
}

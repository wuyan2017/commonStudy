import java.util.Scanner;

public class WanQuanShu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str=String.valueOf(a);
        Change(str);
    }
    public static void Change(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        String ss=sb.reverse().toString();
        if(s.equals(ss)){
            System.out.println(true);
        }else
            System.out.println(false);
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class ChangeMinNum {
    /**
     * Q68输入一个正整数数组，将它们连接起来排成一个数，输出能排出的所有数字中最小的一个。
     * 例如输入数组{32,  321}，则输出这两个能排成的最小数字32132。请给出解决问题的算法，并证明该算法。
     */
    public static void main(String[] args) {
        int[][] val = {
                {532, 45, 78},//4553278
                {2, 23, 231},//223123
                {2, 3, 1},//123
        };
        for (int[] x : val) {
            String result = minNumFromIntArray(x);
            System.out.println(result);
        }
    }
    public static String minNumFromIntArray(int[] x) {
        String[] strs = stringsOf(x);
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String each : strs) {
            sb.append(each);
        }
        return sb.toString();
    }

    public static String[] stringsOf(int[] x) {
        int len = x.length;
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] = "" + x[i];
        }
        return strs;
    }
}
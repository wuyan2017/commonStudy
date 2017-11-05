import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("wuyan",100);
        map.put("zhangsan",120);
        map.put("lisi",200);
        //entry取出key和value
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        //增强for循环分别取出key和value
        for (String name:map.keySet()) {
            System.out.println(name);
        }
        for (Integer num:map.values()) {
            System.out.println(num);
        }
    }
}

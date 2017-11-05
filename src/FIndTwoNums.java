public class FIndTwoNums{
    public static void main(String[] args) {
        int []a={1,1,2,2,3,4};
        getTheTwo(a);
    }
    public static void getTheTwo(int[] arr){
        int num1=0,num2=0;
        if(arr == null || arr.length <= 1)
            return;
        int len = arr.length;
        int tmp = arr[0];
        for(int i = 1; i < len; i++){
            tmp ^= arr[i];
        }
        int index = findFirstOne(tmp);
        for(int i = 0; i < len; i++){
            if(isOne(arr[i],index)){
                num1 ^= arr[i];
            }else{
                num2 ^= arr[i];
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }
    public static int findFirstOne(int n){
        int i = 0;
        while((n & 1) == 0){
            i++;
            n = n >> 1;
        }
        return i;
    }
    public static boolean isOne(int num,int index){
        if(((num >> index) & 1) == 1)
            return true;
        return false;
    }
}

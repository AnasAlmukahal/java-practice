import java.util.Arrays;
public class main {
    public static void main(String[] args)
    {
        A1 test = new A1();
        int[] p = {1,2,3,4,5,6,7};
        test.reverse(p);
        System.out.println(Arrays.toString(p));
    }
}
class A1{
    public static void reverse(int[] arr){
        int i = 0;
        int s = arr.length - 1;
        while(i < s){
            int temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
            i++;
            s--;
        }
    }
}
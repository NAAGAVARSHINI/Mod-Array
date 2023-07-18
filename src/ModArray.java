import java.util.Scanner;

public class ModArray {

    static int modArray(int[] arr, int b, int n){
        int result=0;
        for(int i=0;i<n;i++){
            result = result*10 +arr[i];
        }
        int ans = result % b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int b= sc.nextInt();
        System.out.println(modArray(arr, b, n));
    }
}

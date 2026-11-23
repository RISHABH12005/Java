import java.util.Arrays;
import java.util.Scanner;
public class LRA{
    public static void LR(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);}
    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;}
    }
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();}
        System.out.print("Enter number of rotations (k): ");
        int k=sc.nextInt();
        System.out.println("Original Array: "+Arrays.toString(arr));
        LR(arr,k);
        System.out.println("Array after "+k+" left rotations: "+Arrays.toString(arr));
        sc.close();}
}
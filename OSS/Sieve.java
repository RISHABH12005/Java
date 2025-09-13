// Sieve of Eratosthenes
import java.util.Scanner;
public class Sieve{
    static int SIZE;
    static boolean[] prime;
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. N: ");
        SIZE=sc.nextInt();
        sc.close();
        prime=new boolean[SIZE + 1];
        initialization();
        int p=2;
        while(p*p<=SIZE){
            crossOff(p);
            p=getNextPrime(p);
            if(p==-1) break;}
        System.out.println("Primes up to "+SIZE+":");
        for(int i=2;i<=SIZE;i++){
            if(prime[i]) {
                System.out.print(i + " ");}
        }}
    public static void initialization(){
        for(int i=2;i<=SIZE;i++){
            prime[i]=true;}
    }
    public static void crossOff(int p){
        for(int i=p*p;i<=SIZE;i+=p){
            prime[i]=false;}
    }
    public static int getNextPrime(int p){
        for(int i=p+1;i<=SIZE;i++){
            if(prime[i]){
                return i;}
        }
        return -1;}
}
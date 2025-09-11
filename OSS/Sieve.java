# sieve of Eratosthenes
public class Sieve{
    static final int SIZE = 12;
    static boolean[] isPrime = new boolean[SIZE+1];
    public static void main(String[] args) {
        initialization();
        int p = 2;
        while(p*p<=SIZE){
            crossOff(p);
            p = getNextPrime(p);
            if(p==-1) break;}
        System.out.println("Primes up to "+SIZE+":");
        for(int i=2;i<=SIZE;i++){
            if (isPrime[i]){
                System.out.print(i+" ");}
        }
    }
    public static void initialization(){
        for(int i=2;i<=SIZE;i++){
            isPrime[i]=true;}
    }
    public static void crossOff(int p){
        for(int i=p*p;i<=SIZE;i+=p){
            isPrime[i]=false;}
    }
    public static int getNextPrime(int p){
        for(int i=p+1;i<=SIZE;i++){
            if(isPrime[i]) {
                return i;}
        }
        return -1;}
}

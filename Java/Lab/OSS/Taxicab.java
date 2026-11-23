import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        sc.close();
        Map<Integer, List<int[]>> map = new HashMap<>();
        int max = (int) Math.cbrt(N);
        for (int a = 1; a <= max; a++) {
            for (int b = a; b <= max; b++) {
                int sum = a * a * a + b * b * b;
                if (sum <= N) {
                    map.putIfAbsent(sum, new ArrayList<>());
                    map.get(sum).add(new int[]{a, b});}
            }
        }
        for (Map.Entry<Integer, List<int[]>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                System.out.print(entry.getKey() + " = ");
                for (int[] pair : entry.getValue()) {
                    System.out.print("(" + pair[0] + "," + pair[1] + ") ");}
                System.out.println();}
        }
    }
}

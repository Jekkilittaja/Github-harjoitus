import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        int[] ans = new int[7];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(6) + 1;
        }
        try {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            Thread.sleep(3000);
            for(int i = 0; 1 < 20; i++){
                System.out.println();
                if (i == 19) {
                    break;
                }
            }
        }
        catch(InterruptedException ex) { 
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Anna " + (i+1) + "." + "numero:");
            ans[i] = sc.nextInt();
        }

        System.out.println("Oikeat numerot: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        System.out.println("Sinun numerosi: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}

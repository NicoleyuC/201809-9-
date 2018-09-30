import java.util.Scanner;

public class arr09302 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lifun [ ] = new int[6];
        int sum = 0;
        for (int i =0 ; i < lifun.length ; i++){
            lifun[i] = sc.nextInt();
            sum += lifun[i]*lifun[i]*lifun[i]; // 這行要理解
        }
        System.out.println(sum);
    }
}

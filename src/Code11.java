import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        System.out.print("choose n : ");
        Scanner kb_input = new Scanner(System.in);
        int n = kb_input.nextInt();

        System.out.print("write down n numbers : ");

        int [] num_arr = new int[n];
        for(int i=0; i<n; i++){
            num_arr[i] = kb_input.nextInt();
        }
        int count = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(num_arr[i] == num_arr[j]) {
                    count += 1;
                }
            }
        }

        System.out.println("Number of couples : "+count);
        kb_input.close();
    }
}

//테스트 코드11-new
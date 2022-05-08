import java.util.Scanner;

public class Java_Loop2 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = 0;
            int temp = 1;
            for(int j = 0;j<n;j++){
                sum = sum + b*temp;
                System.out.print(a+sum+" ");
                temp = temp*2;
            }
            System.out.println();
        }
        in.close();
    }
}
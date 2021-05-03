import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int num;
		
		int []n = new int[11];
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(int i =0; i<num; i++) {
			n[i] = scanner.nextInt();
		}
		for(int j = 0; j<num; j++) {
			int sum = 0;
			for(int k =1; k<=n[j]; k++) {
				if(k % 2 != 0) {
					sum += k;
				}
				else {
					sum -= k;
				}
			}
			System.out.println("#"+(j+1)+" "+sum);
		}
		
	}

}

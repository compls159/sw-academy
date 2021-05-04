import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int num;
		int [][]n = new int[10000][11];
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		for(int i =0; i<num; i++) {
			for(int j =0; j<10; j++)
			n[i][j] = scanner.nextInt();
		}
		for(int j = 0; j<num; j++) {
			double result =0;
			double sum = 0;
			int max = 0;
			int min = 10000;
			for(int k =0; k<10; k++) {
				if(max < n[j][k])
					max = n[j][k];
			}
			for(int l =0; l<10; l++){
				if(min > n[j][l])
					 min = n[j][l];
			}
			for(int q =0; q<10; q++) {
				sum += n[j][q];
			}
			result = Math.round((sum-max-min)/8);
			System.out.println("#"+(j+1)+" "+(int)result);
		}
		
	}

}

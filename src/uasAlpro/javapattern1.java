package uasAlpro;

public class javapattern1 {
	public static void main(String[] args) {
		int n = 5;
		int i, j; 
		for(i=0; i<=n; i++){
			for(j=3; j>1; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
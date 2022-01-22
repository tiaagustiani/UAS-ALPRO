package uasAlpro;

public class SoalUAS4 {
	public static void main(String[] args) {
		int n = 5;
		int i, j; 
	    for(i=1; i<=n; i++){
            for(j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

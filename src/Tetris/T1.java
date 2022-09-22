package Tetris;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TT m=new TT();
		int[][] arr1 = {
	            { 1, 1, 1, 1 },
	            { 0, 0, 0, 1 }, 
	            { 0, 0, 0, 1 },
	            { 0, 0, 0, 1 },
	            };
	      int[][] arr2 = {
	            { 2, 2, 0 },
	            { 0, 2, 0 }, 
	            { 0, 2, 2 },
	      		};
	      
		m.r_totation(arr1);
		m.r_totation(arr2);
	    
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
	}

}

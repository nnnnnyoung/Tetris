package Tetris;

public class TT {
	

      
    public void r_totation(int[][] k) {
  	  int Max=k.length-1; //k 행의길이
  	  int Min=0;

  	  

  	  for(int j=0; j<Math.round(Max/2); j++) {
  	  	  int [] a=new int[k.length];
  	  	  int [] b=new int[k.length];
  	  	  int [] c=new int[k.length];
  	  	  int [] d=new int[k.length];
  	  	  
  	  	  for(int i=Min; i<=Max; i++) {
  	  		  a[i]=k[Min][i];
  	  		  b[i]=k[i][Max];
  	  		  c[i]=k[Max][i];  	  				  
  	  		  d[i]=k[i][Min];

  	  	  }
  	  	  for(int i=0; i<=Max; i++) {
  	  		  k[i][Max]=a[i];
  	  	  }
  	  	  for(int i=0; i<=Max; i++) {
  	  		  k[Max][Max-i]=b[i];
  	  	  }
  	  	  for(int i=0; i<=Max; i++) {
  	  		  k[i][Min]=c[i];
  	  	  }
  	  	  for(int i=0; i<=Max; i++) {
  	  		  k[Min][Max-i]=d[i];
  	  	  }

  	  	  
  	  	  Min++;
  	  	  Max--;
  	  }


    }
    
    
}


public class tapeEquilibrium{
	
    public int solution(int[] A) {
        
      int min = 2147483646;
        
      if(A.length == 2){
          min = Math.abs(A[0]-A[1]);
          }
      else{
          int bottom = 0;
          int top = 0;
          int total = 0;
          int value = 0;
          int middle = A.length/2;
          
          for(int i=0;i<middle; i++ ){
              bottom += A[i];
              top += A[A.length-1-i];
              }
              
          if( middle*2 != A.length){
              bottom += A[middle];
              }
              
          total = top + bottom;
          bottom = 0;
          for( int i=0; i<A.length-2; i++){
              bottom+=A[i];
              total-=A[i];
              value = Math.abs(bottom-total);
              if( value < min){
                  min = value;
                  }
              }
              }
          return min;
      }

}

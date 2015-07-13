
public class maxCounters {
	
	public int[] solution(int[] A, int N) {
		
	     int[] solA = new int[N];
	     int max = 0;
	     int setMax = 0;
	     
	     for(int i=0; i<A.length; i++){
	         if(A[i]<=N){
	             
	            if(setMax>0 && solA[A[i]-1]<setMax ){solA[A[i]-1] = setMax;} 
	            solA[A[i]-1]++;
	            if(solA[A[i]-1]>max){max=solA[A[i]-1];}
	            
	         }else{
	            setMax = max;
	            }
	     }
	     
	     
	     for(int i=0; i<N; i++){
	         if(solA[i]<setMax){solA[i]=setMax;}
	         }
	         
	    return solA; 
		
		
	}

}

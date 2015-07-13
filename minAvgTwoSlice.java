
public class minAvgTwoSlice {
	
	 public int solution(int[] A) {
		 
		    boolean more = true;
		    int minP = A.length;
		    int prevP = A.length+1;
		    int items = 2;
		    int counter = 0;
		    double sum = 0;
		    double avg = Double.MAX_VALUE;
		    double minAvg = Double.MAX_VALUE; 
		         
		    if(A.length<4){ minP=0; }else{     
		    while(more==true){
		        
		        for(int i=0; i<A.length-items+1; i++){
		            for(int j=0; j<items; j++){
		                sum += A[i+j];
		                }   
		            avg = sum/items;
		            if(avg<minAvg || (avg==minAvg && i<minP)){ minAvg=avg; minP=i;}
		            sum = 0;
		            }
		            
		        items++;    
		        if(prevP==minP){counter++;}else{ if(counter>0){counter--;}}
		        if(items==A.length || counter>2 ){more=false;}
		        prevP = minP;
		        sum = 0;
		        }
		        	    
		    }    
		    return minP;
	 }

}

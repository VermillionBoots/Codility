import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

     int[] peaks = new int[A.length/2];
     int prevPeak = 0;
     int counter = 0;
     int distance = 0;
     int maxGap = 0;
     int average = 0;
     
     
     for(int i=1;i<A.length-1;i++){
        if(A[i-1]<A[i] && A[i]>A[i+1]){
            distance = Math.abs(prevPeak-i);
            if(distance>maxGap && prevPeak!=0){maxGap=distance;}
            peaks[counter] = distance;
            counter++;
            prevPeak=i;
            } 
         }
         
    if(counter<3){return counter;};        
    
    int flags = 1;
    for(int i=1; i<counter; i++ ){
        if(peaks[i]>=counter){flags++;}
    }
    if(counter==flags){return flags;}
    
    int sum = 0;
    int peaksNr = counter;
    int planted;

    flags ++;
    boolean found = true;    
    while(found==true){
      sum = 0;
      planted = 1;
      peaksNr = counter;
      for(int i=1;i<counter;i++){
        sum += peaks[i];
        if(sum>=flags){
            sum=0;
            planted++; 
            if(planted==flags){flags++; break;}
            }else{peaksNr--;if(peaksNr<flags){flags--;found=false;break;}}
      }    
    }
    
    return flags;     

    }
}

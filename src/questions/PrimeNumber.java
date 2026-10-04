package questions;
public class PrimeNumber{    
 public static void main(String args[]){    
  int i,m=0;
  boolean rk = false;      
  int n=21;//it is the number to be checked    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     rk = true;      
     break;      
    }      
   }
   
   
   
   
   if(!rk)  { System.out.println(n+" is prime number"); } 
   else if (rk) {
	   System.out.println(n+" is not prime number");
   }
  }//end of else  
}    
} 
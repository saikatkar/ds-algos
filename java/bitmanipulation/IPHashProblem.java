package bitmanipulation;

public class IPHashProblem
{

	public static void main(String args[]){
		
		System.out.println((int)(Math.log(3)/Math.log(2)+1));
		int N =1;

        for (int i = 0; i < N; i++) {	
           long k = 1;
           long kbits =(int)(Math.log((double)k)/Math.log(2)+1);
           if(kbits <=2){
        	   kbits =3;
           }
           if((k & 1) == 0){
               System.out.println(k+1);
           }else{
               for(int j = 0; j< kbits;j++){
                   
                   if((k & (1<<j)) == 0){
                       
                       System.out.println(k+(1<<j));
                       break;
                   }
               }
		
           }

       } 
	}
}
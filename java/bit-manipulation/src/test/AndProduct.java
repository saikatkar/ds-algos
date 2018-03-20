package test;

public class AndProduct
{

	public static void main(String []args){
		
		for(int i = 0; i<1;i++){
            long a = 12 ;//reader.nextLong();
            long b = 15 ;//reader.nextLong();
            long result =0L;
            while(a != 0 && b!= 0){
            		int msb_a = 63 - Long.numberOfLeadingZeros(a);
                int msb_b = 63 - Long.numberOfLeadingZeros(b);
                if(msb_a != msb_b){
                	break;
                }
                result += (1L << msb_a);
                a = a - (1L << msb_a);
                b = b - (1L << msb_a);
                	
            }
            System.out.println(result);
            
            
            }
        }
	}


package test;

public class Foo {


    // left and right are either of type
    // Integer or of type Foo, never any other type
    Object left;
    Object right;
    
    public Foo(Object left, Object right) {
        this.left = left;
        this.right=right;

    }
    
   
    public Integer sumOfLeftAndRight() {
    	
    	return findSum(this.left,this.right);
        
      
        }
    
    private Integer findSum(Object left , Object right){
    	
    	 if(left instanceof Integer && right instanceof Integer){
    		 
    		 return (Integer)left + (Integer)right;
    	 }else if(left instanceof Foo && right instanceof Integer){
    		 
    		 Foo leftFoo = (Foo)left;
    		 return findSum(leftFoo.left, leftFoo.right) + (Integer)right;
    	 }else if(left instanceof Integer && right instanceof Foo){
    		 
    		 Foo rightFoo = (Foo)right;
    		 return (Integer)right + findSum(rightFoo.left, rightFoo.right) ;
    	 }else{
    		 Foo leftFoo = (Foo)left;
    		 Foo rightFoo = (Foo)right;
    		 return findSum(leftFoo.left,leftFoo.right) + findSum(rightFoo.left, rightFoo.right);
    	 }
    	 
    	 
    }


	
    


}



/* Usage would be for example


*/
package test;

class Super 
{ 
    public Integer getLength() 
    {
        return 4;
    } 
} 

public class Sub extends Super 
{ 
    public Long getLength(int a) 
    {
        return 5L;
    } 

    public static void main(String[] args) 
    { 
    	int I = 1;
        do while ( I < 1 )
        System.out.print("I is " + I);
        while ( I > 1 ) ;
    	
        Super sooper = new Super(); 
        Sub sub = new Sub(); 
        System.out.println( 
        sooper.getLength().toString() + "," + sub.getLength().toString() ); 
    } 
}
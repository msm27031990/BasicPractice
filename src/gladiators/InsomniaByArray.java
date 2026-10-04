package gladiators;

public class InsomniaByArray {
	static int a[]= new int[10];;
	public static void main(String args[])
	{
	int n=212;int n1=n,n2=n;int i=0;int result,counter=1,finl;
	
	if(n==0)
		System.out.println("Insomnia");
	do{
		n1=n;
		n1=n1*counter;
		System.out.println("N" + n1);
		finl=n1;
		n2=finl;
		counter++;
		i=0;
		
			while(n1>0)
		{
			n1=n1/10;
			i=i+1;
		}
		
		for(int j=0;j<i;j++)
		{
			int k=finl%10;
			a[k]=1;
			finl=finl/10;
		}
		
		result=check_array(a);
		
	}while(result<1);
	System.out.println("...And the result is "+n2);
	}
	
	public static int check_array(int[] a)
	{
		int result=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<1)
			{
				result=0;
				break;
			}
		}
		return result;
	}
	
}

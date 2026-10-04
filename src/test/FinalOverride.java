package test;

public class FinalOverride {
	
	public FinalOverride(){
		
	}
	
	public final void disply(){
		System.out.println();
	}

}

class FinalOverrider extends FinalOverride {
	
	public FinalOverrider(int a){
		
	}
	
	public void disply1(){
		System.out.println();
	}

}

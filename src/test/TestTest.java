package test;

import java.io.Serializable;

public class TestTest  implements Comparable<TestTest> {

	TestTest(){
		super();
		System.out.println("TestTest");
	}
	public static void main(String[] args) {
		"abc".substring(0);
		
		new TestTest();
		System.out.println(AnimalHelperSingleton.ABCD.buildAnimalList());

	}


	@Override
	public int compareTo(TestTest o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}

abstract class DEF implements ABC{
	DEF(){
		System.out.println("DEF");
	}
	
}

interface ABC extends Serializable, Comparable{
	 void display();
}

enum AnimalHelperSingleton {

    ABCD;

    /*private AnimalHelperSingleton(){

    }
*/
    public String buildAnimalList(){
        final String ss = new String("abc");
        return ss;
    }

}

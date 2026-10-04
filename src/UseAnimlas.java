 class Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
}


class Dog extends Animal 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}

public class UseAnimlas 
{
    public static void main (String [] args) 
    {
        Dog d = new Dog();      
        Animal a = (Animal)d;
        d.callme();
        a.callme();
        ((Dog) a).callme2();
        Animal a1 = new Animal();
        //((Dog) a1).callme2();
        CC cc = new CC();
        cc.display();
    }
}


class AA{}
class BB extends AA{}
class CC extends BB{
	public void display() {
		BB bb = new BB();
		CC cc = (CC) bb;
	}
}

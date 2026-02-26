/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{

    private int milk;

    public Cow()
    {
        super(0, "MOO");
        milk = 0;
    }

    public Cow(int age, int milk){
        super(age, "MOO");
        this.milk = milk;
    }

    public void eat(){
			super.eat();
            milk++;
		}   

    public int getMilk(){
        return milk;
    }


}
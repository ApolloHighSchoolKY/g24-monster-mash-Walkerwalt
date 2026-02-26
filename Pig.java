public class Pig extends Animal{
     private int mud;

    public Pig()
    {
        super(0, "OINK");
        mud = 0;
    }

    public Pig(int age, int mud){
        super(age, "OINK");
        this.mud = mud;
    }

    public void eat(){
			super.eat();
            mud++;
		}

    public int getMud(){
        return mud;
    }
}

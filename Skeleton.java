public class Skeleton extends Monster{
    private double speed;

    public Skeleton(){
        speed = 100;
    }

    public Skeleton(String name){
        super(name);
        speed = 100;
    }

    public Skeleton(String name, double speed){
        super(name);
        this.speed = speed;
    }

    public String toString(){
        return super.toString() + "The skeleton's speed is :: " + speed + "\n";
    }
}

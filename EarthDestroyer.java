public class EarthDestroyer extends Monster {
    private int sizeInSuns;

    public EarthDestroyer(String name){
        super(name);
        sizeInSuns = 1;
    }

    public EarthDestroyer(String name, int size){
        super(name);
        sizeInSuns = size;
    }

    //Override kill
    public String kill(){
        return getName() + " destroyed a planet. Billions disentegrated.\n";
    }

    public String catchGame(){
        return getName() + " used the Earth as a baseball for a game of catch.\n";
    }

    public String getSize(){
        return getName() + "'s size is " + sizeInSuns + " measured in suns.\n";
    }
} 

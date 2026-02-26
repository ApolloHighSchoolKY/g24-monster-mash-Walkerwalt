public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster; //NOT ALLOWED
    //Because Monster has a modified constructor but not a default constructor, Monster doesn't INHERIT a default constructor

    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());

    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    System.out.println(((Witch)sally).fly());

    //Declare a Monster
    //Declare your new Type of Monster
    //Bonus challenge: Add an instance field

    Monster galactus = new EarthDestroyer("Galactus");

    System.out.println(galactus);

    System.out.println(galactus.kill());

    System.out.println(((EarthDestroyer)galactus).catchGame());

    System.out.println(((EarthDestroyer)galactus).getSize());

    EarthDestroyer thomas = new EarthDestroyer("Thomas", 15);

    System.out.println(thomas);
    
    System.out.println(thomas.kill());

    System.out.println(thomas.catchGame());

    System.out.println(thomas.getSize());

    Skeleton skelly = new Skeleton();

    System.out.println(skelly);

    skelly = new Skeleton("Giant skelly");

    System.out.println(skelly);
    
  }
}

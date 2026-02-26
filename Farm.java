import java.util.ArrayList;

/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */


public class Farm {

    public static void main(String[] args){
        ArrayList<Animal> farmAnimals = new ArrayList<Animal>();

        farmAnimals.add(new Cow(15, 0));

        farmAnimals.add(new Pig(16, 0));

        farmAnimals.add(new Cow(20, 0));

        farmAnimals.add(new Cow(22, 0));

        for(int i = 0; i < farmAnimals.size(); i++)
        {
            farmAnimals.get(i).eat();
            System.out.println("Animal in position " + i + " has eaten.\n");

             farmAnimals.get(i).speak();
            System.out.println("Animal in position " + i + " says " + farmAnimals.get(i).speak() + "\n");
            //15-20 is the average life expectancy of both cows and pigs hence math.random since animals don't always live to the same age
            if (farmAnimals.get(i).getAge() > Math.random() * 5 + 15) {
                farmAnimals.get(i).kill();
                System.out.println("Animal in position " + i + " was killed.\n");
            }

            //System.out.println(x.getClass());
            if (i > 0)
                System.out.println(farmAnimals.get(i).equals(farmAnimals.get(i - 1)) + "\n");
        }
    }


}
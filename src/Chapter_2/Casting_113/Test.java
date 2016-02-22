package Chapter_2.Casting_113;

/**
 * Created by MaxiM on 15.11.2015.
 */
public class Test {

    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Dog(), new Animal(), new BulDog()};
        for (Animal animal : animals) {
            animal.makeNoise();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.playDead();
            }
        }

        System.out.println("1---------------1");

        for (Animal animal : animals) {
            System.out.println("insOf DOG - " + (animal instanceof Dog));
        }

        for (Animal animal : animals) {
            System.out.println("insOf BulDog - " + (animal instanceof BulDog));
        }

        System.out. println("2-------------2");
        Dog dog = new Dog();
        Dog dog_2 = new BulDog();
        //BulDog bulDog_3 = (BulDog) dog;//Class cast Exc!
        BulDog bulDog_3 = (BulDog) dog_2;//Class cast Exc!
        BulDog bulDog_2 = new BulDog();

        Pet pet = bulDog_2;

        pet.beFrendly();

        System.out.println("Dog insOf Anim - " + (dog instanceof Animal));
        System.out.println("bulDog_3 insOf Anim - " + (bulDog_3 instanceof Animal));
    }

}

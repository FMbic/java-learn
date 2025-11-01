public class animalCarnival
{
    public static void main(String[]args)
    {
        class genericAnimal
        {
            public void makeSound()
            {
                String generic = "Generic";
                System.out.println("Some generic animal sound  " + generic);
            }
        }
        class Dog extends genericAnimal
        {   @Override
            public void makeSound()
            {
                String dogSound = "Bark bark";
                System.out.println("I'm a dog i make that sound " + dogSound);
            }
        }
        class Cat extends genericAnimal
        {
            @Override
            public void makeSound()
            {
                String catSound = "Meow meow";
                System.out.println("I'm a cat i make that sound " + catSound);
            }
        }
        class shyAnimal extends genericAnimal
        {

        }
        Dog cDog = new Dog();
        Cat cCat = new Cat();
        genericAnimal generic = new genericAnimal();
        shyAnimal shy = new shyAnimal();

        generic.makeSound();
        cDog.makeSound();
        cCat.makeSound();
        shy.makeSound();
    }


}

public class overriding {
    public static void main(String[] args) {
        class parent {
            public void makeSound() {
                System.out.println("Hello i'm a mother");
            }
        }
        class child extends parent {
            @Override
            public void makeSound() {
                System.out.println("Hello i'm a child");
            }
        }
        class secondChild extends parent
        {
            @Override
            public void makeSound() {
                System.out.println("Hello i'm a second child");
            }
        }
        parent mum  = new parent();
        child child1 = new child();
        secondChild child2 = new secondChild();

        System.out.println("Mum says ");
        mum.makeSound();
        System.out.println("Child says ");
        child1.makeSound();
        System.out.println("Second Child says ");
        child2.makeSound();

    }
}


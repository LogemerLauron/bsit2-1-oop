public class Main {
    public static void main(String[] args) {
        System.out.println("Main Branch!");
        }
        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("===========================");

        Pet buddy = new Dog("Buddy", 3);
        Pet whiskers = new Cat("Whiskers", 2);
        Pet tweety = new Bird("Tweety", 1);


        buddy.displayInfo();
        buddy.makeSound();

        whiskers.displayInfo();
        whiskers.makeSound();

        tweety.displayInfo();
        tweety.makeSound();


        System.out.println("\nTraining Session Started!");
        System.out.println("=========================");

        startTraining((Trainable) buddy);
        startTraining((Trainable) tweety);
    }

    public static void startTraining(Trainable pet) {
        pet.performTrick();
    }
}

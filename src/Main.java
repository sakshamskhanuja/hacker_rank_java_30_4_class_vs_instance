import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Scans the number of input that will be provided by the user.
        int T = scanner.nextInt();

        // Prints the category of age in which the person belongs.
        for (int i = 0; i < T; i++) {
            // Scans the age.
            int age = scanner.nextInt();

            // Initializing a Person.
            Person p = new Person(age);

            // Prints the age category.
            p.amIOld();

            // Incrementing the age.
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }

            // Prints the age category.
            p.amIOld();

            // Divider
            System.out.println();
        }

        // Closes the scanner.
        scanner.close();
    }
}

class Person {

    // Represents the age of a person.
    private int age;

    /**
     * Creates a Person object.
     *
     * @param initialAge should be positive.
     */
    public Person(int initialAge) {
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    /**
     * Increments the age by 1.
     */
    public void yearPasses() {
        age++;
    }

    /**
     * Prints the category in which the person's age stand.
     */
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // ArrayList = a single data type that is dynamically sized
    public static void main(String[] args) {
	// write your code here
        ArrayList<Cat> clowder = new ArrayList<>();
        // Default capacity is 10 for array lists (to overload fill in constructor)

        // Adding cats
        clowder.add(new Cat("Boba Pearl", "Tuxedo", 2));
        clowder.add(new Cat("Dino", "Black", 8));
        clowder.add(new Cat("Cole", "Orange", 6));
        clowder.add(new Cat("Lucy", "Orange", 8));
        clowder.add(new Cat("Winona", "Black", 3));

        // With array lists, they are automatically sorted (in ascending order)
        // to remove clowder.remove(2); or clowder.remove(Cole);
        // clowder.clear(); Nulls out all the cats
        // size goes back to 0
        System.out.println("~~~Unsorted Clowder of Cats~~~");
        // For each loop with array lists
        // For each temporarily named cat c in clowder
        for (Cat c:clowder)
            System.out.println(c);

        Collections.sort(clowder);

        System.out.println("~~~sorted Clowder of Cats~~~");
        for (Cat c:clowder)
            System.out.println(c);

    }
}

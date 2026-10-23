
public class Basic5 {
    public static void main(String[] args) {

        // String array with 5 favorite things
        String[] favorites = {
            "Gaming",
            "Music",
            "Movies",
            "Food",
            "Sports"
        };

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total items: " + favorites.length);
    }
}


public class Expert1 {
    public static void main(String[] args) {

        // 1. BYTE OVERFLOW
        byte number = 127;
        number++;

        System.out.println("=== BYTE OVERFLOW ===");
        System.out.println("After incrementing 127: " + number);
        // byte can only store -128 to 127.
        // Incrementing 127 causes it to wrap around to -128.


        // 2. STRING REFERENCE COMPARISON
        String string1 = new String("Hello");
        String string2 = new String("Hello");
        String string3 = "Hello";

        System.out.println("\n=== STRING COMPARISON ===");

        System.out.println("string1 == string2: " + (string1 == string2));
        // false because new String() creates two different String objects.

        System.out.println("string1.equals(string2): " + string1.equals(string2));
        // true because equals() compares the actual text/content.

        System.out.println("string1 == string3: " + (string1 == string3));
        /* false because string1 refers to a new String object,
         while string3 refers to the String literal in the string pool. */

        System.out.println("string1.equals(string3): " + string1.equals(string3));
        // true because both contain the same text.

        System.out.println("string2 == string3: " + (string2 == string3));
        // false because string2 is a different object created using new String().

        System.out.println("string2.equals(string3): " + string2.equals(string3));
        // true because both contain the same text.


        // 3. SHARED ARRAY REFERENCE
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n=== SHARED ARRAY REFERENCE ===");

        System.out.println("Before modification:");
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array2[0] = " + array2[0]);

        array2[0] = 99;

        System.out.println("\nAfter modifying array2[0]:");
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array2[0] = " + array2[0]);

        // array1 and array2 refer to the same array object.
        // Therefore, modifying the array through array2
        // is also visible through array1.
    }
}

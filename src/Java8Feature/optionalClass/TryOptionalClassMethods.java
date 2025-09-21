package Java8Feature.optionalClass;

import java.util.Optional;
/*

created on : 18th Sept 2025
created by : Mallikarjuna

*/
public class TryOptionalClassMethods {

    public static void main(String[] args) {

        //1. Creating Optional Object Methods.
        System.out.println("**** 1. Creating Optional Object Methods. ****");
        Optional<String> object = Optional.of("Hello");
        System.out.println("object : "+object);     // Optional[Hello]

        Optional<String> emptyObject = Optional.empty();
        System.out.println("emptyObject : "+emptyObject);   // Optional.empty

        Optional<String> nullableObjWithVal = Optional.ofNullable("World");
        System.out.println(nullableObjWithVal.get());   // World

        Optional<String> nullableObject = Optional.ofNullable(null);
        System.out.println(nullableObject.isPresent());     // false

        //2. Checking presence of value
        System.out.println("**** 2. Checking presence of value. ****");
        System.out.println(object.isPresent());     // true
        System.out.println(emptyObject.isPresent());    // false

        System.out.println(nullableObjWithVal.isPresent());     // true
        System.out.println(nullableObject.isPresent());     // false

        System.out.println(" .isPresent() and .isEmpty() exactly opposite to each other.");

        System.out.println(object.isEmpty());     // false
        System.out.println(emptyObject.isEmpty());    // true

        System.out.println(nullableObjWithVal.isEmpty());     // false
        System.out.println(nullableObject.isEmpty());     // true

        System.out.println("**** 2. getting the value. ****");

        System.out.println(object.get());     // Hello
        System.out.println(object.orElse("Default Value")); // Hello
        System.out.println(object.orElseGet( () -> "Default value from another method"));  // Hello
        System.out.println(object.orElseThrow());       // Hello
        System.out.println(object.orElseThrow( () -> new IllegalArgumentException("Value is missing")));    // Hello

        System.out.println("**** test methods with emptyObject ****");

    //  System.out.println(emptyObject.get());     // compile time error
        System.out.println(emptyObject.orElse("Default Value")); // Default Value
        System.out.println(emptyObject.orElseGet( () -> "Default value from another method"));  // Default value from another method
    //  System.out.println(emptyObject.orElseThrow());       // compile time error
    //  System.out.println(emptyObject.orElseThrow( () -> new IllegalArgumentException("Value is missing")));   // compile time error




    }
}

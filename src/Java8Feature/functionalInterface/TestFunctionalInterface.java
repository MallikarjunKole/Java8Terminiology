package Java8Feature.functionalInterface;

public class TestFunctionalInterface implements GenericFlow{

    public static void main(String[] args) {
    //    GenericFlow flow = () -> "Test";
    //    String message = flow.displayDefaultMessage();
    //    System.out.println("Message : "+message);

        GenericFlow genericFlow = (input) -> "Hello, "+input;
        String output = genericFlow.somethingToDisplay("Test");
        System.out.println("Output : "+output);

        // call for static method
        String fullName = GenericFlow.getFullName("ABC", "DEF");
        System.out.println("fullName : "+fullName);

        TestFunctionalInterface object = new TestFunctionalInterface();
        String resultString = object.somethingToDisplay("next message");
        System.out.println("Result String :"+resultString);

        String newResultString = object.getFullNameInUpperCase("XYZ", "ABC");
        System.out.println("newResultString : "+newResultString);

    }

    @Override
    public String somethingToDisplay(String inputMessage) {
        return "implemented in class after override : "+inputMessage;
    }
}

@FunctionalInterface
interface GenericFlow {

  //  public String displayDefaultMessage();

    public String somethingToDisplay(String inputMessage);

    public static String getFullName(String fname, String lname){
        return "Inside Static Method : "+fname +" "+lname;
    }

    public default String getFullNameInUpperCase(String fname, String lname){
        return "Inside Default Method : "+fname.toUpperCase()+" "+lname.toUpperCase();
    }
}


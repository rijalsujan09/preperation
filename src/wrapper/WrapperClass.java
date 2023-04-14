package wrapper;

public class WrapperClass {

    public static void main(String args[]){

        int d1 = 1; // -> primitive datatype int
        float d2 = 1.0f; // -> primitive datatype float

        // Wrapped Data
        Integer wrappedData1 = Integer.valueOf(d1); // -> Wrapped data Integer
        Float  wrappedData2 = Float.valueOf(d2); // -> Wrapped data Float

        // UnWrapped data
        int ud1 = wrappedData1.intValue();
        float ud2 = wrappedData2.floatValue();

        System.out.println(wrappedData1+" -> Wrapped data Integer");
        System.out.println(wrappedData2+" -> Wrapped data Float");
        System.out.println("\n");
        System.out.println(ud1+" -> Unwrapped data Integer");
        System.out.println(ud2+" -> Unwrapped data Float");
    }
}

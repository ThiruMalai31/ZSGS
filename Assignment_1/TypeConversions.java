public class TypeConversions {
    public static void main(String[] args) {
        // Implicit
        byte byteValue = 123;
        short shortValue = byteValue;
        System.out.println(shortValue);      // byte -> short

        int intValue = shortValue;
        System.out.println(intValue);        // short -> int

        long longValue = intValue;
        System.out.println(longValue);       // int -> long

        float decimalValue = longValue;
        System.out.println(decimalValue);    // long -> float

        double decimalValueOne = decimalValue;
        System.out.println(decimalValueOne);   // float -> double

        char character = 'A';
        int characterToInteger = character;
        System.out.println(characterToInteger);

        // Explicit

        double decimalValueTwo = 25.5;
        float decimalValueThree = (float) decimalValueTwo;
        System.out.println(decimalValueThree);

        long longValueOne = (long) decimalValueThree;
        System.out.println(longValueOne);

        int intValueOne = (int) longValueOne;
        System.out.println(intValueOne);

        short shortValueOne = (short) intValueOne;
        System.out.println(shortValueOne);

        byte byteValueOne = (byte) shortValueOne;
        System.out.println(byteValueOne);

        char characterOne = (char)97;
        System.out.println(characterOne);
    }
}

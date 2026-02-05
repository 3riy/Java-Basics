// -- Loop through array elements -- //

class Loop_Through_Array_Elements {
    // MAIN Method
    public static void main(String[] args) {
        String[] array = {"Abc", "20", "BHF", "OU", "xyz"};
        int arrayLength = array.length;

        // Loop through array elements
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Element at index " + i + ": " + array[i]); // Print element
        }
    }
}
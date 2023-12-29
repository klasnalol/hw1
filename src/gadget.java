public class gadget {
    private String modelName;
    private int yearReleased;


    public gadget(String modelName, int yearReleased) {
        this.modelName = modelName;
        this.yearReleased = yearReleased;
    }


    @Override
    public String toString() {
        return "Smartphone: " + modelName + " (Released in " + yearReleased + ")";
    }

    // compareIgnoreCase
    public boolean compareIgnoreCase(String anotherString) {
        return modelName.equalsIgnoreCase(anotherString);
    }

    public static void main(String[] args) {
        //  toString()
        gadget smartphoneObject = new gadget("ExamplePhone", 2022);
        System.out.println(smartphoneObject.toString());

        //  compareIgnoreCase()
        String comparisonString = "examplePhone";
        boolean isEqual = smartphoneObject.compareIgnoreCase(comparisonString);

        if (isEqual) {
            System.out.println("The smartphone's model is equal to the comparison string (case-insensitive).");
        } else {
            System.out.println("The smartphone's model is not equal to the comparison string (case-insensitive).");
        }
    }
}

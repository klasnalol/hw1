public class LivingBeing {
    private String name;
    private int age;

    public LivingBeing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "Human: " + name + " (Age: " + age + " years)";
    }

    // compareIgnoreCase
    public boolean compareIgnoreCase(String anotherString) {
        return name.equalsIgnoreCase(anotherString);
    }

    public static void main(String[] args) {
        //toString()
        LivingBeing humanObject = new LivingBeing("John Doe", 25);
        System.out.println(humanObject.toString());

        //compareIgnoreCase()
        String comparisonString = "john DOE";
        boolean isEqual = humanObject.compareIgnoreCase(comparisonString);

        if (isEqual) {
            System.out.println("The human's name is equal to the comparison string (case-insensitive).");
        } else {
            System.out.println("The human's name is not equal to the comparison string (case-insensitive).");
        }
    }
}

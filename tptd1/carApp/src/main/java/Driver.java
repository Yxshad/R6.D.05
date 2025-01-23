public class Driver {
    public static final int AGE_LEGAL = 10;
    private final String name;
    private final int age;

    public Driver(final String name, final int years) {
        this.name = name;
        age = years;
    }

    public String getName(){
        return this.name;
    }

    public boolean estAdulte() {
        return Driver.AGE_LEGAL <= this.age;
    }


}

public class Person {
    private double weight;
    private int age;
    private double growth;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", age=" + age +
                ", growth=" + growth +
                ", name='" + name + '\'' +
                '}';
    }

    private Person() {

    }

    public Person(double weight, int age, double growth, String name) {
        this.weight = weight;
        this.age = age;
        this.growth = growth;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }

    public String getName() {
        return name;
    }


    public static class PersonBuilder {

        private Person person;

        public PersonBuilder() {
            this.person = new Person();
        }

        public PersonBuilder setWeight(double weight) {
            this.person.weight = weight;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.person.age = age;
            return this;
        }

        public PersonBuilder setGrowth(double growth) {
            this.person.growth = growth;
            return this;
        }

        public PersonBuilder setName(String name) {
            this.person.name = name;
            return this;
        }

        public Person build() {
            return this.person;
        }
    }

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setAge(1)
                .setGrowth(123)
                .setName("sddw")
                .setWeight(75)
                .build();
        System.out.println(person);
    }
}
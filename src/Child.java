public class Child extends Human {
    String father;

    public Child(String name, int age, String gender, String father) {
        super(name, age, gender);
        this.father = father;

    }

    @Override
    public String toString() {
        return "Child{" +
                "father='" + father + '\'' + "Name : " + name +
                '}';
    }
}

import java.io.Serializable;

public class Human implements Serializable {
    String name;
    private int age;
    private String gehder;



    public Human(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gehder = gender;

    }


    @Override
    public String toString() {
        return "Human : {" +
                  name + '\'' +
                ", age=" + age +
                ", gehder='" + gehder + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGehder() {
        return gehder;
    }

    public void setGehder(String gehder) {
        this.gehder = gehder;
    }



}

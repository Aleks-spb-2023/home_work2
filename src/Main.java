import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human hm1 = new Human("Igor", 34, "male");
        Human hm2 = new Human("Aleks", 30, "female");
        Child child = new Child("Vova", 9,"male", hm1.getName());
        Child child2 =  new Child("Grisha", 6, "male", hm1.getName());
        List<Human> list = new ArrayList<>();
        list.add(hm1);
        list.add(hm2);
        list.add(child);
        list.add(child2);


        Family fm = new Family(list);

        System.out.println("----------------------------");
        fm.printFamily(list);








    }
}

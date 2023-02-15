import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObject {
    public static void main(String[] args) {
        Human hm1 = new Human("joe", 23, "female");
        Human hm2 = new Human("Nic", 99, "male");
        ArrayList<Human> ls = new ArrayList<>();
        ls.add(hm1);
        ls.add(hm2);

        Family fam = new Family(ls);

        try {
            FileOutputStream fos = new FileOutputStream("Human.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hm1);
            oos.writeObject(hm2);
            oos.writeObject(fam);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

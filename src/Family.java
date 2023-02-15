import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Family implements Serializable {
    private List<Human> fam;
    int id = 1;


    public Family(List<Human> hum) {
        this.fam = hum;
    }

    public void printFamily(List<Human> list) {
        this.id = 1;
        for (Human hum : list) {
            System.out.println(id + " " + hum);
            id += 1;
        }


    }


    @Override
    public String toString() {
        return "{" +
                fam +
                '}';
    }

    public Human getHuman() {

        return null;
    }
}

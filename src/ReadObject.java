import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("Human.bin");
            ObjectInputStream obj = new ObjectInputStream(in);

            Human rh = (Human) obj.readObject();
            Human rh2 = (Human) obj.readObject();

            Family fm = (Family) obj.readObject();

            System.out.println(rh);
            System.out.println(rh2);
            System.out.println("---------------------------");
            System.out.println(fm);
            obj.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

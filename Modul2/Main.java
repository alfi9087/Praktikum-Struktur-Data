package coba;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Linkedlist Hewan = new Linkedlist();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan : ");
        Hewan.get();

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus : ");
        System.out.println(DeleteHewan);

        for (String data : DeleteHewan) {
            Hewan.remove(data);
        }

        System.out.println("Output Hewan : ");
        Hewan.get();
    }
}

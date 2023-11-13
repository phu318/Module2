package excercise.oop;

public class Manager {
    public static void main(String[] args) {
        Song s = new Song("CAT DOI NOI SAU", "TANG DUY TAN");
        System.out.println(s.getSinger());

        s.setSinger("Thằng lồn nào hát");
    }
}

package excercise.oop;


import java.time.LocalDate;

public class Song {
    public String name;        // null
    private String singer;
    private String author;
    /*
    private int id;           //0
    public boolean isPublish; //FALSE
    public LocalDate createAt;    //NULL


     */

//    public Song(){
//        this.name = "default";
//        this.singer = "default";
//    }

    public String getSinger(){
        return "Ca sĩ" + this.singer;
    }
    public void setSinger(String str){
        if (str.contains("lồn") || str.contains("xxx")) {
            throw new RuntimeException("NOT RIGHT");
        }
        this.singer = str;
    }
    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }
    public Song(String name) {
        this.name = name;
    }

    public String getSong() {
        return String.format("Name: %s Singer: %s", this.name, this.singer);

    }

    public static void main(String[] args) {
        Song s = new Song("CAT DOI NOI SAU", "TANG DUY TAN");


//        Song h = new Song("Hit me up");
//        System.out.println(s.getSong());
//        System.out.println(h.getSong());        // Name: "hit me up", singer: null


//        Song s1 = new Song();

        System.out.println(s.name);
    }

}

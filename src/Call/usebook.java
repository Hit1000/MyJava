package Call;

import java.util.*;

class book {
    private int iss;
    private String name;
    private String author;

    public book(){
        iss = 0;
        name = null;
        author = null;
    }
    public book(int iss, String name, String author) {
        this.iss = iss;
        this.name = name;
        this.author = author;
    }

    public void setIss(int iss) {
        this.iss = iss;
    }
    public int getIss() {
        return iss;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "book{" +
                "iss=" + iss +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class usebook {
    public static void main(String[] args) {
        book b1 = new book(101,"abc","aaa");
        book b2 = new book(102,"bcd","bbb");
        book b3 = new book(103,"cde","ccc");
        book b4 = new book(104,"def","ddd");

//        LinkedHashMap<Integer,book> h = new LinkedHashMap<>();
        TreeMap<Integer,book> h = new TreeMap<>();
//        HashMap<Integer,book> h = new HashMap<>();

        h.put(1,b1);
        h.put(4,b4);
        h.put(2,b2);
        h.put(3,b3);
        System.out.println(h);
        for(Map.Entry e: h.entrySet()){
            System.out.println();
            System.out.print(e.getKey() + "  ");
            System.out.print(e.getValue()+ "\n**without to string**\t\t");
            System.out.println(h.get(e.getKey()).getIss()+" "+h.get(e.getKey()).getName()+" "+h.get(e.getKey()).getAuthor());
            book b = (book)e.getValue();
            System.out.println(b.getIss());
        }

    }
}
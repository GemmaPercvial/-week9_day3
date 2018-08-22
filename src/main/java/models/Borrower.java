package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="borrowers")
public class Borrower {
    private int id;
    private String name;
    private ArrayList<Book> itemsBorrowed;

    public Borrower(String name){
        this.name = name;
        this.itemsBorrowed = new ArrayList<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="items_borrowed")
    public ArrayList<Book> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(ArrayList<Book> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }
}


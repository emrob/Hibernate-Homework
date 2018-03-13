package models;


import javax.persistence.*;

@Entity
@Table(name="files")

public class File {
    private int id;
    private String name;
    private String extension;
    private int size;
//    private Folder folder;

    public File() {
    }

    public File(String name, String extension, int size) {

        this.name = name;
        this.extension = extension;
        this.size = size;
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

    @Column(name="extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Column(name="size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

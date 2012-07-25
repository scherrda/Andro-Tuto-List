package fr.scherrda.android.tuto.list.model;


public class Document{

    private long size;
    private int icone ;
    private int id;
    private String name;


    public Document(int id, String name, long size, int icone) {

        this.id = id;
        this.name = name;
        this.size = size;
        this.icone = icone;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getIcone() {
        return icone;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }




}
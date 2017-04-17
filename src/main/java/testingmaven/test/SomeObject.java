package testingmaven.test;

/**
 * Created by Raul on 2/19/2017.
 */
public class SomeObject {
    private int id;
    private String name;
    private int data;

    public SomeObject(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void data(int a, int b){
        this.data =  (a+b);
    }

    public int calculateTransaction(int a, int b){
        return (a+b);
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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

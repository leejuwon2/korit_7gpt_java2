package chapter10.practice;

abstract class Item {
    private String id;
    private String name;

    // 생성자
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {return id;}
    public String getName() { return name;}

    public abstract void display();
}

package Inheritance.Lab;

public abstract class SinhVien {
    protected int id;
    protected String name;

    public SinhVien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void getDiem();
}

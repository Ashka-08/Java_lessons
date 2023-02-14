package homework.homework_6;

public class NoteBook {
    private String name;    // название
    private int ram;        // ОЗУ
    private int ssd;        // Объем ЖД
    private String os;      // Операционная система
    private String colour;   // Цвет

    // методы

    // показать ноутбук
    @Override
    public String toString() {
        return String.format("%s, ОЗУ: %d Гб, SSD: %d Гб, %s, %s", name, ram, ssd, os, colour);
    }

    // Кконструктор класса
    public NoteBook(String name, int ram, int ssd, String os, String colour) {
        setName(name);
        setRam(ram);
        setSsd(ssd);
        setOs(os);
        setColour(colour);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getRam() {return ram;}

    public void setRam(int ram) {this.ram = ram;}

    public int getSsd() {return ssd;}

    public void setSsd(int ssd) {this.ssd = ssd;}

    public String getOs() {return os;}

    public void setOs(String os) {this.os = os;}

    public String getColour() {return colour;}

    public void setColour(String colour) {this.colour = colour;}
}

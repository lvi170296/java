public class Animal {
    //menthod
    private String name;
    private String color;
    private int old =0;

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String hunt(){

        return "huntAnimal";

    }

    public Animal(String name, String color, int old) {
        this.name = name;
        this.color = color;
        this.old = old;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", old=" + old +
                '}';
    }
}

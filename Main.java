public class Main {
    public static void main(String[] arg){
        Animal animal = new Animal();

        animal.setName("Ngo");
        animal.setColor("Red");
        animal.setOld(10);

        System.out.println(animal.toString());

        // printf hàm hunt trong class Dog
        System.out.println(animal.hunt());
       // Cat cat = getInforCat("Ngố", "Đen", 10); //name là trình biên dịch, nên chỉ cần nhấn "" là sẽ ra.


        Dog dog = getInforDog("Ngo", "Black", 24);
        System.out.println(dog.getName() + "\n" + dog.getColor() +"\n"+ dog.getOld());

    }

    // hàm Cat ở đây mang tính đóng gói
    public static Cat getInforCat(String name, String color, int old){

        Cat cat = new Cat(name, color, old);
        cat.setName("ihaha");
        cat.setColor("Black");
        cat.setOld(10);

        System.out.println(cat.getName() + "\n" + cat.getColor() + "\n" + cat.getOld());
        return cat;
    }

    public static Dog getInforDog(String name, String color, int old){
        Dog dog = new Dog(name, color, old);

        return dog;
    }

}

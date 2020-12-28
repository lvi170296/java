public class Cat extends Animal {
    public Cat(String name, String color, int old) {
        super(name, color, old); // dùng lại contructor của animal
    }

    // tại vì bên animal đã có contructor nên dòng "public Cat(String name, String color, int old) "
    // không cần nữa.
    //public Cat(String name, String color, int old) {

        // ở đây là có thể goi là biến truyền giá trị để qua hàm cha truyền giá trị vào.
/*        this.setName(name);
        this.setColor(color);
        this.setOld(old);*/

        //thay vì dùng this thì dùng lại contructor của animal là dùng super.
   // }
}

public class Dog extends Animal{

    public Dog(String name, String color, int old) {
        super(name, color, old);
    }

    private String chungLoai;
    public String getChungLoai(){return chungLoai;}
    public void setChungLoai(String chungLoai){
        this.chungLoai = chungLoai;
    }

    @Override
    public String hunt() {
/*        String a = super.hunt();
        String b = "To";
        return a + b;*/

        String a = super.hunt() + "chidHunt";
        return super.hunt();
    }
}

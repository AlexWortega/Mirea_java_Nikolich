
public class another {

    public static void main(String[] args) {

       //ball basket = new ball();
     //  basket.set_Radius(10.0);
       //basket.setColor("red");
      // basket.setType("hh");
      // basket.toStr();
       /*Book gar = new Book();
       gar.set_Year(1234);
       gar.set_Author("asd");
       gar.set_Izdat("sdsda");
       gar.set_Name("dfsf");
       gar.set_Cout(1245);
      System.out.println( gar.toString());*/
        Dog labr = new Dog(10,"gg","labrador");
        Dog kavkaz = new Dog(11,"araarata","kavaksz");
        Dog[] dogs = {labr,kavkaz};
        
    }
}
class ball{
    private double radius;
    private String type;
    private String color;
    public void set_Radius(double radius){
        this.radius = radius;


    }
    public void setType(String type)
    {
        this.type = type;

    }
    public void setColor(String color){
        this.color = color;

    }
    public String getColor(){

        return color;

    }
    public String getType(){

        return type;

    }
    public double getRadius(){

    return radius;
    }
    public  void toStr(){

        System.out.println("R: "+radius+"\n"+"Type: "+type+"\n"+"Color: "+color);

    }


}
class Book{
    private String author;
    private String name;
    private String izdat;
    private int cout;
    private int year;

    public void set_Author(String auth){
        this.author = auth;


    }
    public void set_Name(String type)
    {
        this.name = type;

    }
    public void set_Izdat(String izd){
        this.izdat = izd;

    }
    public void set_Cout(int cout){
        this.cout = cout;

    }
    public void set_Year(int yea){
        this.year = yea;

    }
    public String get_Author(){

        return author;

    }
    public String get_Izd(){

        return izdat;

    }

    public int get_Cout(){

        return cout;
    }
    public int get_Year()
    {

        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author=" + author + '\'' +
                ", Name=" + name + '\'' +
                " Izdatel=" + izdat + '\'' +
                ", Кол во страниц=" + cout +
                ", год=" + year +
                '}';
    }

    public  void toStr(){

        System.out.println("Author: "+author+"\n"+"Izdatel: "+izdat+"\n"+"Страниц "+cout +"|"+ "Year"+year);

    }


        }
class Dog{
    private int age;
    private String name;
    private String type;
    public void set_Radius(int radiu){
        this.age = radiu;


    }
    public Dog(int age, String name, String type){
        this.age = age;
        this.name = name;
        this.type = type;
    }
    public void setType(String type)
    {
        this.type = type;

    }
    public void setColor(String name){
        this.name = name;

    }
    public String getName(){

        return name;

    }
    public String getType(){

        return type;

    }
    public double getAge(){

        return age;
    }
    public int to_human(){

        return age*7;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

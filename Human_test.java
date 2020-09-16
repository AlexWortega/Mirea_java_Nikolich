public class Main {
    //тестирование класса человек
    public static void main(String[] args) {
        Human human = new Human();
        human.setTall(2); 
        human.getHand1().setL(3); 
        System.out.println(human.toString());
    }
}

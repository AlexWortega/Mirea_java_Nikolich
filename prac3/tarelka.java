public class tarelka extends Dish {
    @Override
    public void fill() {
        super.fill();
    }

    @Override
    public void pal() {
        System.out.println("not pal");
    }

    @Override
    public void thro() {
        System.out.println("no throw");
    }

    public static void main(String args[]){
        tarelka tar = new tarelka();
        tar.fill();
        tar.setCout(2);
        tar.setMass((float) 0.2);
        tar.setS(2);
        System.out.println(tar.toString());
    }
}

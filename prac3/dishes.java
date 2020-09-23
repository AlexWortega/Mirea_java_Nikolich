import java.util.Scanner;
public abstract class Dish {
    private int S;
    private int cout;
    private float mass;
    public void fill(){
    System.out.println("filled");

    }
    public abstract void pal();
    public abstract void thro();
    public void cut(){
        System.out.println("cutted");
    }
    public void setS(int s)
    {
        S = s;
    }
    public void setMass(float m)
    {
        mass = m;
    }
    public void setCout(int cou){
        cout = cou;
    }

    public String toString(){
       return (" S = "+ S +" Mass = "+mass+" Cout = "+cout);

    }


}

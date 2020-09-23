
public class labr extends Dog {
    @Override
    public void voice() {
        System.out.println(" not WOOOOF");
    }
    public static void main(String args[]){
        labr dob = new labr();
        dob.voice();
        dob.setH(2);
        dob.setMass(3);
        dob.setName("sdads");
        System.out.println(dob.toString());

    }
}

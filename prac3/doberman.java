public class doberman extends Dog {
    @Override
    public void voice() {
        System.out.println("WOOOOF");
    }
    public static void main(String args[]){
        doberman dob = new doberman();
        dob.voice();
        dob.setH(2);
        dob.setMass(3);
        dob.setName("sdads");
        System.out.println(dob.toString());

    }
}

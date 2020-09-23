public abstract class Dog {
    private String name;
    private double h;
    private double mass;
    public abstract void voice();
    public void setName(String n){
        name = n;

    }
    String getName(){
        return name;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", h=" + h +
                ", mass=" + mass +
                '}';
    }
}

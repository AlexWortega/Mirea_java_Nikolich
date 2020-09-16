public class Human {
    private Hand hand1 = new Hand();
    private Hand hand2 = new Hand();
    private Head head = new Head();
    private Leg leg1 = new Leg();
    private Leg leg2 = new Leg();

    public Hand getHand1() {
        return hand1;
    }

    public Hand getHand2() {
        return hand2;
    }
    
    public void setHand1(Hand hand) {
        this.hand1 = hand;
    }

    public void setHand2(Hand hand) {
        this.hand2 = hand;
    }
    
    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    
    public Leg getLeg1() {
        return leg1;
    }
    
    
    public Leg getLeg2() {
        return leg2;
    }
    
    public void setLeg1(Leg leg) {
        this.leg1 = leg;
    }

    public void setLeg2(Leg leg) {
        this.leg2 = leg;
    }
    
    private int tall;

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Human{" +
                "hand1=" + hand1 +
                ", hand2=" + hand2 +
                ", head=" + head +
                ", leg1=" + leg1 +
                ", leg2=" + leg2 +
                ", tall=" + tall +
                '}';
    }
}

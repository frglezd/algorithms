public class CardProcessor implements PaymentProcessor {
    @Override
    public void process(double amount) { System.out.println("card: " + amount); }

    @Override
    public void audit() {             // Java 8+: default method with a body
        System.out.println("audited but in implemented class");
    }
   
    public static final double FEE = 0.03; // no longer PaymentProcessor.FEE
    

    public static void main(String[] args){
    CardProcessor cp = new CardProcessor();
    cp.process(29+FEE);
    cp.audit();
    PaymentProcessor.isValid(29.0);
    //however
    PaymentProcessor pp = new CardProcessor();
    pp.process(29+PaymentProcessor.FEE);
    
    }

}


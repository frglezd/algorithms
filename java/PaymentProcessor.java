public interface PaymentProcessor {
    double FEE = 0.02;                 // implicitly public static final
    void process(double amount);       // implicitly public abstract

    default void audit() {             // Java 8+: default method with a body
        System.out.println("audited");
    }
    static boolean isValid(double amt) { return amt > 0; }   // Java 8+: static
}


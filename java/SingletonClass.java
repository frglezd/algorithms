public class SingletonClass {
    private static SingletonClass Instance;
    private String info = "Instance string";
    private SingletonClass(){
    if (Instance != null) throw new IllegalStateException("Use getInstance()");
    }

    public static SingletonClass getInstance(){
        if(Instance == null){
            Instance = new SingletonClass();
        }
        return Instance;
    }

    public String getString(){
        return info;
    }

    public String setString(String str){
        this.info = str;
        return str;
    }

    public static void main(String[] args) {
        SingletonClass inst1 = SingletonClass.getInstance();
        System.out.println(inst1.getString());
        SingletonClass inst2 = SingletonClass.getInstance();
        System.out.println(inst2.getString());

        System.out.println(inst2.setString("string changed"));
        System.out.println(inst1.getString());
        //SingletonClass inst3 = new SingletonClass(); //error
    }
}

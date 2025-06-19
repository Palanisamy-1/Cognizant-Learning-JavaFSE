
class SingletonPatternExample{
    public static void main(String[] args) {
        Logger obj1=Logger.getInstance();
        Logger obj2=Logger.getInstance();
        System.out.println("HashCode of obj1: "+System.identityHashCode(obj1));
        System.out.println("HashCode of obj2: "+System.identityHashCode(obj2));
        if(obj1==obj2){
            System.out.println("Both are having Same HashCode, Hence only a Single instance is Created and Singleton is Verified");
        }
        else{
            System.out.println("Logger instance are Different, Hence Singleton Failed.");
        }
    }
}
class Logger{
    private static Logger instance;
    private Logger(){};

    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }
}
public class TestClass {

    public static void main(String args[]){
        System.out.println("TestClass.main : "+TestClass.class.getSimpleName());
        System.out.println("First Code : Shashank");
        System.out.println("TestClass.main cannonical name : "+TestClass.class.getCanonicalName());

        ZoneDateTime zdt = new ZoneDateTime();
        System.out.println("Current time is :"+ ZoneDateTime.now());

    }
}

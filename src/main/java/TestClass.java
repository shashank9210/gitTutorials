public class TestClass {

    public static void main(String args[]){
        System.out.println("TestClass.main : "+TestClass.class.getSimpleName());
        System.out.println("First Code : Shashank");
        System.out.println("TestClass.main cannonical name : "+TestClass.class.getCanonicalName());

        ZoneDateTime zdt = new ZoneDateTime();
        System.out.println("Current time is :"+ ZoneDateTime.now());

        System.out.println("Usages of git diff in unstage area");
        System.out.println("Staged area change track-git diff staged!");
        System.out.println("After commit diff- git diff HEAD");

    }
}

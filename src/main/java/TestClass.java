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


        System.out.println("Git Show - to get commit details");

        System.out.println("git log - to check all commits");
        System.out.println("last 2 comit - git log -p -2");
        System.out.println("To check all modified files - git log --stat");

    }
}

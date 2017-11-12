package kotlincode.SimpleCode.Conventions.KotlinWithJava.overload;

public class RunChild {

    public static void main(String[] args) {
        System.out.println(RunParentKt.getMoney(500));
        System.out.println(RunParentKt.getMoney(500,1.3f));
    }
}

package kotlincode.simplecode.kotlinwithjava.overload;

public class Child {

    public static void main(String[] args) {
        System.out.println(ParentKt.getMoney(500));
        System.out.println(ParentKt.getMoney(500,1.3f));
    }
}

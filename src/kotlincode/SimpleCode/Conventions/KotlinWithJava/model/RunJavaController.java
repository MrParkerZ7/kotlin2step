package kotlincode.SimpleCode.Conventions.KotlinWithJava.model;

public class RunJavaController {
    public static void main(String[] args) {
        Victim java = new Victim();
        java.setName("Java");
        java.setSubject("Coding");
        System.out.println("Java: " + java);

        Murderer kotlin = new Murderer("Kotlin", "Killer");
        kotlin.setName("Kotlin");
        kotlin.setSubject("Killer");
        System.out.println("Kotlin: " + kotlin);
    }
}

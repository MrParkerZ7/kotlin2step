package code.kotlinwithjava;

public class Victim {
    private String name;
    private String Subject;

    public Victim() {
    }

    public Victim(String name, String subject) {
        this.name = name;
        Subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return "Victim{" +
                "name='" + name + '\'' +
                ", Subject='" + Subject + '\'' +
                '}';
    }
}

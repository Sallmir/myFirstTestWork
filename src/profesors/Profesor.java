package profesors;

public class Profesor {

    private String name;
    private String lastName;
    private String subject;

    public Profesor(String name, String lastName, String subject) {
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}

package students;


import java.util.Comparator;

public class Student {

    private String name;
    private String lastName;
    private String facult;
    private int group;
    private int progress;
    private int communicability;


    public Student(String name, String lastName, String facult, int group, int progress, int communicability) {
        this.name = name;
        this.lastName = lastName;
        this.facult = facult;
        this.group = group;
        this.progress = progress;
        this.communicability = communicability;

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

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getCommunicability() {
        return communicability;
    }

    public void setCommunicability(int communicability) {
        this.communicability = communicability;
    }


    @Override
    public String toString(){
        return "\n[name - "+name+". Last Name - "+lastName+". Facult - "+facult+". Group - "+group+". Student progress - "+progress+". Comun - "+ communicability +".]";
    }

    public static Comparator<Student> snorderer = new Comparator<Student>() {

        public int compare(Student o1, Student o2) {
            return o1.lastName.compareTo(o2.lastName);
        }
    };

    public static Comparator<Student> prorderer = new Comparator<Student>() {

        public int compare(Student o1, Student o2) {
            return o2.progress - (o1.progress);
        }
    };
}

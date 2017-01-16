package facultets;

public class Groups {


    private int groupNumber;
    private String subjects;

    public Groups(int groupNumber, String subjects) {
        this.groupNumber = groupNumber;
        this.subjects = subjects;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}

package vp.androidallinoneexample.cardview;

/**
 * Created by Vyas on 6/5/2016.
 */
public class Students {
    private String studentName;
    private String studentAge;
    private String studentGender;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Students(String studentName, String studentAge, String studentGender) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
    }
}

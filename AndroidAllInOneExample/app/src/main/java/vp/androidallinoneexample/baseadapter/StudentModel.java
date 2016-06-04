package vp.androidallinoneexample.baseadapter;

/**
 * Created by Vyas on 6/4/2016.
 * This is the simple POJO of Student contains Basic Information about the students
 */
public class StudentModel {
    public String studentName;
    public String studentAge;

    public StudentModel(String studentName, String studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

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
}

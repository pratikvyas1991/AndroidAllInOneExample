package vp.androidallinoneexample.baseadapteritemclick;

/**
 * Created by Vyas on 6/4/2016.
 * This is the simple POJO of Student contains Basic Information about the students
 */
public class StudentModel {
    public String studentName;
    public String studentAge;
    public String studentHobbie;
    public String studentEmail;

    public StudentModel(String studentName, String studentAge, String studentHobbie, String studentEmail) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentHobbie = studentHobbie;
        this.studentEmail = studentEmail;
    }

    public String getStudentHobbie() {
        return studentHobbie;
    }

    public void setStudentHobbie(String studentHobbie) {
        this.studentHobbie = studentHobbie;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
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

package entities;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;

    public Course() {
    }
    public Course(int courseId, String courseName, String courseDescription) {
        this.courseId = courseId; //gelen courseId this ile classın courseId'sine eşitlenir.
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
   }

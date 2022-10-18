package business;
import dataAccess.CourseDao;
import entities.Course;
import java.util.Objects;

public class CourseManager {
    private CourseDao courseDao;
    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
    public void add(Course course) throws Exception {
        Course[] courses = new Course[]{ new Course(2, "Java", "Java dersi")};
        for(Course course1 : courses){
            if(Objects.equals(course1.getCourseName(), course.getCourseName())) {
                throw new Exception("Aynı Kurs Adı Olamaz");
            }
        }
            System.out.println(course.getCourseName()+" "+"Kurs eklendi.");
            courseDao.add(course);
    }
}

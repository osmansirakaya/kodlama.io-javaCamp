import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.jdbc.JdbcCourseDao;
import dataAccess.jdbc.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category = new Category(1, "ja");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
        categoryManager.add(category);

        System.out.println("-------------------------------------------------");

        Course course = new Course(1, "Jaa", "Java dersi");
        CourseManager courseManager = new CourseManager(new HibernateCourseDao());
        courseManager.add(course);

        System.out.println("-------------------------------------------------");

        Instructor instructor = new Instructor();
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
        instructorManager.add(instructor);
    }
}

/*
business: iş geliştirme ve yönetimi
data access: veri erişimi
entities: veri tabanı nesneleri
 */
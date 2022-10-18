package business;
import dataAccess.InstructorDao;
import entities.Instructor;
public class InstructorManager {
    private InstructorDao instructorDao;
    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }
    public void add(Instructor instructor) {
        instructorDao.add(instructor);
    }
}

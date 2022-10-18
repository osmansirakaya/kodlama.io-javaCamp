package dataAccess.hibernate;
import dataAccess.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    public void add(Instructor instructor) {
        System.out.println("HibernateInstructorDao.add() methodu çalıştı.");
    }
}

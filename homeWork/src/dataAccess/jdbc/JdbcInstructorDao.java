package dataAccess.jdbc;

import dataAccess.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    public void add(Instructor instructor) {
        System.out.println("JdbcInstructorDao.add() methodu çalıştı.");
    }
}


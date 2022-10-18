package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("JdbcCourseDao.add() methodu çalıştı.");
    }
}


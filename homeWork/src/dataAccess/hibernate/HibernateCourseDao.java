package dataAccess.hibernate;

import dataAccess.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("HibernateCourseDao.add() methodu çalıştı.");
    }
}


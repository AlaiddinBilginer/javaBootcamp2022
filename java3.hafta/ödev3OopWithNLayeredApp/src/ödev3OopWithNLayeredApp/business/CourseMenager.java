package ödev3OopWithNLayeredApp.business;

import ödev3OopWithNLayeredApp.core.logging.Logger;
import ödev3OopWithNLayeredApp.dataAccess.CourseDao;
import ödev3OopWithNLayeredApp.entities.Course;

public class CourseMenager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseMenager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice() < 0) {
			throw new Exception("Bir kursun fiyati 0'dan kucuk olamaz!");
		}
		
		Course[] courses = {new Course("Java", 59.99), new Course("C#", 99.99), new Course("Java Script", 49.99)};
		
		for(Course courseName : courses) {
			if(course.getName().equals(courseName.getName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}		
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
		
		
	}

}

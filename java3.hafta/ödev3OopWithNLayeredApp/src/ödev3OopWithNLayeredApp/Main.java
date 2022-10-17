package ödev3OopWithNLayeredApp;

import ödev3OopWithNLayeredApp.business.CourseMenager;
import ödev3OopWithNLayeredApp.core.logging.DatabaseLogger;
import ödev3OopWithNLayeredApp.core.logging.FileLogger;
import ödev3OopWithNLayeredApp.core.logging.Logger;
import ödev3OopWithNLayeredApp.core.logging.MailLogger;
import ödev3OopWithNLayeredApp.dataAccess.HibernateDao;
import ödev3OopWithNLayeredApp.dataAccess.JdbcDao;
import ödev3OopWithNLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course("Java", 59.99);
		Course course2 = new Course("C++", 99.99);
		
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};
		
		CourseMenager courseMenager1 = new CourseMenager(new HibernateDao(), loggers);
		//courseMenager1.add(course1); //Kurs ismi tekrar edemez hatası verecektir.
		
		CourseMenager courseMenager2 = new CourseMenager(new JdbcDao(), loggers);
		courseMenager2.add(course2); //Bu sefer kurs ismi farklı olduğu için hata almayız.
	}

}

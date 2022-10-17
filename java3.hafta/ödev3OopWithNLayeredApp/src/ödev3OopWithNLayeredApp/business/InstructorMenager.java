package ödev3OopWithNLayeredApp.business;

import ödev3OopWithNLayeredApp.core.logging.Logger;
import ödev3OopWithNLayeredApp.dataAccess.InstructorDao;
import ödev3OopWithNLayeredApp.entities.Instructor;

public class InstructorMenager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorMenager(InstructorDao insturctorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
}

package ödev3OopWithNLayeredApp.dataAccess;

import ödev3OopWithNLayeredApp.entities.Category;
import ödev3OopWithNLayeredApp.entities.Course;
import ödev3OopWithNLayeredApp.entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanina eklendi");		
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi");
	}

}

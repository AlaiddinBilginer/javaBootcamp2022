package ödev3OopWithNLayeredApp.business;

import ödev3OopWithNLayeredApp.core.logging.Logger;
import ödev3OopWithNLayeredApp.dataAccess.CategoryDao;
import ödev3OopWithNLayeredApp.entities.Category;

public class CategoryMenager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryMenager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		Category[] categories = {new Category("Backend Programlama"), new Category("Web Programlama")};
		
		for(Category categoryName : categories) {
			if (category.getName().equals(categoryName.getName())) {
                throw new Exception("Kategori ismi tekrar edemez!");
            }
		}
		
		categoryDao.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

}

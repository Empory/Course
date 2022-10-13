package course.dataAccess;

import course.entities.Site;

public class HibernateSiteDao implements SiteDao{
	
	public void add(Site site) {
		System.out.println("Hibernate ile veritabanına eklendi" );
	}

}

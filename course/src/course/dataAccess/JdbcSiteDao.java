package course.dataAccess;

import course.entities.Site;

public class JdbcSiteDao implements SiteDao{
	
	public void add(Site site) {
		System.out.println("JDBC ile veritabanına eklendi" );
	}
	
	

}

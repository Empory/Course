package course;

import course.business.SiteManager;
import course.core.logging.DataBaseLogger;
import course.core.logging.EmailLogger;
import course.core.logging.FileLogger;
import course.core.logging.Logger;
import course.dataAccess.HibernateSiteDao;
import course.dataAccess.JdbcSiteDao;
import course.entities.Site;

public class Main {
	public static void main(String[] args) throws Exception {
		Site site1 = new Site("Programming ","C# Course"," Engin Demiroğ ",50);
		
		Site site2 = new Site("Programming ","C# Course","Engin Demiroğ",50);
		Logger[] loggers = {new FileLogger(),new EmailLogger(),new DataBaseLogger()};
		
		
		SiteManager siteManager = new SiteManager(new HibernateSiteDao(), loggers);
		siteManager.add(site1);
		siteManager.add(site2);
		
		
}
}


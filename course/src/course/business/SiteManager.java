package course.business;

import java.util.ArrayList;
import java.util.List;


import course.core.logging.Logger;
import course.dataAccess.HibernateSiteDao;
import course.dataAccess.JdbcSiteDao;
import course.dataAccess.SiteDao;
import course.entities.Site;

public class SiteManager {
	private SiteDao siteDao;
	private Logger[] loggers;
	private List<String> siteNames = new ArrayList<>();
	public SiteManager(SiteDao siteDao, Logger[] loggers) {
		this.siteDao = siteDao;
		this.loggers = loggers;

		
	}
	
	 public void add(Site site) throws Exception {
		 
		 	if(site.getCoursePrice()<=0) {
		 		throw new Exception("Course price can not be lower than 0 or same ");
		 	}
	        if(siteNames.size() == 0){
	            siteNames.add(site.getCategoryName());
	            siteDao.add(site);
	        
	            for (Logger logger:loggers) {
	                logger.log(site.getCategoryName());
	            }
	        }
	       
	        
	            for (String name : siteNames) {
	                if(name.equals(site.getCategoryName())|| name.equals(site.getCourseName())){
	                	throw new Exception("That name already exist : " + site.getCategoryName() + site.getCourseName() );
	                    
	                } else {
	                    siteDao.add(site);
	                    for (Logger logger:loggers) {
	                        logger.log(site.getCategoryName());
	                        logger.log(site.getCourseName());
	                        
	                    }
	                }
	            }
	        }
	    }//add





		
	
	
	



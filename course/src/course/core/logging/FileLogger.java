package course.core.logging;

import course.entities.Site;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("logged to file "+data);
		
	}

}

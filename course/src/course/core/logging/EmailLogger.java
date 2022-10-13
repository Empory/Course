package course.core.logging;

import course.entities.Site;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("logged to email "+data);
		
	}

}

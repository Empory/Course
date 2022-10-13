package course.core.logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("logged to database "+data) ;
		
	}

}

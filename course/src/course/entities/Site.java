package course.entities;

public class Site {
	private String categoryName;
	private String courseName;
	private String instructorName;
	private int coursePrice;
	
	public Site() {
		
	}

	public Site(String categoryName, String courseName, String instructorName, int coursePrice) {
		this.categoryName = categoryName;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.coursePrice = coursePrice;
	}

	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	
	
	

}

package dio.bootcamp.challenge.domain;

public class Course {
	
	private String title;
	private String description;
	private int courseload;
	
	public Course() {}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCourseload() {
		return courseload;
	}
	public void setCourseload(int courseload) {
		this.courseload = courseload;
	}
	@Override
	public String toString() {
		return "Course [title=" + title + ", description=" + description + ", courseload=" + courseload + "]";
	}

}

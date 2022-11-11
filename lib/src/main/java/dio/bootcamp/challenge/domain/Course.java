package dio.bootcamp.challenge.domain;

public class Course extends Content {
	
	private int courseload;
	
	public Course() {}
	
	@Override
	public double calculateXp() {
		return DEFAULT_XP * courseload;
	}

	public int getCourseload() {
		return courseload;
	}
	
	public void setCourseload(int courseload) {
		this.courseload = courseload;
	}
	
	@Override
	public String toString() {
		return "Course [title=" + getTitle() + ", description=" + getDescription() + ", courseload=" + courseload + "]";
	}
}

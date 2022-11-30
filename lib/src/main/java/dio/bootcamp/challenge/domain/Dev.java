package dio.bootcamp.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	private String name;
	private Set<Content> enrolledContents = new LinkedHashSet<>();
	private Set<Content> finishedContents = new LinkedHashSet<>();
	
	public void enrolBootcamp(Bootcamp bootcamp) {}
	
	public void progress() {}
	
	public void calculateTotalXp() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getEnrolledContents() {
		return enrolledContents;
	}

	public void setEnrolledContents(Set<Content> enrolledContents) {
		this.enrolledContents = enrolledContents;
	}

	public Set<Content> getFinishedContents() {
		return finishedContents;
	}

	public void setFinishedContents(Set<Content> finishedContents) {
		this.finishedContents = finishedContents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enrolledContents, finishedContents, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(enrolledContents, other.enrolledContents)
				&& Objects.equals(finishedContents, other.finishedContents) && Objects.equals(name, other.name);
	}

}

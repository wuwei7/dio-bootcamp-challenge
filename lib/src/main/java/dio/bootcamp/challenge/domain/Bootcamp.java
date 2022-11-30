package dio.bootcamp.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String name;
	private String description;
	private final LocalDate startDate = LocalDate.now();
	private final LocalDate endDate = startDate.plusDays(45);
	private Set<Dev> enrolledDevs = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Set<Dev> getEnrolledDevs() {
		return enrolledDevs;
	}
	
	public void setEnrolledDevs(Set<Dev> enrolledDevs) {
		this.enrolledDevs = enrolledDevs;
	}
	
	public Set<Content> getContents() {
		return contents;
	}
	
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(contents, description, endDate, enrolledDevs, name, startDate);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(endDate, other.endDate) && Objects.equals(enrolledDevs, other.enrolledDevs)
				&& Objects.equals(name, other.name) && Objects.equals(startDate, other.startDate);
	}

}

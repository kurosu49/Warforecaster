package team14.model;

/**
 * Tournament class
 * @author mirafcry
 * @version 11/24/14
 */
public class Tournament {
	
	private String name, status, deadline;
	private int id;
	
	/**
	 * Creates a new Tournament
	 * @param name
	 * @param status
	 * @param deadline
	 * @throws IllegalArgumentException if name, status, and/or deadline is invalid.
	 */
	public Tournament(int id, String name, String deadline, String status) {
		setID(id);
		setName(name);
		setStatus(status);
		setDeadline(deadline);
	}
	
	@Override
	public String toString() {
		return "Tournament[id=" + getID() + ", name=" + getName() +  ", deadline=" + getDeadline() + ", status=" + getStatus() +"]";
	}
	
	public int getID() {
		return id;
	}
	
	private void setID(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("Please enter a valid ID.");
		}
		this.id = id;
	}
	
	/**
	 * Returns name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifies name for this Tournament
	 * @param name
	 */
	public void setName(String name) {
		if(name == null || name.length() == 0) {
			throw new IllegalArgumentException("Please supply valid name.");
		}
		this.name = name;
	}
	
	/**
	 * Returns status
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Modifies status for this Tournament
	 * @param status
	 */
	public void setStatus(String status) {
		if(status == null || status.length() == 0) {
			throw new IllegalArgumentException("Please supply valid status.");
		}
		this.status = status;
	}
	
	/**
	 * Returns deadline
	 * @return deadline
	 */
	public String getDeadline() {
		return deadline;
	}
	
	/**
	 * Modifies the deadline for this tournament
	 * @param deadline
	 */
	public void setDeadline(String deadline) {
		if(deadline == null || deadline.length() == 0) {
			throw new IllegalArgumentException("Please supply valid deadline");
		}
		this.deadline = deadline;
	}
	
}

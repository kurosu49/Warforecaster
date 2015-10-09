package team14.model;

/**
 * Squad class
 * @author mirafcry
 *
 */
public class StSquad {
	private String name;
	private int id, strategistID, fieldPosition; 
	
	public StSquad(int id, String name, int strategistID, int fieldPosition) {
		setID(id);
		setName(name);
		setStrategistID(strategistID);
		setFieldPosition(fieldPosition);
	}
	
	public String toString() {
		return "Squad[id=" + getID() + ", name=" + getName() + ", strategistID=" + 
				getStrategistID()  + ", "  + ", fieldPosition=" + getFieldPosition() + "]";
	}
	
	public int getID() {
		return id;
	}
	
	private void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStrategistID() {
		return strategistID;
	}
	
	private void setStrategistID(int strategistID) {
		this.strategistID = strategistID;
	}
	
	public int getFieldPosition() {
		return fieldPosition;
	}
	
	public void setFieldPosition(int fieldPosition) {
		this.fieldPosition = fieldPosition;
	}
}


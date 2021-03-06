import java.util.ArrayList;

public class Patient {
	private String patientId;
	private boolean active;
	private ArrayList<Reading> readings;

	protected Patient(String patientId) {
		this.patientId = patientId;
		this.setActive(true);
		this.readings = new ArrayList<Reading>();
	}

	protected String getPatientId() {
		return patientId;
	}

	protected ArrayList<Reading> getReadings() {
		return readings;
	}

	protected void addReading(String readingId, String type, double value, long date) {
		if (active) {
			Reading reading = new Reading(readingId, type, value, date);
			readings.add(reading);	
		}
	}

	protected void addReading(String readingId, String type, String bpValue, long date) {
		if (active) {
			Reading reading = new Reading(readingId, type, bpValue, date);
			readings.add(reading);	
		}
	}

	protected boolean isActive() {
		return active;
	}

	protected void setActive(boolean active) {
		this.active = active;
	}

}
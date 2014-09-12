package bat;

public class Batch {
	int batchId;
	String faculty;
	String batchTime;
	
	public Batch(int batchId, String faculty, String batchTime) {
		super();
		this.batchId = batchId;
		this.faculty = faculty;
		this.batchTime = batchTime;
	}

	public String dispBatchInfo() {
		return "Batch [batchId=" + batchId + ", faculty=" + faculty
				+ ", batchTime=" + batchTime + "]";
	}

}

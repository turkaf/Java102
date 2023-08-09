import java.util.Date;

public abstract class Insurance {
	private String insuranceName;
	private double insurancePrice;
	private Date insuranceStartDate;
	private Date insuranceFinishDate;
	
	public abstract void calculate();
		
}
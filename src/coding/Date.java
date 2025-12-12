package coding;

public class Date {

	int day;
	int month;
	int year;
	
	public Date() {
		
	}
	
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toSteing() {
		return "day"+day+" month"+month+" year"+year;
	}
}

package homework4;

public class Campaign extends CampaignManager {
	private int id;
	private String name;
	private double discount;
	
	public void Campaign() {
		
	}
	public void Campaign(int id,String name,double discount) {
		this.id=id;
		this.name=name;
		this.discount=discount;
		
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}

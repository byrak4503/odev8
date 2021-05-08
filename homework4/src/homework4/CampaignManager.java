package homework4;

public class CampaignManager implements ICampaignService {

	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya eklendi");
		
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya silindi");
		
	}
	
	
	public void updated(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya güncellendi");
		
	}

}

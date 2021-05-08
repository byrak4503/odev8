package homework4;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Player player = new Player(1,"Burak","BAÞAK","byrak@gmail.com",(new GregorianCalendar(2001,1,24)),"24103380012");
		
		
		
		Game game = new Game();
		game.setId(1);
		game.setName("Adam Asmaca");
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Yaz Kampanyasý");
		campaign.setDiscount(75);
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.add(player);
		playerManager.delete(player);
		playerManager.update(player);
		
		System.out.println("-----------------");
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		System.out.println("------------------");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		

	}

}

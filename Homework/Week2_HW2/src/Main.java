import concrete.CampaignManager;
import concrete.GameManager;
import concrete.PlayerManager;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {
    public static void main(String[] args) {
        Player player=new Player(1,"Murat","İncir","11111111111",2000);
        PlayerManager playerManager = new PlayerManager();
        playerManager.add(player);  // player oluşturup daha sonra ekledik

        Game game = new Game(1,"Forza",199.99);
        Game game2 = new Game(2,"GTA V",200);
        Game game3 = new Game(3,"Red Dead Redemption 2",2000);

        GameManager gameManager = new GameManager();
        gameManager.purchaseGame(player,game2); // player game2 yi satın aldı

        Campaign campaign = new Campaign(1,"indirim fırsatı",30); // %30 kampanya tanımlandı

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.updateCampaign(game3,campaign,"indirim fırsatı kampanyası",30);

    }
}
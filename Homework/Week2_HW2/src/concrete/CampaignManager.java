package concrete;

import entities.Campaign;
import entities.Game;
import service.CampaignService;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Game game, double campaignPercentage) {
        double applyCampaign = game.getPrice() - (game.getPrice()) * (campaignPercentage / 100);
        game.setCampaignPrice(applyCampaign);
    }

    @Override
    public void updateCampaign(Game game, Campaign campaign, String name, double newCampaignPercentage) {
        campaign.setName(name);
        campaign.setCampaignPercentage(newCampaignPercentage);
        game.setCampaignPrice(game.getPrice() - (game.getPrice() * (newCampaignPercentage/100)));
    }

    @Override
    public void deleteCampaign(Game game, double campaignPercent) {
        game.setCampaignPrice(0);
    }
}

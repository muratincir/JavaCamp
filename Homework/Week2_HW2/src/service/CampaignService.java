package service;

import entities.Campaign;
import entities.Game;

public interface CampaignService {
    void addCampaign(Game game, double campaignPercentage);
    void updateCampaign(Game game , Campaign campaign ,String name , double newCampaignPercentage);
    void deleteCampaign(Game game , double campaignPercent);
}

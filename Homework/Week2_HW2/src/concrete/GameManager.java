package concrete;

import entities.Game;
import entities.Player;
import service.GameService;

public class GameManager implements GameService {
    @Override
    public void purchaseGame(Player player, Game game) {
        System.out.println(player.getFirstName()+" "+game.getName()+" adlı oyunu satın aldı");
    }
}

package service;

import entities.Game;
import entities.Player;

public interface GameService {
    void purchaseGame(Player player , Game game);
}

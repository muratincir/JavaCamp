package concrete;

import entities.Player;
import service.PlayerCheckService;
import service.PlayerService;

public class PlayerManager implements PlayerService,PlayerCheckService {
    private PlayerCheckService playerCheckService;

    public PlayerManager() {

    }

    @Override
    public void add(Player player) {
        if(playerCheckService.chechIfRealPerson(player)){
            System.out.println(player.getFirstName()+" "+player.getLastName()+" has been added !!!");
        }else{
            System.out.println("Not a valid person !!!");
        }
    }

    @Override
    public void delete(Player player) {
        System.out.println("Player id : "+player.getId()+" has been deleted !!!");
    }

    @Override
    public boolean chechIfRealPerson(Player player) {
        return true;
    }
}

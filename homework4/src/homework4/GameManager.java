package homework4;

public class GameManager implements IGameService {
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" adl� oyun eklendi");
		
	}
	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" adl� oyun silindi");
		
	}
	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" adl� oyun g�ncellendi");
		
	}

}

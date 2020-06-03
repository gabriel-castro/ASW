package sonc.game;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import sonc.shared.Movie;

public class Manager extends java.lang.Object implements java.io.Serializable, ManagerService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static File playersFile;
	private static Manager instance;
	private java.util.Set<Player> players = new HashSet<Player>();
	
	boolean	authenticate(java.lang.String nick, java.lang.String password) {
		
		for(Player jog : players) {
			if(jog.getNick().equals(nick) & jog.getPassword().equals(password)) return true;
		}
		return false;
	}
	
	Movie	battle(java.util.List<java.lang.String> nicks) {
		return null;
		
	}
	
	void	buildShip(java.lang.String nick, java.lang.String password, java.lang.String code) {
		
	}
	
	java.lang.String	getCurrentCode(java.lang.String nick, java.lang.String password){
		for(Player jog : players) {
			if(jog.getNick().equals(nick) & jog.getPassword().equals(password)) {
				return jog.getCode();
			}
		}
		return null;	
	}
	
	static Manager	getInstance() {
	      if (instance == null) {
	          instance=new Manager();
	      }
	      return instance;		
	}
	
	static java.io.File	getPlayersFile(){
		return playersFile;
		
	}
	
	java.util.List<java.lang.String>	getPlayersNamesWithShips(){
		List<String> pnws= new ArrayList<String>();
		for(Player jog : players) {
			if(!jog.getCode().equals("")) {
				pnws.add(jog.getNick());
			}
		}
		return pnws;		
	}
	
	boolean	register(java.lang.String userId, java.lang.String password) {
		try {
			Player aux = new Player(userId, password);
			players.add(aux);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	void	reset() {		
	}
	
	static void	setPlayersFile(java.io.File managerFile) {
		playersFile = managerFile;
	}
	
	boolean	updatePassword(java.lang.String nick, java.lang.String oldPassword, java.lang.String newPassword) {
		for(Player jog : players) {
			if(jog.getNick().equals(nick) & jog.getPassword().equals(oldPassword)) {
				jog.setPassword(newPassword);
				return true;
			}
		}
		return false;	
	}
}


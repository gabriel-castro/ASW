package sonc.game;

import sonc.battle.Ship;
import sonc.shared.SoncException;

public class Player extends java.lang.Object implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Ship instanceShip;
	private String password;
	private String nick;
	private String code;
	
	public Player(String string, String string2) {
		// TODO Auto-generated constructor stub
		nick = string;
		password = string2;
		code=null;
		instanceShip = new Ship();
	}

	boolean	authenticate(java.lang.String password) {
		if(password == this.password) return true;
		return false;		
	}
	
	void	checkCode() throws SoncException {
		
	}
	
	java.lang.String	getCode(){
		return code;		
	}
	
	java.lang.String	getNick() {
		return nick;		
	}
	
	java.lang.String	getPassword() {
		return password;		
	}
	
	Ship	instanceShip() {
	  return instanceShip;			
	}
	
	void	setCode(java.lang.String code) {
		this.code = code;
	}
	
	void	setNick(java.lang.String nick) {
		this.nick = nick;
	}
	
	void	setPassword(java.lang.String password) {
		this.password = password;
	}
}

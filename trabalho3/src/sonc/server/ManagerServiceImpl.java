package sonc.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import sonc.client.ManagerService;
import sonc.shared.Movie;
/**
 * Implementação do servico "Manager"
 */
public class ManagerServiceImpl extends RemoteServiceServlet implements ManagerService {
	private static final long serialVersionUID = 1L;

	
	@Override
	public boolean authenticate(String nick, String password) {
		// TODO Auto-generated method stub
		System.out.println("nick:"+nick+"\t pass:"+password);
		return false;
	}

	@Override
	public Movie battle(List<String> nicks) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildShip(String nick, String password, String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentCode(String nick, String password) {
		// TODO Auto-generated method stub
		return "while(abc){return true;}";
	}

	@Override
	public List<String> getPlayersNamesWithShips() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(String userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean updatePassword(String nick, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}

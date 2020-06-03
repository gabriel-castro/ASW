package sonc.client;



import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import sonc.shared.Movie;

/**
 * The client-side stub for the RPC service.
 * Interface Sincrona
 */

@RemoteServiceRelativePath("Manager")
public interface ManagerService extends RemoteService {
	public boolean authenticate(java.lang.String nick, java.lang.String password);
	public Movie	battle(java.util.List<java.lang.String> nicks);
	void	buildShip(java.lang.String nick, java.lang.String password, java.lang.String code);
	java.lang.String	getCurrentCode(java.lang.String nick, java.lang.String password);
	//static Manager	getInstance() {}
	java.util.List<java.lang.String>	getPlayersNamesWithShips();
	boolean	register(java.lang.String userId, java.lang.String password);
	public boolean	updatePassword(java.lang.String nick, java.lang.String oldPassword, java.lang.String newPassword);
}
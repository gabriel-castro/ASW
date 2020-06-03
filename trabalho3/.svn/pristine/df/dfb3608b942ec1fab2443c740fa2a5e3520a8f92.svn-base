package sonc.client.GUI;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

import sonc.client.ManagerService;
import sonc.client.ManagerServiceAsync;
import sonc.shared.Movie;
import sonc.shared.Movie.Frame;
import sonc.shared.Movie.Oblong;

public class MovieArea extends Composite{
	private final ManagerServiceAsync managerService = GWT.create(ManagerService.class);
	VerticalPanel moviePanel = new VerticalPanel();
	Movie filme = new Movie();
	List<Frame> frames = new ArrayList<Frame>();
	List<String> nicks = new ArrayList<String>();


	public MovieArea(){
	    Canvas canvas = Canvas.createIfSupported();
	    canvas.setCoordinateSpaceHeight(502);
	    canvas.setCoordinateSpaceWidth(1010);
	    Context2d context = canvas.getContext2d();
	    context.setStrokeStyle("#ff00ff");
	    context.beginPath();
		canvas.getContext2d();
		nicks.add(LoginArea.username.getText());
		managerService.battle(nicks, new AsyncCallback<Movie>(){
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.toString());		
			}
			@Override
			public void onSuccess(Movie result) {
				filme = result;
				frames = filme.getFrames();
			}						
		});
		for(Frame f : frames) {			
			List<Oblong> obl = new ArrayList<Oblong>();
			obl =f.getOblongs();
			for(Oblong o : obl) {	
				context.setFillStyle(o.getColor());
				context.fillRect( o.getX(), o.getY(), o.getX() + o.getSize(), o.getY() + o.getSize());
			}			
		}
		context.closePath();
	    context.stroke();
	    context.fill();
		moviePanel.add(canvas);
		initWidget(moviePanel);
	}
}

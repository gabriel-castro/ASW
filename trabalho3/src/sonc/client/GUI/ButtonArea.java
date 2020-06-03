package sonc.client.GUI;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;

import sonc.client.WebManager;

public class ButtonArea extends Composite{
	HorizontalPanel menu = new HorizontalPanel();
	HorizontalPanel menuLeft = new HorizontalPanel();

	Button codeButton = new Button("Code Area",new ClickHandler() {
		public void onClick(ClickEvent event) {
			CodeArea codeArea = new CodeArea();
			ButtonArea buttonArea = new ButtonArea();			
			WebManager.rootLevel.clear();
			WebManager.rootLevel.add(buttonArea);
			WebManager.rootLevel.add(codeArea);
		}
	});

	Button execButton = new Button("Execute Area",new ClickHandler() {
		public void onClick(ClickEvent event) {
			ButtonArea buttonArea = new ButtonArea();
			ExecArea execArea = new ExecArea();
			WebManager.rootLevel.clear();
			WebManager.rootLevel.add(buttonArea);
			WebManager.rootLevel.add(execArea);
		}
	});

	Button movieButton = new Button("Movie Area",new ClickHandler() {
		public void onClick(ClickEvent event) {
			ButtonArea buttonArea = new ButtonArea();
			MovieArea movieArea = new MovieArea();
			WebManager.rootLevel.clear();
			WebManager.rootLevel.add(buttonArea);
			WebManager.rootLevel.add(movieArea);
		}		
	});

	Button exitButton = new Button("Log Out",new ClickHandler() {
		public void onClick(ClickEvent event) {
			LoginArea login = new LoginArea();
			WebManager.rootLevel.clear();
			WebManager.rootLevel.add(login);

		}
	});

	public ButtonArea() {
		menu.add(menuLeft);
		menu.setWidth("1000px");
		menuLeft.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		menuLeft.add(codeButton);
		menuLeft.add(execButton);
		menuLeft.add(movieButton);
		menu.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		menu.add(exitButton);
		initWidget(menu);
	}
}

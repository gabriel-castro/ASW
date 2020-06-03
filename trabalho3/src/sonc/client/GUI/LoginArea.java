package sonc.client.GUI;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import sonc.client.ManagerService;
import sonc.client.ManagerServiceAsync;
import sonc.client.WebManager;

public class LoginArea extends Composite {
	private final ManagerServiceAsync managerService = GWT.create(ManagerService.class);
	VerticalPanel painelLogin = new VerticalPanel();
	HorizontalPanel botoes = new HorizontalPanel();

	final Label messageLabel = new Label();
	private Label usernameLabel = new Label();
	private Label passwordLabel = new Label();

	public static TextBox username = new TextBox();
	public static PasswordTextBox password = new PasswordTextBox();
	

	public LoginArea() {		
		usernameLabel.setText("Username: ");
		passwordLabel.setText("Password: ");
		messageLabel.setText("");
		painelLogin.add(usernameLabel);
		painelLogin.add(username);
		painelLogin.add(passwordLabel);
		painelLogin.add(password);
		botoes.add(autButton);
		botoes.add(regButton);
		botoes.add(messageLabel);
		painelLogin.add(botoes);
		initWidget(painelLogin);
	}
	// botao authenticate	
	Button autButton = new Button("Auhtenticate Button",new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			managerService.authenticate(username.getText(), password.getText(), new AsyncCallback<Boolean>(){
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.toString());					
				}
				@Override
				public void onSuccess(Boolean result) {
					ButtonArea buttonArea = new ButtonArea();
					WebManager.rootLevel.clear();
					WebManager.rootLevel.add(buttonArea);
				}						
			});
		}
	});


	// botao register
	Button regButton = new Button("Register Button",new ClickHandler() {
		public void onClick(ClickEvent event) {
			managerService.register(username.getText(), password.getText(), new AsyncCallback<Boolean>(){
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.toString());					
				}
				@Override
				public void onSuccess(Boolean result) {
					ButtonArea buttonArea = new ButtonArea();
					WebManager.rootLevel.clear();
					WebManager.rootLevel.add(buttonArea);
				}						
			});
		}
	});
}
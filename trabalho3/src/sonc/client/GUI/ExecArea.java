package sonc.client.GUI;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;
import sonc.client.ManagerService;
import sonc.client.ManagerServiceAsync;

public class ExecArea extends Composite{
	private final ManagerServiceAsync managerService = GWT.create(ManagerService.class);
	VerticalPanel painelExec = new VerticalPanel();
	private Label execLabel = new Label();   
	private TextArea exec = new TextArea();

	public ExecArea(){
		execLabel.setText("Command Execution: ");
		exec.setPixelSize(1000, 450);
		painelExec.add(execLabel);
		painelExec.add(exec);
		painelExec.add(execButton);
		initWidget(painelExec);
	}

	Button execButton = new Button("Execute command",new ClickHandler() {
		public void onClick(ClickEvent event) {
			managerService.buildShip(LoginArea.username.getText(), LoginArea.password.getText(), exec.getText(), new AsyncCallback<Void>(){
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.toString());
				}
				@Override
				public void onSuccess(Void result) {
					Window.alert("Command executed!");
				}						
			});
		}
	});

}

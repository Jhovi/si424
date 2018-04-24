package guiJav;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class form2 {

	protected Shell shell;
	private Text txtUrl;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form2 window = new form2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(503, 430);
		shell.setText("SWT Application");
		
		txtUrl = new Text(shell, SWT.BORDER);
		txtUrl.setBounds(57, 13, 321, 21);
		
		Label lblUrl = new Label(shell, SWT.NONE);
		lblUrl.setBounds(22, 16, 33, 15);
		lblUrl.setText("URL:");
		
		Browser browser = new Browser(shell, SWT.NONE);
		browser.setBounds(10, 88, 467, 294);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.setUrl(txtUrl.getText());
			}
		});
		btnNewButton.setBounds(10, 57, 75, 25);
		btnNewButton.setText("Ir");
		
		Button btnActualizar = new Button(shell, SWT.NONE);
		btnActualizar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.refresh();
			}
		});
		btnActualizar.setText("Actualizar");
		btnActualizar.setBounds(110, 57, 75, 25);
		
		Button btnRetroceder = new Button(shell, SWT.NONE);
		btnRetroceder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}
		});
		btnRetroceder.setText("Retroceder");
		btnRetroceder.setBounds(217, 57, 75, 25);
		
		Button btnAvanzar = new Button(shell, SWT.NONE);
		btnAvanzar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.forward();
			}
		});
		btnAvanzar.setText("Avanzar");
		btnAvanzar.setBounds(319, 57, 75, 25);

	}
}

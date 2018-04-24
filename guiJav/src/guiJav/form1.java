package guiJav;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class form1 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			form1 window = new form1();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmArchivo = new MenuItem(menu, SWT.CASCADE);
		mntmArchivo.setText("Archivo");
		
		Menu menu_1 = new Menu(mntmArchivo);
		mntmArchivo.setMenu(menu_1);
		
		MenuItem mntmNuevo = new MenuItem(menu_1, SWT.NONE);
		mntmNuevo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				form2 ventana = new form2();
				ventana.open();
			}
		});
		mntmNuevo.setText("Nuevo");
		
		MenuItem mntmAbrir = new MenuItem(menu_1, SWT.NONE);
		mntmAbrir.setText("Abrir");
		
		MenuItem mntmCerrar = new MenuItem(menu_1, SWT.NONE);
		mntmCerrar.setText("Cerrar");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmSalir = new MenuItem(menu_1, SWT.NONE);
		mntmSalir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.close();
			}
		});
		mntmSalir.setText("Salir");
		
		MenuItem mntmEdicion = new MenuItem(menu, SWT.CASCADE);
		mntmEdicion.setText("Edicion");
		
		Menu menu_2 = new Menu(mntmEdicion);
		mntmEdicion.setMenu(menu_2);
		
		MenuItem mntmEditar = new MenuItem(menu_2, SWT.NONE);
		mntmEditar.setText("Editar");
		
		MenuItem mntmCopiar = new MenuItem(menu_2, SWT.NONE);
		mntmCopiar.setText("Copiar");
		
		MenuItem mntmPegar = new MenuItem(menu_2, SWT.NONE);
		mntmPegar.setText("Pegar");
		
		MenuItem mntmHerramientas = new MenuItem(menu, SWT.CASCADE);
		mntmHerramientas.setText("Herramientas");
		
		Menu menu_3 = new Menu(mntmHerramientas);
		mntmHerramientas.setMenu(menu_3);
		
		MenuItem mntmAcercaDe = new MenuItem(menu, SWT.CASCADE);
		mntmAcercaDe.setText("Acerca de");
		
		Menu menu_4 = new Menu(mntmAcercaDe);
		mntmAcercaDe.setMenu(menu_4);
		
		MenuItem mntmAyuda = new MenuItem(menu_4, SWT.NONE);
		mntmAyuda.setText("Ayuda");

	}
}

package unitTest;

import gui.GuiController;
import gui.views.AddPatientView;
import gui.views.ClinicView;
import gui.views.DisplayPatientListView;
import gui.views.MainMenuView;
import gui.views.SystemSettingsView;
import trial.ClinicalTrial;
import file.FileAdapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * The Class GuiControllerTest.
 */
public class GuiControllerTest {
	
	/** The main menu view. */
	private MainMenuView mainMenuView;
	
	/** The add patient view. */
	private AddPatientView addPatientView;
	
	/** The system settings view. */
	private SystemSettingsView systemSettingsView;
	
	/** The file adapter. */
	private FileAdapter fileAdapter;
	
	/** The clinical trial. */
	private ClinicalTrial clinicalTrial;
	
	/** The display patient list view. */
	private DisplayPatientListView displayPatientListView;
	
	/** The clinic view. */
	private ClinicView clinicView;
	
	 /**
 	 * Test all.
 	 */
 	@Test
	public void testAll() {
		mainMenuView = new MainMenuView();
		addPatientView = new AddPatientView();
		systemSettingsView = new SystemSettingsView();
		fileAdapter = new FileAdapter();
		clinicalTrial = new ClinicalTrial();
		displayPatientListView = new DisplayPatientListView(clinicalTrial);
		clinicView = new ClinicView(clinicalTrial);
		
		Assert.assertNotNull(mainMenuView);
		Assert.assertNotNull(addPatientView);
		Assert.assertNotNull(systemSettingsView);
		Assert.assertNotNull(fileAdapter);
		Assert.assertNotNull(clinicalTrial);
		Assert.assertNotNull(displayPatientListView);
		Assert.assertNotNull(clinicView);
		
		GuiController gc = new GuiController(mainMenuView, addPatientView, systemSettingsView, fileAdapter,
				clinicalTrial, displayPatientListView, clinicView);
		
		Assert.assertNotNull(gc);
		
		Assert.assertNotNull(gc.getSystemSettingView());
		Assert.assertNotNull(gc.getAddPatientView());
		Assert.assertNotNull(gc.getMainMenuView());
		Assert.assertNotNull(gc.getFileAdapter());
		Assert.assertNotNull(gc.getClinicalTrial());
		Assert.assertNotNull(gc.getDisplayPatientListView());
		Assert.assertNotNull(gc.getClinicView());
	}
}

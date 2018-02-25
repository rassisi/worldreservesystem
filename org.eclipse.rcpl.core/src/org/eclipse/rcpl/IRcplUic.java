package org.eclipse.rcpl;

import java.io.File;
import java.util.List;

import org.eclipse.rcpl.model_2_0_0.rcpl.Perspective;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * @author ramin
 *
 */
public interface IRcplUic {

	void actionAddPresentationTab();

	void actionLogout();

	void actionOpen();

	void actionOpenLast();

	void addtoApplicationStack(StackPane contentGroup);

	void collapseAll();

	void createContent();

	void expandAllToolBars();

	void expandBottomAra(boolean expand);

	void expandLeftAra(boolean expand);

	void expandTopAra(boolean epand);

	Perspective findPerspective(String id);

	IRcplPlugin findRcplPlugins(String id);

	WebView getBrowser();

	IEditor getEditor();

	Node getFocusOwner();

	List<IHomePage> getHomepages();

	HBox getMainBottomArea();

	HBox getMainLeftArea();

	VBox getMainLeftBox();

	HBox getMainTopArea();

	StackPane getMainTopStack();

	INavigatorPlugin getNavigator();

	Perspective getPerspective();

	ISideToolBar getSideToolBarControl();

	Stage getStage();

	String getStyleMsOffice();

	List<String> getStylesRegistry();

	ITopToolbar getTopToolBarControl();

	IRcplPlugin getUseCase();

	void handleThemeDefault(ActionEvent event);

	void init(BorderPane parent);

	public boolean initSession(RcplLogin login);

	void initStyles();

	boolean isHome();

	boolean isInhibitUI();

	boolean isViewer();

	void openDocument(File file);

	void openTemplate(String name, String tabName);

	void recreateSideBar();

	void recreateTopBar();

	void restorePerspective();

	void restoreTab();

	void setPerspective(Perspective perspective, IRcplPlugin useCase);

	void setUseCase(IRcplPlugin useCase);

	void setContent(IEditor editor);

	void setContent(Node node);

	void setDebugText(String text);

	void setInhibitUI(boolean inhibitUI);

	void setLeftTrimBar(StackPane perspectiveToolSideBarStackPane);

	void setPerspective(Perspective perspective);

	void setStatusText(String text);

	void setTopAreaHeight(double height);

	void setTopContent(Node content);

	void setViewer(boolean viewer);

	void showAboutPage();

	boolean showBrowser();

	void showContactUsPage();

	void showDonationPage();

	void showErrorPage();

	void showHomePage();

	boolean showHtmlEditor();

	void showNewPage();

	void showOverviewPage();

	boolean showPerspective(String id, boolean asEditor);

	void showPreferencesPage();

	void showSamplesPage();

	void showStartMenuButton(boolean show);

	void showTabPane();

	void showTutorialsPage();

	void showWebView(String url);

	void showWhatsNewPage();

	void updateStartMenuButton();

}

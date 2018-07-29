package org.wrs.rcpl.ui.application;

import org.eclipse.rcpl.IHomePage;
import org.eclipse.rcpl.INavigatorTreeManager;
import org.eclipse.rcpl.IRcplUic;
import org.eclipse.rcpl.ITreePart;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePage;
import org.eclipse.rcpl.model_2_0_0.rcpl.HomePageType;
import org.wrs.rcpl.ui.homepages.AccountHomePage;
import org.wrs.rcpl.ui.homepages.WrsOverviewHomePage;

import com.joffice.rcpl.addon.office.factories.JOFactory;

/**
 * @author ramin
 * 
 */
public class WrsFactory extends JOFactory {

	@Override
	public IHomePage createHomePage(IRcplUic uic, HomePage model) {

		HomePageType type = model.getType();
		switch (type) {
		case CUSTOM:
			if ("HOME_PAGE_ACCOUNT".contentEquals(model.getId())) {
				return new AccountHomePage(uic, model);
			}
			return super.createHomePage(uic, model);
		case ABOUT:
			break;
		case CONTACT_US:
			break;
		case DOCUMENT:
			break;
		case DONATIONS:
			break;
		case EXCEL:
			break;
		case HELP:
			break;
		case HOME:
			break;
		case HTML_EDITOR:
			break;
		case NEW:
			break;
		case NEWS:
			break;
		case OVERVIEW:
			return new WrsOverviewHomePage(uic, model);
//			break;
		case PDF:
			break;
		case PERSPECTIVES:
			break;
		case POWERPOINT:
			break;
		case SAMPLES:
			break;
		case TEMPLATES:
			break;
		case TUTORIALS:
			break;
		case WEBSITE:
			break;
		case WELCOME:
			break;
		case WHATS_NEW:
			break;
		case WORD:
			break;
		default:
			break;
		}

		return super.createHomePage(uic, model);

	}

	@Override
	public INavigatorTreeManager createApplicationTreeManager() {
		return new WrsNavigatorTreeManagerImpl();
	}

	@Override
	public ITreePart createApplicationTreePart() {
		return new WrsNavigatorTreePart();
	}
}

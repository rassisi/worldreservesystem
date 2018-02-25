package org.eclipse.rcpl.model.cdo.client;


/**
 * @author Ramin
 * 
 */
public class JOMockData {

	@SuppressWarnings("unused")
	private JOSession session;

	public JOMockData(JOSession session) {
		this.session = session;
	}

//	public EOfficeDocument createOfficeDocument() {
//		EOfficeDocument officeDocument = JOfficeFactory.eINSTANCE
//				.createEOfficeDocument();
//
//		officeDocument.setUri("Default");
//		officeDocument.setId("Default");
//		EParagraph p1 = JOfficeFactory.eINSTANCE.createEParagraph();
//
//		p1.setX(0);
//		p1.setY(0);
//		ETextRun run = JOfficeFactory.eINSTANCE.createETextRun();
//		run.setText("This is Paragraph 1");
//		p1.getTextRuns().add(run);
//		officeDocument.getParagraphs().add(p1);
//
//		EParagraph p2 = JOfficeFactory.eINSTANCE.createEParagraph();
//		run = JOfficeFactory.eINSTANCE.createETextRun();
//		run.setText("This is Paragraph 2");
//		p2.getTextRuns().add(run);
//
//		p2.setX(0);
//		p2.setY(100);
//		officeDocument.getParagraphs().add(p2);
//		
//		return officeDocument;
//	}

}

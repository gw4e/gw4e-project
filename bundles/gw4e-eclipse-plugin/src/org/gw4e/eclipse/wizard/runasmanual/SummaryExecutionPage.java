package org.gw4e.eclipse.wizard.runasmanual;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class SummaryExecutionPage extends WizardPage {

	protected SummaryExecutionPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		  Composite control = new Composite(parent, SWT.NONE);
		  setControl(control);	 
		   
	}

 
	
}
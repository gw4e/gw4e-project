package org.gw4e.eclipse.studio.commands;

/*-
 * #%L
 * gw4e
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2017 gw4e-project
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.gw4e.eclipse.studio.part.editor.EdgePart;

public class ClearEdgeBendpointLayoutCommand extends Command {

	List<Object> selectedObjects;
	List<EditPart> parts = null;
	public ClearEdgeBendpointLayoutCommand(List<Object> selectedObjects) {
		super();
		this.selectedObjects = selectedObjects;
	}

	@Override
	public boolean canExecute() {
 
		if ((selectedObjects == null) || selectedObjects.size() == 0)
			return false;
		parts = new ArrayList<EditPart>();
		for (Object sel : selectedObjects) {
			if ( sel != null && sel instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable)sel;
				EdgePart part = adaptable.getAdapter(EdgePart.class);
				if (part!=null) parts.add(part);
			}
		}
		return parts.size() > 0;
	}

	@Override
	public void execute() {
		if (canExecute()) {
			for (EditPart part : parts) {
				((EdgePart)part).clearBendpoints();
			}
		}
	}

	@Override
	public boolean canUndo() {
		return false;
	}
}

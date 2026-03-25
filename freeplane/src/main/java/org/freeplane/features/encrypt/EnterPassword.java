/*
 *  Freeplane - mind map editor
 *  Copyright (C) 2008 Joerg Mueller, Daniel Polansky, Christian Foltin, Dimitry Polivaev
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.freeplane.features.encrypt;

import java.awt.event.ActionEvent;

import org.freeplane.core.ui.AFreeplaneAction;
import org.freeplane.core.ui.EnabledAction;
import org.freeplane.features.map.EncryptionModel;
import org.freeplane.features.map.MapController;
import org.freeplane.features.map.NodeModel;
import org.freeplane.features.mode.Controller;
import org.freeplane.features.mode.ModeController;

@EnabledAction(checkOnNodeChange=true)
public class EnterPassword extends AFreeplaneAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final private EncryptionController encryptionController;

	public EnterPassword(EncryptionController encryptionController) {
		super("EnterPassword");
		this.encryptionController = encryptionController;
	}

	public void actionPerformed(final ActionEvent e) {
		return;
	}

	public boolean canBeEnabled() {
		return false;
	}

	@Override
    public void setEnabled() {
	    super.setEnabled(canBeEnabled());
    }
}

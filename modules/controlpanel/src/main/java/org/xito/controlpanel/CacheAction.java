// Copyright 2007 Xito.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.xito.controlpanel;

import java.awt.event.*;
import javax.swing.*;

import org.xito.dialog.*;

/**
 *
 * @author Deane Richan
 */
public class CacheAction extends ControlPanelAction {
   
   public CacheAction() {
      super();
      
      super.putValue(Action.NAME, "Cache Settings");
      super.putValue(Action.SHORT_DESCRIPTION, "Configure Cache Settings");
   }
   
   /**
    * Show the Cache Config Dialog
    */
   public void actionPerformed(ActionEvent evt) {
      DialogManager.showMessage(null, "Cache Settings", "Not Implemented");
   }
}

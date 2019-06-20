/**
* Together XPDL Model
* Copyright (C) 2011 Together Teamsolutions Co., Ltd. 
* 
* This program is free software: you can redistribute it and/or modify 
* it under the terms of the GNU General Public License as published by 
* the Free Software Foundation, either version 3 of the License, or 
* (at your option) any later version. 
*
* This program is distributed in the hope that it will be useful, 
* but WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the 
* GNU General Public License for more details. 
*
* You should have received a copy of the GNU General Public License 
* along with this program. If not, see http://www.gnu.org/licenses
*/

package org.enhydra.jxpdl.elements;

import org.enhydra.jxpdl.XMLAttribute;
import org.enhydra.jxpdl.XMLComplexElement;
import org.enhydra.jxpdl.XPDLConstants;

/**
 * Represents corresponding element from XPDL schema.
 * 
 * @author Sasa Bojanic
 */
public class TaskUser extends XMLComplexElement {

   /**
    * Constructs a new object with the given TaskTypes as a parent.
    */
   public TaskUser(TaskTypes parent) {
      super(parent, true);
   }

   protected void fillStructure() {
      XMLAttribute attrImplementation = new XMLAttribute(this,
                                                         "Implementation",
                                                         true,
                                                         new String[] {
                                                               XPDLConstants.TASK_IMPLEMENTATION_WEBSERVICE,
                                                               XPDLConstants.TASK_IMPLEMENTATION_OTHER,
                                                               XPDLConstants.TASK_IMPLEMENTATION_UNSPECIFIED
                                                         },
                                                         0);

      Performers refPerformers = new Performers(this);// min=0
      Message refMessageIn = new Message(this, "MessageIn");
      Message refMessageOut = new Message(this, "MessageOut");
      WebServiceOperation refWebServiceOperation = new WebServiceOperation(this, false);

      add(attrImplementation);
      add(refPerformers);
      add(refMessageIn);
      add(refMessageOut);
      add(refWebServiceOperation);
   }

}

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

import org.enhydra.jxpdl.XMLCollectionElement;

/**
 *  Represents corresponding element from XPDL schema.
 * 
 *  @author Sasa Bojanic
 */
public class TransitionRef extends XMLCollectionElement {

   /**
    * Constructs a new object with the given TransitionRefs as a parent.
    */
   public TransitionRef (TransitionRefs parent) {
      super (parent, true);
   }

   /**
    * Constructs a new object with the given WebServiceFaultCatchTypes as a parent.
    */
   public TransitionRef (WebServiceFaultCatchTypes parent) {
      super (null, true);
      setParent(parent);
   }
   
}

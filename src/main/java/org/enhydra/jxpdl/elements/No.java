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

import org.enhydra.jxpdl.XMLComplexElement;

/**
 *  Represents corresponding element from XPDL schema.
 * 
 *  @author Sasa Bojanic
 */
public class No extends XMLComplexElement {
   
   /**
    * Constructs a new object with the given ImplementationTypes as a parent.
    */
   public No (ImplementationTypes parent) {
      super(parent, true);
   }
   
   /**
   * Overrides super-class method to indicate that this element
   * is never empty, so it's tag will always be written into
   * XML file.
   *
   * @return <tt>false</tt>
   */
   public boolean isEmpty() {
      return false;
   }

   protected void fillStructure () {}
}

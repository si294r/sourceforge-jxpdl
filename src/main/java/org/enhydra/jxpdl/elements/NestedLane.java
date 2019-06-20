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

/**
 * Represents corresponding element from XPDL schema.
 * 
 * @author Sasa Bojanic
 */
public class NestedLane extends XMLComplexElement {

   /**
    * Constructs a new object with the given NestedLanes as a parent.
    */
   public NestedLane(NestedLanes parent) {
      super(parent, true);
   }

   protected void fillStructure() {
      XMLAttribute attrLaneId = new XMLAttribute(this, "LaneId", true);
      add(attrLaneId);
   }

   /** Returns the LaneId attribute value of this object. */
   public String getLaneId() {
      return get("LaneId").toValue();
   }

   /** Sets the LaneId attribute value of this object. */
   public void setLaneId(String laneId) {
      set("LaneId", laneId);
   }
   
   public String toString () {
      return getLaneId();
   }
}

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
public class Coordinates extends XMLComplexElement {

   /**
    * Constructs a new object with the given NodeGraphicsInfo as a parent.
    */
   public Coordinates(NodeGraphicsInfo parent) {
      super(parent, false);
   }

   /**
    * Constructs a new object with the given Coordinatess as a parent.
    */
   public Coordinates(Coordinatess parent) {
      super(parent, false);
   }

   protected void fillStructure() {
      XMLAttribute attrXCoordinate = new XMLAttribute(this, "XCoordinate", false);
      XMLAttribute attrYCoordinate = new XMLAttribute(this, "YCoordinate", false);

      add(attrXCoordinate);
      add(attrYCoordinate);
   }

   /** Returns the XCoordinate attribute value of this object. */
   public String getXCoordinate() {
      return get("XCoordinate").toValue();
   }

   /** Sets the XCoordinate attribute value of this object. */
   public void setXCoordinate(String x) {
      set("XCoordinate", x);
   }

   /** Returns the YCoordinate attribute value of this object. */
   public String getYCoordinate() {
      return get("YCoordinate").toValue();
   }

   /** Sets the YCoordinate attribute value of this object. */
   public void setYCoordinate(String y) {
      set("YCoordinate", y);
   }

}

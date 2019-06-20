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

import org.enhydra.jxpdl.XMLCollection;
import org.enhydra.jxpdl.XMLElement;

/**
 * Represents corresponding element from XPDL schema.
 * 
 * @author Sasa Bojanic
 */
public class Pools extends XMLCollection {

   /** Constructs a new object with the given {@link Package} as a parent. */
   public Pools(Package parent) {
      super(parent, false);
   }

   /**
    * Generates new {@link Pool} object. This object is not member of the collection yet, it has
    * to be explicitly added to the collection.
    */
   public XMLElement generateNewElement() {
      return new Pool(this);
   }

   /**
    * Returns the {@link Pool} object (the member of this Pools collection) with specified Id.
    */
   public Pool getPool(String Id) {
      return (Pool) super.getCollectionElement(Id);
   }

}

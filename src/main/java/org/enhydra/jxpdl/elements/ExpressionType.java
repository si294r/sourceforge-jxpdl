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
import org.enhydra.jxpdl.XMLElement;
import org.enhydra.jxpdl.XMLElementChangeInfo;

/**
 * Represents corresponding element from XPDL schema.
 * 
 * @author Sasa Bojanic
 */
public abstract class ExpressionType extends XMLComplexElement {

   /**
    * Constructs a new object with the given element as a parent, and flag that determines
    * if object in this context is required by XPDL schema.
    */
   public ExpressionType(XMLElement parent, boolean isRequired) {
      super(parent, isRequired);
   }

   /**
    * Constructs a new object with the given element as a parent, the given name, and flag
    * that determines if object in this context is required by XPDL schema.
    */
   public ExpressionType(XMLElement parent, String name, boolean isRequired) {
      super(parent, name, isRequired);
   }

   protected void fillStructure() {
      XMLAttribute attrScriptType = new XMLAttribute(this, "ScriptType", false);
      XMLAttribute attrScriptVersion = new XMLAttribute(this, "ScriptVersion", false);
      XMLAttribute attrScriptGrammar = new XMLAttribute(this, "ScriptGrammar", false);

      add(attrScriptType);
      add(attrScriptVersion);
      add(attrScriptGrammar);
   }

   public void makeAs(XMLElement el) {
      super.makeAs(el);
      setValue(el.toValue());
   }

   public void setValue(String v) {
      if (isReadOnly) {
         throw new RuntimeException("Can't set the value of read only element!");
      }
      boolean notify = false;
      String oldValue = value;
      if (!this.value.equals(v)) {
         notify = true;
      }

      this.value = v;

      if (notify && (notifyMainListeners || notifyListeners)) {
         XMLElementChangeInfo info = createInfo(oldValue,
                                                value,
                                                null,
                                                XMLElementChangeInfo.UPDATED);
         if (notifyListeners) {
            notifyListeners(info);
         }
         if (notifyMainListeners) {
            notifyMainListeners(info);
         }
      }
   }

   /** Returns the ScriptGrammar attribute value of this object. */
   public String getScriptGrammar() {
      return get("ScriptGrammar").toValue();
   }

   /** Sets the ScriptGrammar attribute value of this object. */
   public void setScriptGrammar(String grammar) {
      set("ScriptGrammar", grammar);
   }

   /** Returns the ScriptType attribute value of this object. */
   public String getScriptType() {
      return get("ScriptType").toValue();
   }

   /** Sets the ScriptType attribute value of this object. */
   public void setScriptType(String type) {
      set("ScriptType", type);
   }

   /** Returns the ScriptVersion attribute value of this object. */
   public String getScriptVersion() {
      return get("ScriptVersion").toValue();
   }

   /** Sets the ScriptVersion attribute value of this object. */
   public void setScriptVersion(String version) {
      set("ScriptVersion", version);
   }

}

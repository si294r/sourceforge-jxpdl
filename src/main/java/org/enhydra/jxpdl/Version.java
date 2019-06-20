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

package org.enhydra.jxpdl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

/**
 * Provides a build version number information which can be used to check if this build of
 * the project/XPDL model is different than the one used before.
 */
public class Version {

   /** Holds version information. */
   private static long version = 1138194850828L;

   static {
      try {
         ResourceBundle rb = ResourceBundle.getBundle("org.enhydra.jxpdl.resources.version");
         String u = rb.getString("udate");
         SimpleDateFormat a = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
         version = a.parse(u).getTime();
      } catch (ParseException e) {
         e.printStackTrace();
      }
      // System.err.println("version:"+version);
   }

   /**
    * Returns the current version number which is the timestamp information about the last
    * change to XPDL model.
    * 
    * @return the current version number.
    */
   public static long getVersion() {
      return version;
   }

}

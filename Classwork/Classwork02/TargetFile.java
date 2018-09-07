package copiersupport;
/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  Purpose       :  Creates a new file.
 *  Author        :  James Migdal
 *  Date          :  2018-09-07
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-07  James Migdal  Initial writing and release
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.io.IOException;
import java.io.FileWriter;

public class TargetFile {
   private static String fileName;
   private static String content;
   
   public static void main( String args[] ) {
      
   }
   
   public TargetFile( String fileName, String content ) throws IOException {
      this.fileName = fileName;
      this.content = content;
      
      FileWriter out = null;
      
      try {
         out = new FileWriter( fileName + ".copy" );
         out.write( content );
      } finally {
         if ( out != null ) {
            out.close();
         }
      }
   }  
}
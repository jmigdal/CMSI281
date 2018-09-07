/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  Purpose       :  Reads file and copies content.
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

package copiersupport;
import java.io.IOException;
import java.io.FileReader;

public class SourceFile {
   private static String fileName;
   public static String content = "";
   
   public static void main( String args[] ) throws IOException {
      FileReader in = null;
      
      try {
         in = new FileReader( fileName );         
         
         int c;
         while ( (c=in.read()) != -1 ) {
            content = content + (char)c;
         }
      } finally {
         if ( in != null ) {
            in.close();
         }
      }
   }
   
   public SourceFile( String fileName ) {
      this.fileName = fileName;
   }
   
   public String getContent() {
      return this.content;
   }
}
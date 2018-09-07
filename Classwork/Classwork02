/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  Purpose       :  Calls classes to copy a file.
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
import copiersupport.*;
import java.util.Scanner;
import java.io.*;

public class MyFileCopier {
   
   public static void main( String args[] ) throws IOException {
      System.out.print( "Please enter the name of the file: " );
      Scanner myInput = new Scanner( System.in );
      String fileName = myInput.nextLine();
      
      SourceFile src = new SourceFile( fileName );
      String content = src.getContent();
      
      TargetFile tgf = new TargetFile( fileName, content );
   }
}

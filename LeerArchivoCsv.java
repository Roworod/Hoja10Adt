/**************************************
*@author: Robbin Woods Rodriguez 15201
*@version: 1.0
*leerArchivoCsv.java
**************************************/

/*este codigo fue tomado de: (con algunas modificaciones menores)
http://chuwiki.chuidiang.org/index.php?title=Leer_fichero_CSV_con_Java*/

import java.io.*;

public class LeerArchivoCsv{

	public static final String QUOTE="\"";

	public String[][] read(){

		BufferedReader br = null;
		String[][] resultado=new String[15][15];
		int count=0;
		
	      
	    try {
	        
	        br =new BufferedReader(new FileReader("datos.csv"));
	        String line = br.readLine();

	        while (null!=line) {
	           String[] fields = line.split(";");
	            
	           fields = removeTrailingQuotes(fields);

	           resultado[count]=fields;
	           count++;

	           line = br.readLine();
	        }
	        if (null!=br) {
	           br.close();
	        }
	    } 
	    catch (Exception e) {
	        System.out.println("error al leer el archivo");
	    } 

	    return resultado;
					
	}

	private static String[] removeTrailingQuotes(String[] fields) {

      String result[] = new String[fields.length];

      for (int i=0;i<result.length;i++){
         result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
      }
      return result;
   }


}
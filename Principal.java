/********************************
*@author: Robbin Woods 15201
*@version:1.0
*Neo4jJavaTestConnection*/

public class Principal{
	public static void main(String[] args){

        LeerArchivoCsv miArchivo=new LeerArchivoCsv();

        String [][] lectura=miArchivo.read();

        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                System.out.println(lectura[i][j]);
            }
        }

    }
}
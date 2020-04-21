import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class Translator
{
    Map<String,String> Mapa;

    public void PrepararDiccionario() throws Exception
    {
        String tipo = PedirTipoDeImplementacion();
        
        MapFactory MyFactory = new MapFactory<String>();
        Mapa = MyFactory.getMap(tipo);
        String palabraAnterior="";
         
        BufferedReader br = new BufferedReader(new FileReader("Spanish.txt"));
        String line; 

        
        while ((line = br.readLine()) != null) 
        {
            line=line.toLowerCase();

           if(!line.contains("#"))
            {
                try
                {
                
                    String[] linea=line.split("\\s+|,|\\[|/");
                    String palabraActual=linea[0];
                    String significadoPalabraActual=linea[1];
                
                    if(!palabraAnterior.equals(palabraActual))
                    {
                        
                        //System.out.println(palabraActual+" / "+significadoPalabraActual);
                        Mapa.put(palabraActual, significadoPalabraActual); //ingles,espanol
                        palabraAnterior=palabraActual;
                        
                    }   
                    
                }
                catch(Exception e)
                {

                }

            } //end IF  

        }//end While
        

    }

    private String PedirTipoDeImplementacion()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione un tipo de Map:");
        System.out.println("1)SplayTree\n2)HashMap");
        String tipo="";
        int opcion= scan.nextInt();
        switch(opcion)
        {
            case 1: tipo="SplayTree"; break;
            case 2: tipo="HashMap"; break;
            default: tipo="HashMap"; break;
        }
        return tipo;
    }

    public String Traducir() throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
        String line; 
        String traduccionFinal="";
        while ((line = br.readLine()) != null) 
        {
            try
            { 
            
                line=line.toLowerCase();
                //System.out.println(line);

                String[] linea=line.split("\\s+|,");
                for(int i=0;i<linea.length;i++)
                {
                    String palabraActual=linea[i];
                    //System.out.println(palabraActual);
                    String palabraTraducida=Mapa.get(palabraActual); 
                    //System.out.println(palabraTraducida);
                    traduccionFinal+= palabraTraducida+" ";
                }      
                traduccionFinal+="\n";
                
            }
            catch(Exception e)
            {

            }
        }
        
        return traduccionFinal;
    }
    
}
public class Main{
    public static void main(String[] args) {

         try
         {
             System.out.println("Se traducira el archivo texto.txt\n");
             Translator translator= new Translator();
             translator.PrepararDiccionario();
             String traduccionFinal= translator.Traducir();
             System.out.println(traduccionFinal);
         }
         catch(Exception e)
         {

         }
        

    }
}
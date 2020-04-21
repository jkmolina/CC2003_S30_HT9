public class Main{
    public static void main(String[] args) {
        /*String one="danielb";
        String two="daniela";
        System.out.println(one.compareTo(two));*/

        

        try
        {
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
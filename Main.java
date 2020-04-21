public class Main{
    public static void main(String[] args) {
        /*String one="danielb";
        String two="daniela";
        System.out.println(one.compareTo(two));*/

        SplayNode one=new SplayNode("yes","si");
        SplayNode two=new SplayNode("car","carro");
        SplayNode three=new SplayNode("blue","azul");
        SplayNode four=new SplayNode("table","mesa");

        SplayTree tree= new SplayTree();
        tree.insert(one);
        tree.insert(two);
        tree.insert(three);
        tree.insert(four);
        tree.search("car");


        // try
        // {
        //     Translator translator= new Translator();
        //     translator.PrepararDiccionario();
        //     String traduccionFinal= translator.Traducir();
        //     System.out.println(traduccionFinal);
        // }
        // catch(Exception e)
        // {

        // }
        

    }
}
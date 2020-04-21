
public class SplayNode {
    SplayNode left, right, parent;

    String english;
    String spanish;




    /** Constructor **/

    public SplayNode(String english,String spanish)

    {
        this.left=null;
        this.right=null;
        this.parent=null;
        this.english=english;
        this.spanish=spanish;
        
    }          


    public SplayNode()

    {
        this.left=null;
        this.right=null;
        this.parent=null;
        this.english=null;
        this.spanish=null;
        
    }    

}
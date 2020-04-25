import java.util.ArrayList;

//Referencia de codigo: https://www.sanfoundry.com/java-program-implement-splay-tree/


public class SplayTree {

    SplayNode root;
    int count = 0;

         /** Constructor **/

    public SplayTree()
    {
        root = null;
    }


         /** function to insert element */

        public void insert(SplayNode word)
        {
            SplayNode z = root;

            SplayNode p = null;

            while (z != null)
            {
                p = z;
                if (word.english.compareTo(p.english) > 0)
                    z = z.right;

                else
                    z = z.left;
            }

            z = new SplayNode();

            z.english = word.english;
            z.spanish= word.spanish;

            z.parent = p;

            if (p == null)

                root = z;

            else if (word.english.compareTo(p.english) > 0)

                p.right = z;

            else

                p.left = z;

            Splay(z);

            count++;

        }


        private void Splay(SplayNode x)

        {
   
            while (x.parent != null)
   
            {
   
                SplayNode Parent = x.parent;
   
                SplayNode GrandParent = Parent.parent;
   
                if (GrandParent == null)
   
                {
   
                    if (x == Parent.left)
   
                        makeLeftChildParent(x, Parent);
   
                    else
   
                        makeRightChildParent(x, Parent);                 
   
                } 
   
                else
   
                {
   
                    if (x == Parent.left)
   
                    {
   
                        if (Parent == GrandParent.left)
   
                        {
   
                            makeLeftChildParent(Parent, GrandParent);
   
                            makeLeftChildParent(x, Parent);
   
                        }
   
                        else 
   
                        {
   
                            makeLeftChildParent(x, x.parent);
   
                            makeRightChildParent(x, x.parent);
   
                        }
   
                    }
   
                    else 
   
                    {
   
                        if (Parent == GrandParent.left)
   
                        {
   
                            makeRightChildParent(x, x.parent);
   
                            makeLeftChildParent(x, x.parent);
   
                        } 
   
                        else 
   
                        {
   
                            makeRightChildParent(Parent, GrandParent);
   
                            makeRightChildParent(x, Parent);
   
                        }
   
                    }
   
                }
   
            }
   
            root = x;
   
        }
          /** rotate **/

          public void makeLeftChildParent(SplayNode c, SplayNode p)

          {
     
              if ((c == null) || (p == null) || (p.left != c) || (c.parent != p))
     
                  throw new RuntimeException("WRONG");
     
      
     
              if (p.parent != null)
     
              {
     
                  if (p == p.parent.left)
     
                      p.parent.left = c;
     
                  else 
     
                      p.parent.right = c;
     
              }
     
              if (c.right != null)
     
                  c.right.parent = p;
     
      
     
              c.parent = p.parent;
     
              p.parent = c;
     
              p.left = c.right;
     
              c.right = p;
     
          }
     
      
     
          /** rotate **/
     
          public void makeRightChildParent(SplayNode c, SplayNode p)
     
          {
     
              if ((c == null) || (p == null) || (p.right != c) || (c.parent != p))
     
                  throw new RuntimeException("WRONG");
     
              if (p.parent != null)
     
              {
     
                  if (p == p.parent.left)
     
                      p.parent.left = c;
     
                  else
     
                      p.parent.right = c;
     
              }
     
              if (c.left != null)
     
                  c.left.parent = p;
     
              c.parent = p.parent;
     
              p.parent = c;
     
              p.right = c.left;
     
              c.left = p;
     
          }

               /** Function for inorder traversal **/ 
ArrayList<SplayNode> splayList = new ArrayList<>();

     public void inorder()

     {

         inorder(root);

     }

     private void inorder(SplayNode r)

     {

         if (r != null)

         {

            inorder(r.left);

            splayList.add(r);

            inorder(r.right);

         }

    }


//codigo basado en https://www.sanfoundry.com/java-program-implement-splay-tree/


    public String search(String word)
    {
        inorder();
        for(int i=0;i<splayList.size();i++)
        {
            if(splayList.get(i).english.equals(word))
            {
               // System.out.println();
              //  System.out.println(splayList.get(i).spanish);
                return splayList.get(i).spanish;
            }
        }
        return "*"+word+"*";
    }

      


 
}
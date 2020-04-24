class SplayTree_calls
{
    SplayTree tree;
    
    public SplayTree_calls()
    {
       tree = new SplayTree();
    }

    public void put(String english, String spanish)
    {
        SplayNode node=new SplayNode(english,spanish);
        tree.insert(node);
    }

    public String get(String english)
    {
        return tree.search(english);
    }

}
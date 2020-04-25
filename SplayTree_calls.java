class SplayTree_calls<K,V> implements Map<K,V>
{
    SplayTree tree;
    
    public SplayTree_calls()
    {
       tree = new SplayTree();
    }

    public void put(K english, V spanish)
    {
        SplayNode node=new SplayNode(english.toString(),spanish.toString());
        tree.insert(node);
    }

    public String get(K english)
    {
        return tree.search(english.toString());
    }


}
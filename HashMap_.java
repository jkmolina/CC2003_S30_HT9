import java.util.HashMap;

class HashMap_<K,V> implements Map<K,V>
{
    HashMap<K, V> MyMap = new HashMap<K, V>();

    public void put(K Key,V Value)
    {
        MyMap.put(Key, Value);
    }

    public String get(K Key)
    {
        if(MyMap.containsKey(Key)) return MyMap.get(Key).toString();
        else return  "*"+Key.toString()+"*";
    }
}
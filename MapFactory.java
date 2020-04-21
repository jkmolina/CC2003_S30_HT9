import java.util.*;

class MapFactory<E>
{
    public Map<E,E> getMap(String tipo)
    {
        Map<E,E> mapa=null;
        switch(tipo)
        {
            //case "SplayTree": mapa= new SplayTree<E, E>(); break;
            case "HashMap": mapa= new HashMap_<E, E>(); break;
            default: mapa= new HashMap_<E, E>(); break;
        }
        return mapa;
    }
}
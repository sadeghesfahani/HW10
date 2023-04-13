import java.util.*;

public class Map<T, U> {

    private ArrayList<Pair<T, U>> list = new ArrayList<>();

    public Map(ArrayList<Pair<T, U>> list) {
        this.list = list;
    }
    public Map(){
        
    }

    public Map(Pair<T, U> pair) {
        this.list.add(pair);
    }

    public void add(Pair<T, U> pair) {
        // check if already exists
        for (Pair<T, U> p : list) {
            if (p.getKey().equals(pair.getKey())) {
                return;
            }
        }
        list.add(pair);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Map other)) {
            return false;
        }
        Set<?> set1 = new HashSet<>(this.list);
        Set<?> set2 = new HashSet<>(other.list);

        return set1.equals(set2);
    }

    public void assign(Map<T, U> other) {
        this.list = other.list;
    }

    public U get(T key) {
        for (Pair<T, U> pair : list) {
            if (pair.getKey().equals(key)) {
                return pair.get(key);
            }
        }
        return null;
    }



}

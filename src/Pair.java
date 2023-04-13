import java.util.Map;

public class Pair<T , U> {
    private Map<T,U> pair;

    public void set(T x, U y) {
        pair.put(x, y);
    }

    public U get(T x) {
        return pair.get(x);
    }

    public T getKey() {
        return pair.keySet().iterator().next();
    }

    public Pair() {

    }

    public Pair(T x, U y){
        pair.put(x, y);
    }
}

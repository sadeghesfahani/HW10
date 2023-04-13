import java.util.HashMap;
import java.util.Map;

public class Pair<T , U> {
    private final Map<T,U> pair = new HashMap<>();

    public void set(T x, U y) {
        this.pair.put(x, y);
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

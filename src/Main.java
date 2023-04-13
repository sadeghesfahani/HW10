public class Main {
    public static void main(String[] args) {

        Pair<Integer,Integer> pair1 = new Pair<>(1,1);
        Pair<Integer,Integer> pair2 = new Pair<>(2,2);
        Pair<Integer,Integer> pair3 = new Pair<>(3,3);

        Map<Integer,Integer> map1 = new Map<>(pair1);
        Map<Integer,Integer> map2 = new Map<>(pair2);
        map1.add(pair2);
        map2.add(pair1);

        System.out.println(map1.equals(map2));

    }
}
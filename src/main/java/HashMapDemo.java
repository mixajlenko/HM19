
public class HashMapDemo {
    public static void main(String[] args) {
        HashMapRealization<String, String> myMap = new HashMapRealization<>();
        HashMapRealization<Integer, String> myMap2 = new HashMapRealization<>();
        myMap.add("hello","world");
        myMap.add("1", "blablabla");
        myMap2.add(2, "work");



        System.out.println("value: " + myMap.get("hello"));
        System.out.println("value: " + myMap.get("1"));
        System.out.println("value: " + myMap2.get(2));
        System.out.println("size: " + myMap.size());
        System.out.println("size: " + myMap2.size());


    }
}

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> b = new HashMap();
        b.put("1bpi23309", new Student("Авзалов", "Артур", 19, 5));
        b.remove("1bpi23309");
        System.out.println(b.get("1bpi23309"));

        HashTable<String, Integer> a = new HashTable<>();
        a.put("a", 5);
        a.put("b", 2);
//        a.remove("a");
        System.out.println(a.get("a"));
        System.out.println(a.get("b"));
    }
}

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        for (int i = 0; i < 109; i++) {
            list.add(i);
        }
        int size = (int) Math.round((double)list.size()/2);
        for (int i = 0; i < size; i++) {
            list.remove(i);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

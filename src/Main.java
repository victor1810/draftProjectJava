import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        var cube = new ArrayList<Integer>(List.of(0, 0, 0, 0, 0, 0));
        int count = 20;

        while (count > 0) {
            int position = random.nextInt(0, 6);
            Integer el = cube.get(position);
            cube.set(position, el + 1);
            count -= 1;
        }
        System.out.println(cube);
    }
}
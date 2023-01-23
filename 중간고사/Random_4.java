import java.io.*;
import java.util.*;

class Random_1 {
    int [] rnum = new int[10];
    int max;
    int seed;

    Random_1(int seed) {
        this.seed = seed;
        max = 0;
    }

    void set_arr() {
        Random rnd = new Random(seed);

        for (int i = 0; i< 10; i++)
            rnum[i] = rnd.nextInt(100);
    }
    
    void find_max() {
        for (int i = 0; i<10; i++) {
            if (rnum[i] > max) {
                max = rnum[i];
            }
        }
    }
    

    int get_max(){
        return max;
    }
}

class Random_4 {
    public static void main(String args[]) throws IOException {
        Random_1 r1 = new Random_1(5);
        Random_1 r2 = new Random_1(15);
        int rand1, rand2;
        r1.set_arr();
        rand1 = r1.get_max();
        r2.set_arr();
        rand2 = r2.get_max();

        System.out.printf("%d, %d", rand1, rand2);
    }
}


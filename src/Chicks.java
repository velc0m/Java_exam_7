/**
 * Created by LitVV on 15.09.2016.
 */
public class Chicks {

    void yack(long id) {
        for (int i = 1; i < 3; i++) {
                System.out.print(id + " ");
                Thread.yield();
            }
        }
    }

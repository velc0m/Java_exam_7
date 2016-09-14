package OCP.Chapter_12.inner.AnonymousInnerClass.flavorOne;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Food {

    PopCorn p = new PopCorn() {
        public void pop() {
            System.out.println("New pop corn is bad!");
        }

        public void newPop() {
            System.out.println("Ahahaha!");
        }
    };

    public void tryNewMethod() {
        p.pop();
        //Upssss!!
        //p.newPop();
    }
}

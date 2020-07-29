/*
 * Strategy design pattern
 */
public class Main {

    public static void main(String[] args) {

        // m1 and m2 are launched.
        Missile m1 = new Missile();
        Missile m2 = new Missile();
        m1.setAnimation(new LaunchedAnimation());
        m2.setAnimation(new LaunchedAnimation());

        // show animation
        for (int i = 0; i < 5; i++) {
            m1.animate();
            m2.animate();
        }

        // now m2 hit the target while m1 continue to fly toward the target
        m2.setAnimation(new ExplosionAnimation());

        // show animation
        for (int i = 0; i < 5; i++) {
            m1.animate();
            m2.animate();
        }
    }

}

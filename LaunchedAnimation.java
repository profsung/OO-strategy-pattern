
/**
 * Participant: ConcreteStrategy
 */

public class LaunchedAnimation implements Animation {

    @Override
    public void update() {
        System.out.println("Update the location of the bullet to the target.");
    }

    @Override
    public void render() {
        System.out.println(" ... <fired> rendered on the screen");
    }

}

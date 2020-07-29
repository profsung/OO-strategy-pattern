/**
 * Participant: ConcreteStrategy
 */

public class ExplosionAnimation implements Animation {

    @Override
    public void update() {
        System.out.println("Update the size of the bullet to make explosion effect.");
    }

    @Override
    public void render() {
        System.out.println(" ... <explosion> rendered on the screen");
    }
    
}

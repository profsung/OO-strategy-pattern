/*
 * Participant: Context
 */

public class Missile {
    
    private Animation animation;
    
    public void setAnimation(Animation animation) {
        this.animation = animation;
    }
    
    public void animate() {
        animation.update();
        animation.render();
    }
    
}

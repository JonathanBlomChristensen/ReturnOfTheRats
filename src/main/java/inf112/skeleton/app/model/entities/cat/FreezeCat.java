package inf112.skeleton.app.model.entities.cat;

import java.util.ArrayList;
import java.util.LinkedList;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import inf112.skeleton.app.model.entities.Projectile;
import inf112.skeleton.app.model.entities.rat.Rat;

public class FreezeCat extends Cat {
    private int upgradeCounter = 0;
    
    public FreezeCat() {

        super(1, 100,  new Texture(Gdx.files.internal("cats/Spill_frysekatt1.png")), new Texture(Gdx.files.internal("cats/Spill_frysekatt2.png")), null, null, 50.0f,1000);
    }

    @Override
    public ArrayList<Projectile> attack(LinkedList<Rat> rats) {
        ArrayList<Projectile> projectileList = new ArrayList<>();
        if (canAttack()) {
            triggerAttackImage(); 
            for (Rat rat : rats) {
                //når prosejektilet har truffet.
                projectileList.add(shootAt(rats));
                rat.freeze(); 
                rat.takeDamage(getStrength());
            }
            resetAttackTimer(); 
        }
        return projectileList;
    }

    @Override
    public Projectile shootAt(LinkedList<Rat> targets) {
        for (Rat target : targets) {
            Vector2 direction = new Vector2(target.getPosition().x - getPosition().x, target.getPosition().y - getPosition().y);
            return new Projectile(new Vector2(this.getPosition()), direction, 100,  new Texture("snowProjectile.png"));
        }
        return null;
    }

    @Override
    public void upgradeDamage() {
        upgradeCounter++;
       this.strength *= 1.25;

    }

    @Override
    public void upgradeRange() {
        upgradeCounter++;
        this.range *= 1.25;
        this.cirleUppdater();
    }

    @Override
    public void upgradeFireRate() {
        upgradeCounter++;
        this.fireRate *= 0.75;
    }
}

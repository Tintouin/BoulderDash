/*
 *
 */
package mobile;

import java.awt.Image;
import java.util.Observer;

import entity.AnimateGif;
import entity.Permeability;

public class Character extends MobileEntity {

    private static char SPRITE = 'H';

    private static String FOLDER = "sprites\\Mobile\\Character\\Stand";

    private static Permeability PERMEABILITY = Permeability.BLOCKING;

    private AnimateGif animateGif;

    public Character() {
        super(SPRITE, FOLDER, PERMEABILITY);
        this.setImage(FOLDER);
    }

    @Override
    public Image getImage() {
        return this.animateGif.getImage();
    }

    @Override
    public void setImage(String folder) {
        this.animateGif = new AnimateGif(folder, 200);
    }

    @Override
    public void setHasMoved() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isVerified() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setVerified(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setObserver(Observer observer) {
        this.animateGif.addObserver(observer);
    }

}
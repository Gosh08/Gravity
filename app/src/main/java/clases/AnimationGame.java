package clases;

import android.graphics.Bitmap;

public class AnimationGame {

    double speedAnimation;
    int delayI;
    int countFrames;
    int frames;

    Bitmap sprite;
    Bitmap sprite1;
    Bitmap sprite2;
    Bitmap sprite3;
    Bitmap sprite4;

    public AnimationGame(double speedAnimation, Bitmap sprite1, Bitmap sprite2, Bitmap sprite3, Bitmap sprite4) {
        sprite = sprite1;
        this.sprite1 = sprite1;
        this.sprite2 = sprite2;
        this.sprite3 = sprite3;
        this.sprite4 = sprite4;
        this.speedAnimation=speedAnimation;
    }


    public void runAnimation(){
        delayI++;
        if (countFrames==0){
            sprite=sprite1;
        }
        if (countFrames==1){
            sprite=sprite2;
        }
        if (countFrames==2){
            sprite=sprite3;
        }
        if (countFrames==4){
            sprite=sprite4;
        }
        countFrames++;
        if(countFrames>frames){
            countFrames=0;
        }
    }
}

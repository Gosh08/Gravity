package objects;

import com.example.my_framework.ObjectFW;

import utilits.UtilRandomFW;

public class StarBC extends ObjectFW {

    public StarBC(int sceneWidth, int sceneHeight) {
        this.MaxScreenX=sceneWidth;
        this.MaxScreenY=sceneHeight;
        this.MinScreenX=0;
        this.MinScreenY=0;
        this.speed = 2;
        this.x= UtilRandomFW.getCasualNumber(MaxScreenX);
        this.y = UtilRandomFW.getCasualNumber(MaxScreenY);
    }

    public void update(){
        x-=speed;
        if (x<0){
            x = MaxScreenX;
            y = UtilRandomFW.getCasualNumber(MaxScreenY);
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

package generator;

import android.graphics.Color;

import com.example.my_framework.GraphicsFW;

import java.util.ArrayList;

import objects.StarBC;

public class GeneratorBackground {
    public ArrayList<StarBC> starBCArrayList=new ArrayList<StarBC>();

    public GeneratorBackground(int sceneWidth, int sceneHeight){
        int starsSpeak = 100;
        for (int i = 0; i < starsSpeak; i++) {
            StarBC star = new StarBC(sceneWidth,sceneHeight);
            starBCArrayList.add(star);
        }

    }

    public void update(){
        for (int i = 0; i < starBCArrayList.size(); i++) {
            starBCArrayList.get(i).update();
            
        }
    }

    public void drawing(GraphicsFW graphicsFW){
        for (int i = 0; i < starBCArrayList.size(); i++) {
            graphicsFW.drawPixel(starBCArrayList.get(i).getX(),starBCArrayList.get(i).getY(), Color.WHITE);
        }
    }
}

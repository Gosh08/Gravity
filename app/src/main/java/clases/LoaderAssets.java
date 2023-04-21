
package clases;

import com.example.my_framework.CoreFW;
import com.example.my_framework.GraphicsFW;

import java.util.ArrayList;

import utilits.UtilResources;

public class LoaderAssets {
    public LoaderAssets(CoreFW coreFW, GraphicsFW graphicsFW){
        loadTexture(graphicsFW);
        loadSpritePlayer(graphicsFW);

    }

    private void loadSpritePlayer(GraphicsFW graphicsFW) {
        UtilResources.spritePlayer=new ArrayList<>();
        UtilResources.spritePlayer.add(graphicsFW.newSprite(UtilResources.textureAtlas, 0,0,64, 64));
        UtilResources.spritePlayer.add(graphicsFW.newSprite(UtilResources.textureAtlas, 64,0,64, 64));
        UtilResources.spritePlayer.add(graphicsFW.newSprite(UtilResources.textureAtlas, 128,0,64, 64));
        UtilResources.spritePlayer.add(graphicsFW.newSprite(UtilResources.textureAtlas, 192,0,64, 64));
    }

    private void loadTexture(GraphicsFW graphicsFW){
        UtilResources.textureAtlas = graphicsFW.newTexture("img1.png");

    }
}

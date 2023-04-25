package scenes;


import android.graphics.Color;

import com.example.gravity.R;
import com.example.my_framework.CoreFW;
import com.example.my_framework.LogIn;
import com.example.my_framework.SceneFW;

public class MainMenuScene extends SceneFW {



    public MainMenuScene(CoreFW coreFW) {
        super(coreFW);
    }
    public MainMenuScene(LogIn logIn) {
        super(logIn);
    }

    @Override
    public void update() {
        if (coreFW.getTouchListenerFW().getTouchUp(20,200,200, 50)){
            coreFW.setScene(new GameScene(coreFW));
        }
        else if (coreFW.getTouchListenerFW().getTouchUp(20,250,200, 50)){
            logIn.setScene(new GameScene(logIn));
        }

    }

    @Override
    public void drawing() {
        graphicsFW.clearScene(Color.BLACK);
        graphicsFW.drawText(coreFW.getString(R.string.txt_MainMenu_nameGame), 100, 100, Color.BLUE, 60, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_MainMenu_NewGame), 20, 250, Color.BLUE, 40, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_MainMenu_LogIn), 20, 300, Color.BLUE, 40, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_MainMenu_Settings), 20, 350, Color.BLUE, 40, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_MainMenu_Results), 20, 400, Color.BLUE, 40, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_MainMenu_ExitGame), 20, 450, Color.BLUE, 40, null);

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}

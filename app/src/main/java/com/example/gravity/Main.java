package com.example.gravity;

import com.example.my_framework.CoreFW;
import com.example.my_framework.SceneFW;

import clases.LoaderAssets;
import scenes.MainMenuScene;

public class Main extends CoreFW {

    public SceneFW getStartScene(){
        LoaderAssets loaderAssets = new LoaderAssets(this,this.getGraphicsFW());
        return new MainMenuScene(this);
    }
}
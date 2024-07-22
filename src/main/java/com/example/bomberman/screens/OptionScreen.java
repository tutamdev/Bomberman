package com.example.bomberman.screens;

import com.example.bomberman.menu.OptionMenu;

public class OptionScreen implements Screen {
    private final OptionMenu optionMenu;
    private final boolean musicOn = true;
    private final boolean soundOn = true;

    public OptionScreen() {
        optionMenu = new OptionMenu();
    }

    @Override


    public void render() {
        optionMenu.render();
    }

    @Override
    public void update(float deltaTime) {
        optionMenu.update();
    }
}

package com.example.bomberman.screens;

import com.example.bomberman.menu.HelpMenu;

public class HelpScreen implements Screen {
    private HelpMenu helpMenu;

    public HelpScreen () {
        helpMenu = new HelpMenu();
    }

    @Override
    public void render() {
        helpMenu.render();
    }

    @Override
    public void update(float deltaTime) {
        helpMenu.update();
    }
}

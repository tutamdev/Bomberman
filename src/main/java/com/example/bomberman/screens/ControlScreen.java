package com.example.bomberman.screens;

import com.example.bomberman.menu.ControlMenu;

public class ControlScreen implements Screen {
    private ControlMenu controlMenu;

    public ControlScreen() {
        controlMenu = new ControlMenu();
    }

    @Override
    public void render() {
        controlMenu.render();
    }

    @Override
    public void update(float deltaTime) {
        controlMenu.update();
    }
}

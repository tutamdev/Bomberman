package com.example.bomberman.screens;


import com.example.bomberman.menu.ColorMenu;

public class ChangeColorScreen implements Screen{

    ColorMenu colorMenu;

    public ChangeColorScreen() {
        colorMenu = new ColorMenu();
    }

    @Override
    public void render() {
        colorMenu.render();
    }

    @Override
    public void update(float deltaTime) {
        colorMenu.update();
    }
}

package com.example.bomberman.screens;

import com.example.bomberman.general.AudioManager;
import com.example.bomberman.menu.HomeMenu;

public class HomeScreen implements Screen {
    private final HomeMenu homeMenu;

    public HomeScreen() {
        AudioManager.setMusic("title_screen.mp3");
        homeMenu = new HomeMenu();
    }

    @Override
    public void render() {
        homeMenu.render();
    }

    @Override
    public void update(float deltaTime) {
        homeMenu.update();
    }
}

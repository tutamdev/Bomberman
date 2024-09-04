package com.example.bomberman.screens;

import com.example.bomberman.menu.HelpMenu;
import com.example.bomberman.menu.RulesMenu;

public class RulesScreen implements Screen {
    private RulesMenu rulesMenu;

    public RulesScreen () {
        rulesMenu = new RulesMenu();
    }

    @Override
    public void render() {
        rulesMenu.render();
    }

    @Override
    public void update(float deltaTime) {
        rulesMenu.update();
    }
}

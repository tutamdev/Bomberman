package com.example.bomberman.object;

import com.example.bomberman.general.Sandbox;

public class Wall extends BaseObject {
    public Wall(int x, int y) {
        super(x, y);
    }

    public void render() {
        Sandbox.getGc().strokeRect(x, y, width, height);
    }
}

package com.example.bomberman.menu;

import com.example.bomberman.constants.GlobalConstant;
import com.example.bomberman.general.ImageManager;
import com.example.bomberman.general.Input;
import com.example.bomberman.general.Sandbox;
import com.example.bomberman.screens.ScreenManager;
import com.example.bomberman.screens.ScreenType;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RulesMenu {
    private Font font;
    private final Cursor cursor;

    public RulesMenu() {
        try {
            font =  Font.loadFont(new FileInputStream(new File("src/main/resources/com/g10/font/font.ttf")), 40);
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }
        this.cursor = new Cursor(ImageManager.getImage("asset/menu/Cursor_Pause.png"), 315, 565);
        cursor.setCount(1);
    }

    public void update() {
        if (Input.getInput().contains("ESCAPE")) {
            Input.getInput().remove("ESCAPE");
            ScreenManager.switchScreen(ScreenType.HELP_SCREEN);
        }
        cursor.update();
        if (Input.getInput().contains("ENTER")) {
            Input.getInput().remove("ENTER");
            if (cursor.getNumOfSelect() == 1) {
                ScreenManager.switchScreen(ScreenType.HELP_SCREEN);
            }
        }
    }

    public void render() {
        Sandbox.getGc().setFill(Color.BLACK);
        Sandbox.getGc().setGlobalAlpha(0.6);
        Sandbox.getGc().fillRect(0, 0, GlobalConstant.SCREEN_WIDTH, GlobalConstant.SCREEN_HEIGHT);
        Sandbox.getGc().setGlobalAlpha(1);
        Sandbox.getGc().setFont(font);
        Sandbox.getGc().setFill(Color.WHITE);
        Sandbox.getGc().fillText("HOW TO PLAY", 288, 100);
        Sandbox.getGc().fillText("The player wins by defeating all", 50, 170);
        Sandbox.getGc().fillText("enemies and finding the exit portal. ", 50, 220);

        Sandbox.getGc().fillText("The player loses if they are hit by ", 50, 320);
        Sandbox.getGc().fillText("a bomb (either their own or an", 50, 320 + 50);
        Sandbox.getGc().fillText("enemy’s) are defeated by an enemy,", 50, 320 + 2*50);
        Sandbox.getGc().fillText("or fail to complete the objective", 50, 320 + 3*50);
        Sandbox.getGc().fillText("within the given time limit.", 50, 320 + 4*50);

        Sandbox.getGc().fillText("QUIT", 360, 600);
        cursor.render();
    }
}

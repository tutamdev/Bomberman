package com.example.bomberman.menu;

import com.example.bomberman.constants.GlobalConstant;
import com.example.bomberman.game.GameStatus;
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

public class HelpMenu {
    private  Font font;
    private final Cursor cursor;

//    public HelpMenu() {
//        try {
//            font =  Font.loadFont(new FileInputStream(new File("src/main/resources/com/g10/font/font.ttf")), 40);
//        } catch (FileNotFoundException e) {
//            System.out.println("not found");
//        }
//        this.cursor = new Cursor(ImageManager.getImage("asset/menu/Cursor_Pause.png"), 315, 565);
//        cursor.setCount(1);
//    }
//
//    public void update() {
//        if (Input.getInput().contains("ESCAPE")) {
//            Input.getInput().remove("ESCAPE");
//            ScreenManager.switchScreen(ScreenType.HOME_SCREEN);
//        }
//        cursor.update();
//        if (Input.getInput().contains("ENTER")) {
//            Input.getInput().remove("ENTER");
//            if (cursor.getNumOfSelect() == 1) {
//                ScreenManager.switchScreen(ScreenType.HOME_SCREEN);
//            }
//        }
//    }
//
//    public void render() {
//        Sandbox.getGc().setFill(Color.BLACK);
//        Sandbox.getGc().setGlobalAlpha(0.6);
//        Sandbox.getGc().fillRect(0, 0, GlobalConstant.SCREEN_WIDTH, GlobalConstant.SCREEN_HEIGHT);
//        Sandbox.getGc().setGlobalAlpha(1);
//        Sandbox.getGc().setFont(font);
//        Sandbox.getGc().setFill(Color.WHITE);
//        Sandbox.getGc().fillText("CONTROL", 340, 100);
//        Sandbox.getGc().fillText("Arrow keys: Move the Bomberman", 80, 170);
//        Sandbox.getGc().fillText("SPACE : Place a BOMB ", 80, 220);
//
//        Sandbox.getGc().fillText("MENU", 360, 350);
//        Sandbox.getGc().fillText("Arrow keys: Navigate the menu", 80, 420);
//        Sandbox.getGc().fillText("ENTER: Select an option", 80, 470);
//        Sandbox.getGc().fillText("ESC: Exit the game and the program", 80, 520);
//        Sandbox.getGc().fillText("QUIT", 360, 600);
//        cursor.render();
//
//    }

    public HelpMenu() {
        try {
            font =  Font.loadFont(new FileInputStream(new File("src/main/resources/com/g10/font/font.ttf")), 40);
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }
        cursor = new Cursor(ImageManager.getImage("asset/menu/Cursor_Pause.png"), 220, 250);
        cursor.setCount(2);
        cursor.setSpaceBetween(20);
    }

    public void update() {
        if (Input.getInput().contains("ESCAPE")) {
            Input.getInput().remove("ESCAPE");
            ScreenManager.switchScreen(ScreenType.HOME_SCREEN);
        }
        cursor.update();
        if (Input.getInput().contains("ENTER")) {
            Input.getInput().remove("ENTER");
            if (cursor.getNumOfSelect() == 1) {
                ScreenManager.switchScreen(ScreenType.CONTROL_SCREEN);
            }
            if (cursor.getNumOfSelect() == 2) {
                ScreenManager.switchScreen(ScreenType.RULES_SCREEN);
            }
        }
    }

    public void render() {
        Sandbox.getGc().setFill(Color.BLACK);
        Sandbox.getGc().setGlobalAlpha(0.6);
        Sandbox.getGc().fillRect(0, 0, GlobalConstant.SCREEN_WIDTH, GlobalConstant.SCREEN_HEIGHT);
        Sandbox.getGc().setGlobalAlpha(1);
        cursor.render();
        Sandbox.getGc().setFont(font);
        Sandbox.getGc().setFill(Color.WHITE);
        Sandbox.getGc().fillText("HELP MENU", 300, 150);
        Sandbox.getGc().fillText("GAME CONTROLS", cursor.getX() + 50, cursor.getY() + 35);
        Sandbox.getGc().fillText("GAME RULES", cursor.getX() + 50, cursor.getY() + 35 + cursor.getSpaceBetween() + GlobalConstant.TILE_SIZE);
    }
}

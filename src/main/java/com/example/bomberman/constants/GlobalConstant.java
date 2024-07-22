package com.example.bomberman.constants;

public interface GlobalConstant {
    // Kích thước ban đầu của một ô gạch
    int ORIGINAL_TILE_SIZE = 16;

    // Tỉ lệ phóng to/thu nhỏ
    float SCALE = 3;

    // Kích thước thực tế của một ô gạch sau khi phóng to
    int TILE_SIZE = (int) (ORIGINAL_TILE_SIZE * SCALE);

    // Số lượng cột tối đa trên màn hình
    int MAX_SCREEN_COL = 17;

    // Số lượng hàng tối đa trên màn hình
    int MAX_SCREEN_ROW = 13;

    // Số lượng hàng dành cho menu trên cùng
    int MENU_TOP_ROW = 2;

    // Chiều cao của menu trên cùng
    int MENU_TOP_HEIGHT = MENU_TOP_ROW * TILE_SIZE;

    // Chiều rộng của khu vực hiển thị trò chơi
    int GAME_VIEWER_WIDTH = TILE_SIZE * MAX_SCREEN_COL;

    // Chiều cao của khu vực hiển thị trò chơi
    int GAME_VIEWER_HEIGHT = TILE_SIZE * MAX_SCREEN_ROW;

    // Chiều rộng của màn hình trò chơi
    int SCREEN_WIDTH = GAME_VIEWER_WIDTH;

    // Chiều cao của màn hình trò chơi
    int SCREEN_HEIGHT = GAME_VIEWER_HEIGHT + MENU_TOP_ROW * TILE_SIZE;
}

package com.kakacut.androidgames.mrsnake;

import com.kakacut.androidgames.framework.Screen;
import com.kakacut.androidgames.framework.impl.AndroidGame;

public class MrSnakeGame extends AndroidGame {
    public Screen getStartScreen() {
        return new LoadingScreen(this); 
    }
} 

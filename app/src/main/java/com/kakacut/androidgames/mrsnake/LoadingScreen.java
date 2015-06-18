package com.kakacut.androidgames.mrsnake;

import com.kakacut.androidgames.framework.Game;
import com.kakacut.androidgames.framework.Graphics;
import com.kakacut.androidgames.framework.Screen;
import com.kakacut.androidgames.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
        Assets.logo = g.newPixmap("mylogo.png", PixmapFormat.ARGB4444);
        Assets.mainMenu = g.newPixmap("mymainmenu.png", PixmapFormat.ARGB4444);
        Assets.buttons = g.newPixmap("mybuttons.png", PixmapFormat.ARGB4444);
        Assets.help1 = g.newPixmap("myhelp1.png", PixmapFormat.ARGB4444);
        Assets.help2 = g.newPixmap("myhelp2.png", PixmapFormat.ARGB4444);
        Assets.help3 = g.newPixmap("myhelp3.png", PixmapFormat.ARGB4444);
        Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
        Assets.ready = g.newPixmap("myready.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("mypausemenu.png", PixmapFormat.ARGB4444);
        Assets.gameOver = g.newPixmap("mygameover.png", PixmapFormat.ARGB4444);
        Assets.headUp = g.newPixmap("myheadup.png", PixmapFormat.ARGB4444);
        Assets.headLeft = g.newPixmap("myheadleft.png", PixmapFormat.ARGB4444);
        Assets.headDown = g.newPixmap("myheaddown.png", PixmapFormat.ARGB4444);
        Assets.headRight = g.newPixmap("myheadright.png", PixmapFormat.ARGB4444);
        Assets.tail = g.newPixmap("mytail.png", PixmapFormat.ARGB4444);
        Assets.stain1 = g.newPixmap("mystain1.png", PixmapFormat.ARGB4444);
        Assets.stain2 = g.newPixmap("mystain2.png", PixmapFormat.ARGB4444);
        Assets.stain3 = g.newPixmap("mystain3.png", PixmapFormat.ARGB4444);
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        Settings.load(game.getFileIO());

        game.setScreen(new MainMenuScreen(game));
    }
    
    public void present(float deltaTime) {

    }

    public void pause() {

    }

    public void resume() {

    }

    public void dispose() {

    }
}

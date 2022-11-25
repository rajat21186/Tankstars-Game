package com.badlogic.tankstars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class screen2 implements Screen {
    Tankstars game;
    Texture a1;
    public screen2(Tankstars game){
        this.game= game;
        a1 = new Texture("Choose Tank.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        game.batch.draw(a1, 0, 0);

        if(Gdx.input.getX() < 550 && Gdx.input.getX() > 66&& Gdx.input.getY() <650  && Gdx.input.getY() > 480) {
            if (Gdx.input.isTouched()) {
                game.setScreen(new screen3(game));
            }
        }
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

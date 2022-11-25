package com.badlogic.tankstars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class screen5 implements Screen {
    Tankstars game;
    Texture a1;
    public screen5(Tankstars game){
        this.game= game;
        a1 = new Texture("Battle Field 1.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        game.batch.draw(a1, 0, 0);
        System.out.println(Gdx.input.getX() + " "+ Gdx.input.getY());
        if(Gdx.input.getX() < 850 && Gdx.input.getX() > 500&& Gdx.input.getY() <346  && Gdx.input.getY() > 250) {
            if (Gdx.input.isTouched()) {
                game.setScreen(new screen3(game));
            }

        }
        if(Gdx.input.getX() < 850 && Gdx.input.getX() > 500&& Gdx.input.getY() <459  && Gdx.input.getY() > 367) {
            if(Gdx.input.isTouched()) {
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


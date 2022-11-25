package com.badlogic.tankstars;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class screen3 implements Screen {
    Tankstars game;
    Texture a1;
    public screen3(Tankstars game){
        this.game= game;
        a1 = new Texture("Battle Field.png");
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        game.batch.draw(a1, 0, 0);

        if(Gdx.input.getX() < 140 && Gdx.input.getX() > 30&& Gdx.input.getY() <118  && Gdx.input.getY() > 27) {
            if (Gdx.input.isTouched()) {
                game.setScreen(new screen4(game));
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

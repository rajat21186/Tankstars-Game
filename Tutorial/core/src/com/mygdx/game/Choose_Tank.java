package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class Choose_Tank implements Screen {
    private MyGdxGame game;
    Texture texture;
    public Choose_Tank(MyGdxGame Game) {
        this.game = Game;
        texture = new Texture("Choose Tank.png");

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        game.batch.draw(texture,0,0);
        System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());
        if(Gdx.input.getX() < 542 && Gdx.input.getX() > 64 && Gdx.input.getY() < 643 && Gdx.input.getY() > 477) {
            if(Gdx.input.isTouched()) {

                this.game.setScreen(new Battle_Field(game));
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

package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import org.w3c.dom.Text;

public class Battle_Field_Pause_Screen implements Screen {
    MyGdxGame game;
    Texture texture;
    public Battle_Field_Pause_Screen(MyGdxGame game) {
        this.game = game;
        texture = new Texture("Battle_Fields_1.png");


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        game.batch.draw(texture,0,0);
        System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());
        if(Gdx.input.getX() < 783 && Gdx.input.getX() > 482 && Gdx.input.getY() < 333 && Gdx.input.getY() > 264) {
            if(Gdx.input.isTouched()) {

                this.game.setScreen(new Battle_Field(game));
            }
        }
        if(Gdx.input.getX() < 783 && Gdx.input.getX() > 482 && Gdx.input.getY() < 430 && Gdx.input.getY() > 359) {
            if(Gdx.input.isTouched()) {

                this.game.setScreen(new PlayScreen(game));
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

package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class PlayScreen implements Screen {
    private MyGdxGame game;
    Texture texture;
    public PlayScreen(MyGdxGame myGdxGame) {
        this.game = myGdxGame;
        texture = new Texture("Main Menu.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        //Gdx.gl.glClearColor(1,0,0,1);
        game.batch.begin();
        game.batch.draw(texture,0,0);
        System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());
        if(Gdx.input.getX() < 380 && Gdx.input.getX() > 0 && Gdx.input.getY() < 680 && Gdx.input.getY() > 580) {
            if(Gdx.input.isTouched()) {
                this.game.setScreen(new Choose_Tank(game));
            }
        }
        if(Gdx.input.getX() < 380 && Gdx.input.getX() > 0 && Gdx.input.getY() < 560 && Gdx.input.getY() > 428) {
            if(Gdx.input.isTouched()) {
                this.game.setScreen(new Battle_Field_Pause_Screen(game));
            }
        }


        if(Gdx.input.getX() < 1237 && Gdx.input.getX() > 981 && Gdx.input.getY() < 675 && Gdx.input.getY() > 585) {
            if(Gdx.input.isTouched()) {
                Gdx.app.exit();
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

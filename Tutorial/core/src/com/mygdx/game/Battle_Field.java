package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Battle_Field implements Screen {
    private MyGdxGame game;
    Texture texture;
    //Stage stage;
    Texture texture1;
    Texture texture2;



    private int SPEED = 20;
    float x1 = 5;
    float y1= 75;
    float x2 = 1062;
    float y2 = 75;

//    private TiledMap map;
//    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
//
//    private TmxMapLoader maploader;
    private Hud hud;
    boolean Pointer = false;



    public Battle_Field(MyGdxGame game) {
        this.game = game;
//        gamecam = new OrthographicCamera();
//        gamePort = new StretchViewport(1280,720,gamecam);

        texture = new Texture("Battle_Fields.png");
        texture1 = new Texture("Frost.png");

        texture2 = new Texture("Atomic.png");

        hud = new Hud(game.batch);















    }

    @Override
    public void show() {


    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        renderer.setView(gamecam);
//        renderer.render();
        game.batch.begin();

        game.batch.draw(texture,0,0);
        System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());
        game.batch.draw(texture1,x1,y1,200,150);
        game.batch.draw(texture2,x2,y2,200,150);
        if(Pointer == false) {
            if(Gdx.input.isKeyJustPressed(Input.Keys.LEFT)&& hud.getFuelplayer1() != 0){
                x1 = x1 - SPEED;
                hud.setFuelplayer1(2);
                Pointer = true;


            }
            if(Gdx.input.isKeyJustPressed(Input.Keys.RIGHT) && hud.getFuelplayer1() != 0){
                x1 = x1 + SPEED;
                hud.setFuelplayer1(2);
                Pointer = true;


            }
        }
        else {


            if (Gdx.input.isKeyJustPressed(Input.Keys.UP) && hud.getFuelplayer2() != 0) {
                x2 = x2 - SPEED;
                hud.setFuelplayer2(2);
                Pointer = false;
            }
            if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN) && hud.getFuelplayer2() != 0) {
                x2 = x2 + SPEED;
                hud.setFuelplayer2(2);
                Pointer = false;
            }

        }
        if(Gdx.input.getX() > 22 && Gdx.input.getX() < 119 && Gdx.input.getY() < 92 && Gdx.input.getY() > 24) {
            if(Gdx.input.isTouched()) {
                this.game.setScreen(new Battle_Field_Pause_Screen(game));
            }
        }





        game.batch.end();
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();



    }

    @Override
    public void resize(int width, int height) {
//        gamecam.viewportWidth = width;
//        gamecam.viewportHeight = height;
//        gamecam.update();

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        dispose();

    }

    @Override
    public void dispose() {
        //map.dispose();

    }
}

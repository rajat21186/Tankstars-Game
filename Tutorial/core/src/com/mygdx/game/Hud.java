package com.mygdx.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import com.badlogic.gdx.utils.viewport.Viewport;

import com.badlogic.gdx.graphics.Color;



import java.awt.*;

public class Hud implements Disposable {
    Stage stage;
    private Viewport viewport;
    private Integer Healthplayer1 = 10;
    private Integer Healthplayer2 = 10;
    private Integer Fuelplayer1 = 10;
    private Integer Fuelplayer2 = 10;

    Label labelHealthplayer1;
    Label labelHealthplayer2;
    Label labelfuelplayer1;
    Label labelfuelplayer2;

    public Hud(SpriteBatch sb) {

        viewport = new FitViewport(MyGdxGame.WIDTH,MyGdxGame.HEIGHT,new OrthographicCamera());
        stage = new Stage(viewport,sb);
        Table table = new Table();
        table.top();
        table.setFillParent(true);
        labelHealthplayer1=new Label(String.format("Health P1\n%02d",Healthplayer1),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        labelHealthplayer2=new Label(String.format("Health P2\n%02d",Healthplayer2),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        labelfuelplayer1 = new Label(String.format("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nFuel Player 1 \n%02d",Fuelplayer1),new Label.LabelStyle((new Label.LabelStyle(new BitmapFont(),Color.WHITE))));
        labelfuelplayer2 = new Label(String.format("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nFuel Player 2 \n%02d",Fuelplayer2),new Label.LabelStyle((new Label.LabelStyle(new BitmapFont(),Color.WHITE))));

        table.row();
        table.add(labelHealthplayer1).expandX();
        table.add(labelHealthplayer2).expandX();
        table.row();
        table.add(labelfuelplayer1).expand();
        table.add(labelfuelplayer2).expand();

        stage.addActor(table);





    }

    @Override
    public void dispose() {

    }
    public Integer getFuelplayer1() {
        return Fuelplayer1;
    }
    public Integer getFuelplayer2() {
        return Fuelplayer2;
    }
    public void setFuelplayer1(int a) {
        this.Fuelplayer1 -= a;
    }
    public void setFuelplayer2(int a) {
        this.Fuelplayer2 -= a;
    }
    public void FuelPlayer1Reset() {
        this.Fuelplayer1 = 10;
    }
    public void FuelPlayer2Reset() {
        this.Fuelplayer2 = 10;
    }
}

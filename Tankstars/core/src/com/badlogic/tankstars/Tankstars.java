package com.badlogic.tankstars;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
public class Tankstars extends Game {
	Tankstars game;
	public static final float WIDTH = 1280;
	public static final float HEIGHT = 720;
	SpriteBatch batch;
	Texture img;
	@Override
	public void create () {
		batch = new SpriteBatch();
		this.setScreen(new screen1(this));
	}
	@Override
	public void render () {
		super.render();
	}
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

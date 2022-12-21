package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.*;

public class MyGdxGame extends Game {
	//public static final float speed = 120;

	public SpriteBatch batch;

	Texture img;

	MyGdxGame game;
	public static final float WIDTH = 1280;
	public static final float HEIGHT = 720;
	public int Fuel = 50;

	
	@Override
	public void create () {
		//this.create();
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
		//img = new Texture("badlogic.jpg");

	}

	@Override
	public void render () {
		//this.render();


		super.render();


	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

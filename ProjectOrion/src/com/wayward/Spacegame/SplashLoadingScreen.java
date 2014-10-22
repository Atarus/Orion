package com.wayward.Spacegame;

import com.wayward.framework.Game;
import com.wayward.framework.Graphics;
import com.wayward.framework.Screen;
import com.wayward.framework.Graphics.ImageFormat;

public class SplashLoadingScreen extends Screen {
	public SplashLoadingScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		int x = 500;
		Assets.Splash= g.newImage("OrionSplash.png", ImageFormat.RGB565);
		
		
		game.setScreen(new LoadingScreen(game));

	}
	public void getloadingscreen(){
		
	}
	
	@Override
	public void paint(float deltaTime) {
		
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void backButton() {

	}
}
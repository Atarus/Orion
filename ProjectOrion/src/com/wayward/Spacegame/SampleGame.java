package com.wayward.Spacegame;

import android.util.Log;

import com.wayward.framework.Screen;
import com.wayward.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {

	boolean firstTimeCreate = true;

	@Override
	public Screen getInitScreen() {

		if (firstTimeCreate) {
			Assets.load(this);
			firstTimeCreate = false;
		}

		return new SplashLoadingScreen(this);

	}

	@Override
	public void onBackPressed() {
		getCurrentScreen().backButton();
	}

	@Override
	public void onResume() {
		super.onResume();


	}

	@Override
	public void onPause() {
		super.onPause();

	}
	
	
}
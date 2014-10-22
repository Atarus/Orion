package com.wayward.Spacegame;

import com.wayward.framework.Graphics;
import com.wayward.framework.Image;

public class PlayerShip extends Ship {
	
	public PlayerShip(Image shimage, int h, int s){
		
		sprite = shimage;
		health = h;
		sheild = s;
	}
	
	public void movetopos(int xto, int yto){
		if (xto - x > 10){
		 x += 10;	
		}
		else if ((xto - x < 10) & (xto - x > -10)){
			x = xto;
		}
		else {
			x -= 10;
		}
		if (yto - y > 10){
			 y += 10;	
			}
			else if ((yto - y < 10) & (yto - y > -10)){
				y = yto;
			}
			else {
				y -= 10;
			}
		
	}
	public void drawship(Graphics g){
		g.drawScaledImage(sprite,x,y,(sprite.getHeight()*g.getHeight())/120,(sprite.getWidth()*g.getHeight())/120,1,1,1,1);
	}
	public void update(int xtouched,int ytouched, Graphics g){
		movetopos(xtouched,ytouched);
		drawship(g);
	}
}

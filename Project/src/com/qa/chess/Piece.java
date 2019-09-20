package com.qa.chess;

public class Piece {
	private boolean onBoard;
	private int x;
	private int y;
	private String colour;
	
	public Piece(String colour, boolean onBoard, int x, int y) {
		this.onBoard = onBoard;
		this.x = x;
		this.y = y;
		this.setColour(colour);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		if (x>=0 && x<=7) {
			this.x = x;
		}
	}
	
	public void setY(int y) {
		if (y>=0 && y<=7) {
			this.y = y;
		}
	}
	
	public boolean getOnBoard() {
		return onBoard;
	}
	
	public void move(int initX, int initY, int finalX, int finalY) {
		this.x = finalX;
		this.y = finalY;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
	


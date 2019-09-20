package com.qa.chess;

public class Tile {
	int x;
	int y;
	Piece piece = null;
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
		piece = null;
	}
}

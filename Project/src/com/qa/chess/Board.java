package com.qa.chess;

public class Board {

	private Tile[][] board = new Tile[8][8];
	
	public Board() {
		for (int i = 0; i<board.length; i++) {
			for (int j = 0; j<board.length; j++) {
				this.board[i][j] = new Tile(i, j);
			}
		}
	}
	
	public Tile getTile(int i, int j) {
		return board[i][j];
	}
	
}

package com.saxion.shoque.playground.model;

public class SeashoqueBoard extends GameBoard  {
	private static final int DIM = 10;
	
	/**
	 * Instantiate 10X10 gameboard
	 */
	public SeashoqueBoard() {
		super(DIM, DIM);
	}
	
	@Override
	public void onEmptyTileClicked(int x, int y) {
		((SeashoqueGame) getGame()).shoot(this, x, y);
		//TODO: schiet als degene aan de beurt was
	}
	
	public int getDim(){
		return DIM;
	}
	


	public boolean isEmpty(int x, int y) {
		boolean result = true;
		if (getObject(x, y)!=null){
			result = false;
		}
		return result;
	}
}

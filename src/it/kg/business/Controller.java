package it.kg.business;

import java.util.LinkedList;
import java.util.List;

public class Controller {
	
	private boolean[][] chessboard;
	private List<String> coordinates;
	
	public Controller() {
		this.chessboard = new boolean[8][8];
		this.inizialize(this.chessboard);
		this.coordinates = new LinkedList<>();
	}
	
	@SuppressWarnings("unused")
	private void inizialize(boolean[][] matrix) {
		for (boolean[] arr: matrix) {
			for(boolean b: arr) {
				b = false;
			}
		}
	}
	
	public boolean move(String coordinate) {
		try {
			String lastCoordinate = this.coordinates.get(this.coordinates.size()-1);
			if(!this.validate(lastCoordinate, coordinate)) {
				return false;
			}
			int column = this.extract(coordinate.charAt(0));
			int row = Integer.parseInt(coordinate.substring(1,2));
			if(!this.chessboard[row][column]) {
				this.chessboard[row][column] = true;
				this.coordinates.add(coordinate);
				return true;
			}
			return false;
		}
		catch (Exception e) {
			this.coordinates.add(coordinate);
			return true;
		}
	}
	
	private boolean validate(String last, String current) {
		int columnLast = this.extract(last.charAt(0));
		int rowLast = Integer.parseInt(last.substring(1,2));
		int columnCurrent = this.extract(current.charAt(0));
		int rowCurrent = Integer.parseInt(current.substring(1,2));
		int[] movesRow = {2, 1, -1, -2, -2, -1, 1, 2};
		int[] movesColumn = {1, 2, 2, 1, -1, -2, -2, -1};
		for(int i=0; i<8; i++) {
			if((rowLast+movesRow[i]==rowCurrent) && (columnLast+movesColumn[i]==columnCurrent)) {
				return true;
			}
		}
		return false;
	}
	
	private int extract(char c) {
		char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		for (int i=1; i<chars.length+1; i++) {
			if(c==chars[i-1]) {
				return i;
			}
		}
		return -1;
	}

	public boolean[][] getChessboard() {
		return chessboard;
	}

	public void setChessboard(boolean[][] chessboard) {
		this.chessboard = chessboard;
	}

	public List<String> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<String> coordinates) {
		this.coordinates = coordinates;
	}

}

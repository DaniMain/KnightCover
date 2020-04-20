package it.kg.business;

import java.util.LinkedList;
import java.util.List;

public class Controller {

	private List<String> coordinates;
	private String status;

	public static final String STATUS_OK = "OK";
	public static final String STATUS_LAST_MOVE = "LAST_MOVE";
	public static final String STATUS_INVALID_MOVE = "INVALID_MOVE";
	public static final String STATUS_END = "END";

	public Controller() {
		this.coordinates = new LinkedList<>();
	}
	
	public boolean isEnded() {
		if(this.getCoordinates().size()==64) {
			return true;
		}
		return false;
	}

	public boolean move(String coordinate) {
		if(this.getCoordinates().size()==0) {
			this.getCoordinates().add(coordinate);
			this.setStatus(STATUS_OK);
			return true;
		}
		String lastCoordinate = this.getCoordinates().get(this.coordinates.size()-1);
		if(this.getCoordinates().contains(coordinate)) {
			if(this.getCoordinates().get(this.coordinates.size()-1) == coordinate) {
				this.setStatus(STATUS_LAST_MOVE);
			}
			else {
				this.setStatus(STATUS_INVALID_MOVE);
			}
			return false;
		}
		if(this.validate(lastCoordinate, coordinate)) {
			this.getCoordinates().add(coordinate);
			if(this.isEnded()) {
				this.setStatus(STATUS_END);
			}
			else{
				this.setStatus(STATUS_OK);
			}
			return true;
		}
		this.setStatus(STATUS_INVALID_MOVE);
		return false;
	}

	private boolean validate(String last, String current) {
		int columnLast = this.extract(last.charAt(0));
		int rowLast = Integer.parseInt(last.substring(1, 2));
		int columnCurrent = this.extract(current.charAt(0));
		int rowCurrent = Integer.parseInt(current.substring(1, 2));
		int[] movesRow = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int[] movesColumn = { 1, 2, 2, 1, -1, -2, -2, -1 };
		for (int i = 0; i < 8; i++) {
			if ((rowLast + movesRow[i] == rowCurrent) && (columnLast + movesColumn[i] == columnCurrent)) {
				return true;
			}
		}
		return false;
	}

	private int extract(char c) {
		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		for (int i = 1; i < chars.length + 1; i++) {
			if (c == chars[i - 1]) {
				return i;
			}
		}
		return -1;
	}

	public List<String> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<String> coordinates) {
		this.coordinates = coordinates;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

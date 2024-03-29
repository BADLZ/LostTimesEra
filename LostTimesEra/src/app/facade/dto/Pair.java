package app.facade.dto;

public class Pair<U,T> {

	private U first;
	private T second;
	
	public Pair(U first, T second) {
		this.first = first;
		this.second = second;
	}

	public U getFirst() {
		return first;
	}

	public void setFirst(U first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	

}

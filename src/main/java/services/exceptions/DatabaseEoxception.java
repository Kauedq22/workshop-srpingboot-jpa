package services.exceptions;

public class DatabaseEoxception extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DatabaseEoxception(String msg) {
		super(msg);
	}

}

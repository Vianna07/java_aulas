package ulid;

public class Main {
	public static void main(String[] args) {
		ULID ulid = new ULID();
		ulid.showTimestamp();
		System.out.println(ULID.ENCODING_LENGTH);
	}
}

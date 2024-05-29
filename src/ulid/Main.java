package ulid;

public class Main {
	public static void main(String[] args) {
		ULID ulid = new ULID();
		System.out.println(ulid.nextULID());
		System.out.println(ulid.decodeTimestamp(ulid.nextULID()));
	}
}

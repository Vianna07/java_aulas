package ulid;

public class Main {	
	public static final ULID ulid = new ULID();

	public static void main(String[] args) {
		String[] ulids = new String[5];
		for (int i : new int[] {0, 1, 2, 3, 4}) {
			ulids[i] = Main.ulid.nextULID();
			System.out.println(i + 1 + " - " + ulids[i]);
		}
		
		System.out.println("");
		
		for (int i : new int[] {0, 1, 2, 3, 4}) {
			System.out.println(i + 1 + " - " + Main.ulid.decodeTimestamp(ulids[i]));
		}
	}
}

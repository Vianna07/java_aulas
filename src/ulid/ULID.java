package ulid;

public class ULID {
	public static final char[] ENCODING = "0123456789ABCDEFGHJKMNPQRSTVWXYZ".toCharArray();
	public static final int ENCODING_LENGTH = ENCODING.length;
	
	public long timestamp;
	
	public ULID(long ...timestamp) {
        this.timestamp = (timestamp != null && timestamp.length > 0) ? timestamp[0] : System.currentTimeMillis();
	}
	
	public void showTimestamp() {
		System.out.println(this.timestamp);
	}
	
    public static int[] divMod(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }
}

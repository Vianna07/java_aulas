package ulid;

import java.util.Random;

public class ULID {
	private static final char[] ENCODING = "0123456789ABCDEFGHJKMNPQRSTVWXYZ".toCharArray();
	private static final int ENCODING_LENGTH = ENCODING.length;
	private static final int TIMESTAMP_LENGTH = 10;
	private static final int RANDOM_PART_LENGTH = 16;
	private final Random random = new Random();
	
	private long timestamp;
	private long randomPart;
	
	public ULID(long ...timestamp) {
        this.timestamp = (timestamp != null && timestamp.length > 0) ? timestamp[0] : System.currentTimeMillis();
        this.randomPart = Math.abs(random.nextLong());
	}
    
    private String encode(long value, int limit) {
    	String encoding = "";
    	long remainder = 0;
    	
    	while (encoding.length() < limit) {
    		remainder = value % ULID.ENCODING_LENGTH;
    		value = value / ULID.ENCODING_LENGTH;
    		encoding = String.valueOf(ULID.ENCODING[(int) remainder]) + encoding;
       	}
    	
    	return encoding;
    }
    
    private String encodeTimestamp() {
    	return this.encode(this.timestamp, ULID.TIMESTAMP_LENGTH);
    }
    
    private String encodeRandomPart() {
    	return this.encode(randomPart, ULID.RANDOM_PART_LENGTH);
    }
    
    public String nextULID() {
    	return this.encodeTimestamp() + this.encodeRandomPart();
    }
    
    private String decode(String code) {
    	String decoding = "";
    	
    	for (char character : code.toCharArray()) {
//        	System.out.println(character + " - " + ULID.ENCODING.toString().indexOf(character) + " - " + ULID.ENCODING.toString() + " - " + ULID.ENCODING);
    		decoding = ULID.ENCODING.toString().indexOf(character) + decoding; 
    	}
    	
    	System.out.println(decoding);
    	return decoding;
    }
    
    public String decodeTimestamp(String ulid) {
    	return decode(ulid.substring(0, ULID.TIMESTAMP_LENGTH));
    }
}

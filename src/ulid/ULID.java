package ulid;

import java.util.Random;

public class ULID {
	private static final char[] ENCODING = "0123456789ABCDEFGHJKMNPQRSTVWXYZ".toCharArray();
	private static final int ENCODING_LENGTH = ENCODING.length;
	private static final int TIMESTAMP_LENGTH = 10;
	private static final int RANDOM_PART_LENGTH = 16;
	private final Random random = new Random();
		
//	public ULID() {}
    
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
    
    private String encodeTimestamp(long timestamp) {
    	return this.encode(timestamp, ULID.TIMESTAMP_LENGTH);
    }
    
    private String encodeRandomPart() {
    	return this.encode(Math.abs(random.nextLong()), ULID.RANDOM_PART_LENGTH);
    }
    
    public String nextULID() {
    	return this.encodeTimestamp(System.currentTimeMillis()) + this.encodeRandomPart();
    }
    
    public String nextULID(long timestamp) {
    	return this.encodeTimestamp(timestamp) + this.encodeRandomPart();
    }
    
    private long decode(String code) {
    	String _ENCODING = new String(ULID.ENCODING);
    	long decoding = 0;
 
    	for (int i = 0; i < code.length() ; i++) {
        	decoding += (int) _ENCODING.indexOf(code.charAt(i)) * Math.pow(ULID.ENCODING_LENGTH, code.length() - 1 - i);
    	}
    	
    	return decoding;
    }
    
    public long decodeTimestamp(String ulid) {
    	return this.decode(ulid.substring(0, ULID.TIMESTAMP_LENGTH));
    }
}

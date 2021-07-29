package headfirst.decorator.io.extended;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* 
ShiftInputStream shifts character by given offset.
Example :
 - input String : Software Engineering
 -       offset : 1
 -       result : Tpguxbsf Fohjoffsjoh
 
*/

class ShiftInputStream extends FilterInputStream {
	private static final int A = 65, Z = 90, a = 97, z = 122;
	private int offset = 0;
	
	public ShiftInputStream(InputStream inputStream, int offset) {
		super(inputStream);
		this.offset = offset;
	}
	
	@Override
	public int read() throws IOException {
		return shift(super.read());
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		for (int i = 0 ; i < len ; i++ ) b[i] = (byte) shift(b[i]);
		return len;
	}
	
	private int shift(int c) {
        if (A <= c && c <= Z) { // uppercase
            c += offset;// add offset
            if (c < A) c += 26; // check overflow
            else if (c > Z) c -= 26;
        } else if (a <= c && c <= z) { // lowercase
            c += offset;
            if (c < a) c += 26;
            else if (c > z) c -= 26;
        }
        return c;
    }
}
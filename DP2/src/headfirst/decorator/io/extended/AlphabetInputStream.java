package headfirst.decorator.io.extended;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AlphabetInputStream extends FilterInputStream {
	private static final int A = 65, Z = 90, a = 97, z = 122;
	public AlphabetInputStream(InputStream inputStream) {
		super(inputStream);
	}
	
	@Override
	public int read() throws IOException {
		int c = super.read();
		if (c == 10 || c == 13) return c; // CR = 13, LF = 10 
		return isAlphabet(c) ? c : '\0' ; // if c is alphabet, return c
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		for ( int i = 0 ; i < len ; i ++ ) {
			if (b[i] == 10 || b[i] == 13) continue; 
			b[i] = (byte) (isAlphabet(b[i]) ? b[i] : '\0') ;
		}
		return len;
	}
	
	private boolean isAlphabet(int c) {
		return ( (A <= c && c <= Z) || (a <= c && c <= z) ? true : false );
	}
}
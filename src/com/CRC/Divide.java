package com.CRC;

public class Divide {

	public String divide(String dividend,int dwLength) {
		String divisor = "10001000000100001";
		char x;
		String remainder = "";
		int i, j;
		
		for (i = 0; i < dwLength; i++) {
			x = dividend.charAt(i);
			for (j = 0; j < divisor.length(); j++) {
				if (x == '1') {
					if (dividend.charAt(i + j) != divisor.charAt(j)) {
						remainder = remainder.substring(0, i + j) + "1";
						dividend = remainder + dividend.substring(i + j + 1);
					} else {
						remainder = remainder.substring(0, i + j) + "0";
						dividend = remainder + dividend.substring(i + j + 1);
					}

				}
			}
		}
		
		// copy remaining chars from the dividend as it is
		int remainingBits = dividend.length() - remainder.length();
		remainder +=  dividend.substring(remainder.length(), remainder.length()+remainingBits);

		return remainder;
	}
}

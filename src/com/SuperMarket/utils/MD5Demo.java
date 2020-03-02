package com.SuperMarket.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.w3c.dom.ranges.RangeException;

/**
* MD5�����㷨
* @author JamsF
* @version ����ʱ�䣺2020��3��2�� ����1:06:04
*/
public class MD5Demo {
	public static String md5(String pass) {
		byte[] secretBytes = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(pass.getBytes());
			secretBytes = md.digest();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			throw new RangeException((short) 0, "û��md5�㷨");
		}
		String md5code = new BigInteger(1,secretBytes).toString(16);
		for(int i = 0;i < 32 - md5code.length();i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}
}

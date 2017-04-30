package idv.caemasar.documentCenter.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Encrypter
{

	private Cipher ecipher;
	private Cipher dcipher;

	// md5编码
	public static String md5Encrypt(String s) throws Exception
	{

		MessageDigest md5 = MessageDigest.getInstance("MD5");

		sun.misc.BASE64Encoder base64Encoder = new sun.misc.BASE64Encoder();

		return base64Encoder.encode(md5.digest(s.getBytes("utf-8")));

	}

	public Encrypter()
	{
		try
		{
			SecretKey key = KeyGenerator.getInstance("DES").generateKey();
			ecipher = Cipher.getInstance("DES");
			dcipher = Cipher.getInstance("DES");
			ecipher.init(Cipher.ENCRYPT_MODE, key);
			dcipher.init(Cipher.DECRYPT_MODE, key);

		}
		catch (javax.crypto.NoSuchPaddingException e)
		{
		}
		catch (java.security.NoSuchAlgorithmException e)
		{
		}
		catch (java.security.InvalidKeyException e)
		{
		}
	}

	// DES编码
	public String desEncrypt(String s)
	{
		try
		{
			byte[] utf8 = s.getBytes("UTF8");

			byte[] enc = ecipher.doFinal(utf8);

			return new sun.misc.BASE64Encoder().encode(enc);
		}
		catch (javax.crypto.BadPaddingException e)
		{
		}
		catch (IllegalBlockSizeException e)
		{
		}
		catch (UnsupportedEncodingException e)
		{
		}
		catch (java.io.IOException e)
		{
		}
		return null;
	}

	// DES解码
	public String desDecrypt(String s)
	{
		try
		{
			byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(s);

			// 解码
			byte[] utf8 = dcipher.doFinal(dec);

			return new String(utf8, "UTF8");
		}
		catch (javax.crypto.BadPaddingException e)
		{
		}
		catch (IllegalBlockSizeException e)
		{
		}
		catch (UnsupportedEncodingException e)
		{
		}
		catch (java.io.IOException e)
		{
		}
		return null;
	}

}

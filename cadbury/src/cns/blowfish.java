package cns;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import javax.swing.JOptionPane;




public class blowfish {
	public static void main(String args[])throws Exception{
		
		KeyGenerator keygenerator=KeyGenerator.getInstance("BLOWFISH");
		SecretKey secretkey=keygenerator.generateKey();
		Cipher cipher=Cipher.getInstance("BLOWFISH");
		cipher.init(Cipher.ENCRYPT_MODE,secretkey);
		String inputtext="HELLOWORLD";
		byte[]encrypted=cipher.doFinal(inputtext.getBytes());
		cipher.init(Cipher.DECRYPT_MODE,secretkey);
		byte[]decrypted=cipher.doFinal(encrypted);
		
		System.out.println("Original String:" + inputtext);
		System.out.println("encrypted:"+new String(encrypted));
		System.out.println("decrypted:"+new String(decrypted));
				
		
	}

}

package aes;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.xml.bind.DatatypeConverter;

public class AES2 {

	private static String mensagem = "Ola mund@o, tudo bem com vc?";

	private static Scanner sc = new Scanner(System.in);
	static IvParameterSpec algorithmParameters;

	public static void main(String args[]) throws KeyStoreException, NoSuchAlgorithmException, CertificateException,
			IOException, UnrecoverableKeyException {

		byte[] mensagemEncriptada;
		byte[] mensagemDescriptada;
		String password = "password123"; // jks
		String alias = "dadoscontratacao"; // jks
		String keystoreFile = "itau-dados-contratacao.jks";

		// abrindo arquivo obtendo a chave
		FileInputStream is = new FileInputStream(keystoreFile);
		KeyStore keystore = KeyStore.getInstance("JCEKS");
		keystore.load(is, password.toCharArray());
		is.close();

		SecretKey key = (SecretKey) keystore.getKey(alias, password.toCharArray());

		try {

			byte[] iv = new byte[16];
			IvParameterSpec algorithmParameters = new IvParameterSpec(iv);

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

			cipher.init(Cipher.ENCRYPT_MODE, key, algorithmParameters);
			/* Encripta a Mensagem */
			mensagemEncriptada = cipher.doFinal(mensagem.getBytes());
			String base64Encoded = DatatypeConverter.printBase64Binary(mensagemEncriptada); // Convertendo para base64 para podermos enviar via json
			
			System.out.println(base64Encoded);
			/* Exibe Mensagem Encriptada */
			System.out.println(new String("Mensagem Encriptada: " + mensagemEncriptada));
			mensagemEncriptada = DatatypeConverter.parseBase64Binary(base64Encoded);
			
			//System.out.println(mensagemEncriptada);
			/* Informa ao objeto a ação de desencriptar */
			cipher.init(Cipher.DECRYPT_MODE, key, algorithmParameters);
			/* Recebe a mensagem encriptada e descripta */
			mensagemDescriptada = cipher.doFinal(mensagemEncriptada);
			/**
			 * Converte para a base 64 e amazena a mensagem em uma variavel auxiliar
			 */
			String mensagemOriginal = new String(mensagemDescriptada);

			/* Exibe Mensagem Descriptada */
			System.out.println("Mensagem Descriptada: " + mensagemOriginal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

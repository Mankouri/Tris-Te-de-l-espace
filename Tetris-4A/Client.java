import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Tentative de connexion en tant que client.
 * C'est une classe statique qui n'a qu'une fonction qui retourne le socket
 * de communication dans la cas d'une connexion.
 * @author Ange FOFE, Jalil MANKOURI & Andy HARVEL;
 * @version $Revision: 1.0 $
 */

 public class Client {
	/** Port de communication du client et du serveur. */
	private static final int PORT = 6666; // par defaut
/**
 * Retourne le socket de communication en tant que client.
 * @param hostname Le nom de la machine a laquelle on se connecte.

 * @return null si le socket n'a pas pu etre affecte.
 * Le socket genere sinon. */
public static Socket getSocket(String hostname) {
	Socket socket = null;
	try {
		/* ouvre une connexion sur le port du serveur. */
		socket = new Socket(InetAddress.getByName(hostname), PORT);
	} catch (IOException error) {
		socket = null;
	}
	/* Le socket retourne est null si echec: */
	return socket;
}
}
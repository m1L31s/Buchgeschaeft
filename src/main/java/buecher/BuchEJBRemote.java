package buecher;

import javax.ejb.Remote;
import javax.jws.WebService;

@Remote
@WebService
public interface BuchEJBRemote {
	public Buch findBuch(Long id);
	public Buch createBuch(Buch buch);
}

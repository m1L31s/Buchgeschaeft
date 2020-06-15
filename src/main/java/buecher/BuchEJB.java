package buecher;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Session Bean implementation class BuchEJB
 */
@Stateless
@LocalBean
@WebService(endpointInterface="buecher.BuchEJBRemote")
@SOAPBinding(style = Style.RPC)
public class BuchEJB implements BuchEJBRemote {
	@PersistenceContext(unitName="BuchDB")
	private EntityManager em;
	/**
	 * Default constructor.
	 */
	public BuchEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Buch findBuch(Long id) {
		return em.find(Buch.class, id);
	}

	@Override
	public Buch createBuch(Buch buch) {
		em.persist(buch);
		return buch;
	}
	
}

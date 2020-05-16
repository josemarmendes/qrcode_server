package br.gov.ma.tce.qrcode.server.arquitetura.documento_qrcode;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DocumentoQrCodeEntityManager {

	@PersistenceContext(unitName = "qrcode")
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}

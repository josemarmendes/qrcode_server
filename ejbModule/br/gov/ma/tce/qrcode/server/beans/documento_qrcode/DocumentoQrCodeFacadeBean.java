package br.gov.ma.tce.qrcode.server.beans.documento_qrcode;


import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class DocumentoQrCodeFacadeBean {
	
	public static final String JNDI = "qrcode_server/DocumentoQrCodeService!br.gov.ma.tce.qrcode.server.beans.documento_qrcode.DocumentoQrCodeService";

	@PersistenceContext(unitName = "qrcode")
	public EntityManager manager;

	public DocumentoQrCode insert(DocumentoQrCode documentoQrCode) {
		manager.persist(documentoQrCode);
		return documentoQrCode;
	}

	public DocumentoQrCode update(DocumentoQrCode documentoQrCode) {
		manager.merge(documentoQrCode);
		return documentoQrCode;
	}

	public void delete(Integer documentoQrcodeId) {
		manager.remove(manager.getReference(DocumentoQrCode.class, documentoQrcodeId));
	}
	
	public DocumentoQrCode findByPrimaryKey(Integer documentoQrcodeId) {
		DocumentoQrCode t = manager.find(DocumentoQrCode.class, documentoQrcodeId);
		return t;
	}

	@SuppressWarnings("unchecked")
	public Collection<DocumentoQrCode> findAll() {
		Query q = manager.createQuery("select x from " + DocumentoQrCode.NAME + " x where x.documentoQrCodeId <> null order by x.dataCriacao DESC");
		return q.getResultList();
	}

}

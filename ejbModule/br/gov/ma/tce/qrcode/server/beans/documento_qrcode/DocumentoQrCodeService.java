package br.gov.ma.tce.qrcode.server.beans.documento_qrcode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.google.zxing.WriterException;

import br.gov.ma.tce.qrcode.server.util.documento_qrcode.ZxingUtil;


@Stateless
public class DocumentoQrCodeService {

	public static final String JNDI = "qrcode_server/DocumentoQrCodeService!br.gov.ma.tce.qrcode.server.beans.documento_qrcode.DocumentoQrCodeService";

	@EJB
	private DocumentoQrCodeFacadeBean documentoQrCodeFacadeBean;
	
	public byte[] salvaDocumento(String nomeTabela, String nomeCampo, String chave) {
		
		DocumentoQrCode qrCode = new DocumentoQrCode();
		
		qrCode.setTabela(nomeTabela);
		qrCode.setCampo(nomeCampo);
		qrCode.setChave(chave);
		
		if(qrCode != null) {
			documentoQrCodeFacadeBean.insert(qrCode);
				
		}
		return ZxingUtil.getQRCodeImage();
		
	}

}

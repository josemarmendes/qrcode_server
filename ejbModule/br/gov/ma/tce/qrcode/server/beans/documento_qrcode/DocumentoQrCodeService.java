package br.gov.ma.tce.qrcode.server.beans.documento_qrcode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.gov.ma.tce.qrcode.server.util.documento_qrcode.ZxingUtil;


@Stateless
public class DocumentoQrCodeService {

	public static final String JNDI = "qrcode_server/DocumentoQrCodeService!br.gov.ma.tce.qrcode.server.beans.documento_qrcode.DocumentoQrCodeService";

	@EJB
	private DocumentoQrCodeFacadeBean documentoQrCodeFacadeBean;

	public void geraQrcode(String text, String url, OutputStream outputStream) throws Exception {
			
		outputStream.write(ZxingUtil.getQRCodeImage(text, url, 150, 150));
		outputStream.flush();
		outputStream.close();
	
	}

}

package br.gov.ma.tce.qrcode.server.test.documento_qrcode;

import java.util.Date;
import br.gov.ma.tce.qrcode.server.beans.documento_qrcode.DocumentoQrCode;

public class TestQrCode {
	
	public static void main(String[] args) {
		
		//DocumentoQrCodeEntityManager manager = new DocumentoQrCodeEntityManager();
		DocumentoQrCode documentoQrCode = new DocumentoQrCode();
		
		documentoQrCode.setCampo("texto_lei");
		documentoQrCode.setDataCriacao(new Date());
		documentoQrCode.setTabela("pla_certidao_ppa");
		documentoQrCode.setValorChave(1234);
		
		//manager.salvaNoBanco(documentoQrCode);	
		
	}

}

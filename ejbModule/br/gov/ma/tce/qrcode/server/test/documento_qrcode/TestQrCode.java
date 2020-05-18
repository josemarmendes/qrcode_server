package br.gov.ma.tce.qrcode.server.test.documento_qrcode;

import br.gov.ma.tce.qrcode.server.util.documento_qrcode.ZxingUtil;

public class TestQrCode {

	public static void main(String[] args) {
		
		ZxingUtil.criarImagemDeArrayBytes(ZxingUtil.getQRCodeImage());
		
	}

}

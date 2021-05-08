package homework7.core.concretes;

import homework7.core.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService {

	@Override
	public void verificationMail() {
		System.out.println("Doðrulama emaili yollanmýþtýr.Lütfen E Postanýzý kontrol ediniz.");
		
	}

}
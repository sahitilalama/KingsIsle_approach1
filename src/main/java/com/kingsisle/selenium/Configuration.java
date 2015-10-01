package com.kingsisle.selenium;

public class Configuration {

	// By Website.
	public static final String homepage = "https://www.wizard101.com/";
	public static final String gamepage = "https://www.wizard101.com/game";
	public static final String navigationPage = "https://www.wizard101.com/game/gift-cards";
	public static final String personalizeGiftPage = "https://www.wizard101.com/giftcert/personalizegift/";

	// By Xpath.
	public static final String giftCard = "html/body/div[5]/div[3]/div[2]/div[3]/div[3]/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td[3]/div/div/center/a/img";
	public static final String giftCert = "html/body/div[5]/div[3]/div[2]/div[3]/div[3]/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[1]/td/div/div/div[2]/div/a/img";
	
	public static final String bundle = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div";
	public static final String cancelXpath = "//*[@id=\"kiAccounts\"]/tbody/tr/td/table/tbody/tr/td[1]/a";
	public static final String continueButton = "/html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]/div[2]/div[4]/div/div/div/div[3]/div/a";
	public static final String giftCardButton = "html/body/div[5]/div[3]/div[2]/div[3]/div[3]/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr/td[3]/div/div/center/a/img";
	public static final String giftCertificatesButton = "html/body/div[5]/div[3]/div[2]/div[3]/div[3]/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[1]/td/div/div/div[2]/div/a/img";
	public static final String bundles = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[1]/div";

	public static final String oneMonth = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[2]/td[2]";
	public static final String numberOfCrowns = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[3]/td[2]";

	public static final String arcaneBuildersBundle = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[4]/td[2]";
	public static final String account = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[3]/td[1]";
	public static final String quantityPrepaid = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[2]/td[3]";
	public static final String quantityCrowns = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[3]/td[3]";
	public static final String quantityBundles = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[4]/td[3]";

	public static final String pricePrepaid = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[2]/td[4]";
	public static final String priceCrowns = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[3]/td[4]";
	public static final String priceBundles = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/div/table/tbody/tr[4]/td[4]";

	public static final String tax = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/table[2]/tbody/tr[1]/td[3]";
	public static final String total = "html/body/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr/td/div[3]/div[2]/table[2]/tbody/tr[2]/td[3]/span";

	// By ID
	public static final String payPalButton = "payPal";
	public static final String prepaidMembership = "month_1";
	public static final String crowns = "crowns_5000";
	public static final String personalizeTo = "personalizeToField";
	public static final String personalizeFrom = "personalizeFromField";
	public static final String personalizeMessage = "personalizeMessageField";
	public static final String checkOutButton = "checkOutButton";

}

package page.objects;



public class ObjectsPath {
	//LOGIN REGISTER SIGNOUT BUTTONS PATHS
	public static final String LoginIcon = "//a[contains(text(),'Sign In')]";
	public static final String EnterStorePath = "//a[contains(text(),'Enter the Store')]";
	public static final String RegisterLink = "//a[contains(text(),'Register Now!')]";
	public static final String UserNameLogin = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	public static final String PasswordLogin = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	public static final String LoginButton = "//input[@name='signon']";
	public static final String HelpButton = "//a[contains(text(),'?')]";
	public static final String LogoButton = "//div[@id='LogoContent']//a//img";
	public static final String SearchButton = "//input[@name='keyword']";
	public static final String ConfirmSearchButton = "//input[@name='searchProducts']";
	public static final String SignOutButton = "//a[contains(text(),'Sign Out')]";
	public static final String MyAccountButton = "//a[contains(text(),'My Account')]";
			
	//REGISTRATION PATHS
	public static final String REG_FIRSTNAME= "//input[@name='account.firstName']";
	public static final String REG_LASTNAME= "//input[@name='account.lastName']";
	public static final String REG_EMAIL= "//input[@name='account.email']";
	public static final String REG_PHONE = "//input[@name='account.phone']";
	public static final String REG_ADR1= "//input[@name='account.address1']";
	public static final String REG_ADR2= "//input[@name='account.address2']";
	public static final String REG_CITY= "//input[@name='account.city']";
	public static final String REG_STATE= "//input[@name='account.state']";
	public static final String REG_ZIP= "//input[@name='account.zip']";
	public static final String REG_COUNTRY= "//input[@name='account.country']";
	public static final String REG_USER_ID = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	public static final String REG_NEWPASSWORD = "//input[@name='password']";
	public static final String REG_REPEATPASSWORD = "//input[@name='repeatedPassword']";
	public static final String REG_LANGUAGE = "//select[@name='account.languagePreference']";
	public static final String REG_FAV_CATEGORY = "//select[@name='account.favouriteCategoryId']";
	public static final String REG_EML = "//input[@name='account.listOption']";
	public static final String REG_EMB = "//input[@name='account.bannerOption']";
	public static final String REG_SUBMIT = "//input[@name='newAccount']";
	public static final String MYACC_SUBMIT = "//input[@name='editAccount']";
	
	// LEFT SIDED ANIMALS PATHS
	public static final String FISH_LEFT = "//div[@id='Content']//a[1]//img[1]";
	public static final String DOGS_LEFT = "//div[@id='Content']//a[2]//img[1]";
	public static final String CATS_LEFT = "//div[@id='Content']//a[3]//img[1]";
	public static final String REPS_LEFT = "//div[@id='Content']//a[4]//img[1]";
	public static final String BIRDS_LEFT = "//div[@id='Content']//a[5]//img[1]";
	// TOP ANIMAL PATHS
	public static final String FISH_TOP= "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String DOGS_TOP = "//div[@id='Header']//a[2]//img[1]";
	public static final String REPS_TOP = "//div[@id='Header']//a[3]//img[1]";
	public static final String CATS_TOP = "//div[@id='Header']//a[4]//img[1]";
	public static final String BIRDS_TOP = "//div[@id='Header']//a[5]//img[1]";
	// PICTURE ANIMAL PATHS
	public static final String BIRDB_PIC = "//body//area[1]";
	public static final String FISH_PIC = "//body//area[2]";
	public static final String DOGS_PIC = "//body//area[3]";
	public static final String REPS_PIC = "//body//area[4]";
	public static final String CATS_PIC = "//body//area[5]";
	public static final String BIRDS_PIC = "//body//area[1]";
	// CART PATHS
	public static final String CART = "//img[@name='img_cart']";
	public static final String IGUANA_PATH = "//a[contains(text(),'RP-LI-02')]";
	public static final String ADD_CART = "//a[@class='Button']";
	
			
	

}
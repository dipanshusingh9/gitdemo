package productModule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMREPO.CreateNewVendorPage;
import POMREPO.CreatingNewProductPage;
import POMREPO.HomePage;
import POMREPO.ProductInfromationPage;
import POMREPO.ProductPage;
import POMREPO.VendorInformationPage;
import POMREPO.VendorsPage;
import genericUtility.BaseClass;
import genericUtility.IPATHCONSTANT;
import genericUtility.JavaUtility;

public class CreateAProductTest extends BaseClass{
	
	@Test
public void createProductWithVendorDetailsTest() throws EncryptedDocumentException, IOException {
		
		String vendorName = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_VENDOR, 18, 2);
		String productName = eUtils.FetchDatafromExcelUtility(IPATHCONSTANT.SHEET_NAME_FOR_PRODUCT, 17, 2);
		
		
		JavaUtility jUtils=new JavaUtility();
		String SalesStartDate = jUtils.generateDateInYYYY_MM_DDFormat();
		
		HomePage home=new HomePage(driver);
		home.clickOnVendors();
		
		VendorsPage vendors = new VendorsPage(driver);
		vendors.clickOnVendorPlusButton();
		
		CreateNewVendorPage createVendor = new CreateNewVendorPage(driver);
		createVendor.enterVendorName(vendorName);
		createVendor.clickOnSaveButton();
		
		VendorInformationPage vendorInfo = new VendorInformationPage(driver);
		String actualVendorName = vendorInfo.verifyVendorInfo(vendorName);
		
		Assert.assertTrue(actualVendorName.contains(vendorName));
		System.out.println("Pass: The vendor has been created");
		
		home.clickOnProducts();
		
		ProductPage product=new ProductPage(driver);
		product.ClickonProductModule();
		
		CreatingNewProductPage createProduct=new CreatingNewProductPage(driver);
		createProduct.enterProductName(productName);
		
		createProduct.enterDate(SalesStartDate);
		createProduct.clickOnVendorLookUpButton();
		
		wUtils.switchToWindow(driver, "Vendors&action");
		createProduct.enterInSearchTextBox(vendorName);
		createProduct.clickOnSearchButton();
		createProduct.clickOnVendorNameAfterSearch(vendorName);
		
		wUtils.switchToWindow(driver, "Products");
		createProduct.uploadProductImage("/src/test/resources/DemoPrint2231423.pdf");
		
		createProduct.clickOnSaveButton();
		
		ProductInfromationPage productInfo=new ProductInfromationPage(driver);
		String actualProductName = productInfo.verifyProduct(productName);
		Assert.assertTrue(actualProductName.contains(productName));
		System.out.println("Pass: The product is created");
		
	}


}

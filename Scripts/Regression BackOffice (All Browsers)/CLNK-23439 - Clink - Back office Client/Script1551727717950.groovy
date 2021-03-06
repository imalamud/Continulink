import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.deleteAllCookies()

WebUI.openBrowser(GlobalVariable.G_SiteBackOffice)

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Regression BackOffice/Login/UserBackOffice'), GlobalVariable.G_UserBackOffice)

WebUI.setText(findTestObject('Regression BackOffice/Login/PasswordBackOffice'), GlobalVariable.G_PasswordBackOffice)

WebUI.click(findTestObject('Regression BackOffice/Login/LoginBackOffice'))

WebUI.waitForPageLoad(60)

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-Frames/FrameFrameLeft'), 5, FailureHandling.OPTIONAL)

// WebDriver driver = DriverFactory.getWebDriver()
// WebElement Frame = driver.findElement(By.xpath('//*[@id="FrameLeft"]'))
// driver.switchTo().frame(Frame)
// WebElement Intake = driver.findElement(By.xpath('//div[2]/span/table/tbody/tr/td'))
// WebDriverWait wait = new WebDriverWait(driver, long time = 10)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-Frames/ClientIntake'), 50, FailureHandling.OPTIONAL)
WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK-Frames/ClientIntake'), 100, FailureHandling.OPTIONAL)

WebUI.switchToDefaultContent()


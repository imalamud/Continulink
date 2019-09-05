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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Regression BackOffice (All Browsers)/CLNK-23439 - Clink - Back office Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/FinanceLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/FinanceLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30891/Group Bill Rates'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/Group Bill Rates'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30891/PayerName'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/PayerName'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30891/PayerName'), 'AC')

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30891/PayerName'), Keys.chord(Keys.ENTER))

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30891/PlanName'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/PlanName'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30891/PlanName'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/SearchButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Payer Searched'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Payer Searched'))

WebUI.delay(3)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30891/a_PCA'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/a_PCA'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30891/a_Fecha'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/a_Fecha'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30891/td_Authorization'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/td_Authorization'))

WebUI.delay(3)

if (WebUI.verifyElementChecked(findTestObject('Regression BackOffice/CLINK-30891/input_Authorization Group_chkNoAuthorizationRequired'), 
    10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/input_Authorization Group_chkNoAuthorizationRequired'))

    WebUI.delay(5)
}

if (WebUI.verifyElementNotChecked(findTestObject('Regression BackOffice/CLINK-30891/Authorization Time Frame'), 10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30891/Authorization Time Frame'))

    WebUI.delay(5)
}

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-31354/frame_Capture object_BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'))

WebUI.delay(5)

WebUI.waitForAlert(30)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

String fecha = GlobalVariable.G_Auth_Date

driver.switchTo().alert().sendKeys(fecha)

WebUI.acceptAlert()

WebUI.delay(10)


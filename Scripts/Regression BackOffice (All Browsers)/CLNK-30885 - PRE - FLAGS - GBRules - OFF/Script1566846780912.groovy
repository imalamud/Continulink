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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Group Bill RulesLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Group Bill RulesLink'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/PayerName'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/PayerName'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/PayerName'), 'AC')

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/PayerName'), Keys.chord(Keys.ENTER))

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/PlanName'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/PlanName'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/PlanName'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/SearchButton'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Payer Searched'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Payer Searched'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Frequency'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Frequency'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/Frequency'), Keys.chord(Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-30885/Late-time Slip Rules'), 50)

WebUI.delay(3)

if (WebUI.verifyElementChecked(findTestObject('Regression BackOffice/CLINK-30885/HoldInvoicesCheck'), 10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/HoldInvoicesCheck'))

    WebUI.delay(5)
}

if (WebUI.verifyElementChecked(findTestObject('Regression BackOffice/CLINK-30885/Produce new invoices for late-time slips'), 
    10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Produce new invoices for late-time slips'))

    WebUI.delay(5)
}

if (WebUI.verifyElementNotChecked(findTestObject('Regression BackOffice/CLINK-30885/Release All available'), 10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Release All available'))

    WebUI.delay(5)
}

if (WebUI.verifyElementChecked(findTestObject('Regression BackOffice/CLINK-30885/Release Out of AS'), 10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Release Out of AS'))

    WebUI.delay(5)
}

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-30885/General Bill Rules'), 50)

if (WebUI.verifyElementChecked(findTestObject('Regression BackOffice/CLINK-30885/Enable Hard Stops'), 10)) {
    WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Enable Hard Stops'))

    WebUI.delay(5)
}

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-31354/frame_Capture object_BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'))

WebUI.delay(5)

WebUI.waitForAlert(30)

WebDriver driver = DriverFactory.getWebDriver()

// String month = CustomKeywords.'getDate.DateUtilities.getDateMonthNumber'()
// String year = CustomKeywords.'getDate.DateUtilities.getDateYearNumber'()
String fecha = GlobalVariable.G_Auth_Date

driver.switchTo().alert().sendKeys(fecha)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(10)


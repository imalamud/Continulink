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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/ServiceGroupLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/ServiceGroupLink'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/FirstName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-31354/FirstName'), GlobalVariable.G_ClientFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/Last Name'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-31354/Last Name'), GlobalVariable.G_ClientLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/SearchButton'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/ClientSearch'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/ClientSearch'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/AddServiceButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/AddServiceButton'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/ServiceType'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/ServiceType'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-31354/ServiceType'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/a_Add to List'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/a_Add to List'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/AddPayer'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/AddPayer'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/Group'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/Group'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-31354/Group'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-31354/ServiceType'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/a_Add to List - Payer'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/a_Add to List - Payer'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/Reimbursement'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/Reimbursement'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-31354/Reimbursement'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-31354/Reimbursement'), '100')

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-31354/frame_Capture object_BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'))

WebUI.delay(5)

WebUI.waitForAlert(30)

WebDriver driver = DriverFactory.getWebDriver()

String fecha = CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'()

println(fecha)

driver.switchTo().alert().sendKeys(fecha)

WebUI.acceptAlert()

WebUI.delay(10)

not_run: WebUI.switchToDefaultContent()


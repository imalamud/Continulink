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

WebUI.callTestCase(findTestCase('Regression BackOffice (All Browsers)/CLNK-23439 - Clink - Back office Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/Setup Caregiver Remote Login'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23448/Setup Caregiver Remote Login'))

WebUI.waitForPageLoad(60)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/Caregiver Name II'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23448/Caregiver Name II'), GlobalVariable.G_CaregiverFirstName)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23448/Caregiver Name II'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/New Password'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23448/New Password'), 'qwerty')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/Confirm newPassword'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23448/Confirm newPassword'), 'qwerty')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/Email'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23448/Email'), 'isaac@gmail.com')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/BUnit'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23448/BUnit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23448/CreateUsrButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23448/CreateUsrButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()


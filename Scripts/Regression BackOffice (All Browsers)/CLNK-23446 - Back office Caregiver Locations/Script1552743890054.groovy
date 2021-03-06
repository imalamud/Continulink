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

if (WebUI.verifyElementVisible(findTestObject('Regression BackOffice/CLINK-23446/Caregiver Locations'))== true)
{
	WebUI.click(findTestObject('Regression BackOffice/CLINK-23446/Caregiver Locations'))

	WebUI.delay(2)
}else
{
	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'))

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23446/Caregiver Locations'), 50)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-23446/Caregiver Locations'))

	WebUI.delay(2)
}

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), GlobalVariable.G_CaregiverFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Last NameHR'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23441/Last NameHR'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/CaregiverSearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/CaregiverSearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/ClientLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/ClientLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23446/NewCaregiverLocation'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23446/NewCaregiverLocation'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23446/ZoneName'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23446/ZoneName'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23446/ZoneName'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23446/li_Location'), 50)

WebUI.doubleClick(findTestObject('Regression BackOffice/CLINK-23446/li_Location'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23446/a_Add To List'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23446/a_Add To List'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(50)

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-23444/BannerFrameAtt'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23446/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23446/SaveButton'))

WebUI.delay(2)

WebUI.closeBrowser()


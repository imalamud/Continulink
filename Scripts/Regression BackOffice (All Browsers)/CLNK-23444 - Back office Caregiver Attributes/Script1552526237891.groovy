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

WebUI.callTestCase(findTestCase('Regression BackOffice (All Browsers)/CLNK-23439 - Clink - Back office Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23444/Caregiver Attributes'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23444/Caregiver Attributes'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), 'Josh')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Last NameHR'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23441/Last NameHR'), 'Test')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/CaregiverSearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/CaregiverSearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/ClientLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/ClientLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23444/New Attribute'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23444/New Attribute'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23444/CheckedBy'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23444/CheckedBy'), 'Isaac')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23444/Checked Date'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23444/Checked Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23444/a_Add To List'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23444/a_Add To List'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-23444/BannerFrameAtt'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23444/Save'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23444/Save'))

WebUI.delay(2)


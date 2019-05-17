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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/CaregiverHRLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/CaregiverHRLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/CaregiverDemographics'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/CaregiverDemographics'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/LastNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-17788/LastNameSearch'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/SearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/UserLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/UserLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-17788/OtherInformationSection'), 20)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/YesCareManager'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/YesCareManager'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/NoClinicalManager'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/NoClinicalManager'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-17788/BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17788/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17788/SaveButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()


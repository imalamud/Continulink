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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30887/a_RN Visit'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30887/a_RN Visit'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30887/a_08282019'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30887/a_08282019'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30887/div_Test'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30887/div_Test'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30887/span_Authorization'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30887/span_Authorization'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30887/td_No Authorizations have been entered for this Service Type'), 
    50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30887/td_No Authorizations have been entered for this Service Type'))

WebUI.delay(10)

WebUI.closeBrowser()


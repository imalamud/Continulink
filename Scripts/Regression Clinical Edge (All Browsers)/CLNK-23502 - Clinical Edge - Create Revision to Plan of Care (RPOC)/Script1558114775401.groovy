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

WebUI.callTestCase(findTestCase('Regression Clinical Edge (All Browsers)/CLNK-23349 - ContinuLink - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.delay(8)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/ClientPage/HomeLink'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/ClientPage/HomeLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/RequestTab'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/HomePage/RequestTab'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/SearchText'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/HomePage/SearchText'), GlobalVariable.G_ClientLastName)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'), 60)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'), 60)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'))

WebUI.delay(5)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/ClientLink'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/HomePage/ClientLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK - 23504/Plan of Care Section'), 50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23502/AddPOC'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23502/AddPOC'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23502/Revision to POC'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23502/Revision to POC'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23502/Ok'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23502/Ok'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23502/Save'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23502/Save'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

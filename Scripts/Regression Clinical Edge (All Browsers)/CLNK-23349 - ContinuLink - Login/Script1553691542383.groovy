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

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-23349/User'), GlobalVariable.G_User)

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-23349/Password'), GlobalVariable.G_Password)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23349/Button_LogIn'))

WebUI.waitForPageLoad(60)

WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/button_Close'), 100)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/button_Close'))

not_run: WebUI.delay(2)


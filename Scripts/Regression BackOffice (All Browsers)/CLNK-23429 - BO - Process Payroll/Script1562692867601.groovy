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

WebUI.openBrowser(GlobalVariable.G_SiteBackOffice)

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Regression BackOffice/Login/UserBackOffice'), GlobalVariable.G_UserBackOffice)

WebUI.setText(findTestObject('Regression BackOffice/Login/PasswordBackOffice'), GlobalVariable.G_PasswordBackOffice)

WebUI.click(findTestObject('Regression BackOffice/Login/LoginBackOffice'))

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 5)

if (WebUI.verifyElementVisible(findTestObject('Regression BackOffice/CLNK-30366/Process Payroll'))== true)
{
	WebUI.click(findTestObject('Regression BackOffice/CLNK-30366/Process Payroll'))

	WebUI.delay(2)
}else
{
	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-30366/PayrollLink'), 60)
	
	WebUI.click(findTestObject('Regression BackOffice/CLNK-30366/PayrollLink'), FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.delay(2)
	
	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-30366/Process Payroll'), 60)
	
	WebUI.click(findTestObject('Regression BackOffice/CLNK-30366/Process Payroll'), FailureHandling.CONTINUE_ON_FAILURE)
	
	WebUI.delay(2)
}

WebUI.waitForPageLoad(60)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-30366/Automation BU Check'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-30366/Automation BU Check'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23429/frame_Capture object_BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23429/ProcessPayrollButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23429/ProcessPayrollButton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23429/ContinueButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23429/ContinueButton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)


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

if (WebUI.verifyElementVisible(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'))== true)
{
	WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'))

	WebUI.delay(2)
}else
{
	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'), 100)
	
	WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'))
	
	WebUI.delay(2)
	
	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'), 50)
	
	WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'))
	
	WebUI.delay(2)
}

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), GlobalVariable.G_ClientFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/LastNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/LastNameSearch'), GlobalVariable.G_ClientLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), 50)

WebUI.rightClick(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/View POC  RPOC'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/View POC  RPOC'))

WebUI.delay(10)

WebUI.waitForPageLoad(50)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/StatusColumn'), 100)

not_run: WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK-17593/StatusColumn'), 50)

not_run: WebUI.delay(2)



if (WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK-17593/Status'), 10)) {


	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/Status'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/Status'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/Distribution'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/Distribution'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-17593/Distribution'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

	WebUI.delay(4)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/DateOfDistribution'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/DateOfDistribution'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-17593/DateOfDistribution'), '05/20/2019')

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/isVerified'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/isVerified'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/SaveDistribution'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/SaveDistribution'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17593/span_Close'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-17593/span_Close'), FailureHandling.CONTINUE_ON_FAILURE)

	WebUI.delay(2)
}

WebUI.closeBrowser()


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

if (WebUI.verifyElementVisible(findTestObject('Regression BackOffice/CLINK-28578/Notes QA'))== true)
{
	WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/Notes QA'))

	WebUI.delay(2)
}else
{
			WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/ClinicalLink'), 100)

			WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/ClinicalLink'))

			WebUI.delay(2)

			WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/Notes QA'), 50)

			WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/Notes QA'))

			WebUI.delay(2)
}

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/input_Client_txtClient'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-28578/input_Client_txtClient'), GlobalVariable.G_ClientLastName)

WebUI.focus(findTestObject('Regression BackOffice/CLINK-28578/input_Client_txtClient'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-28578/input_Client_txtClient'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/DateFrom'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/DateFrom'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-28578/DateFrom'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-28578/DateFrom'), GlobalVariable.G_Date)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/btnSearch'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/btnSearch'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK-28578/DocumentLink'), 10)) {
    WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/DocumentLink'), 50)

    WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/DocumentLink'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForPageLoad(50)

    WebUI.delay(5)

    not_run: WebUI.switchToDefaultContent()

    WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-28578/iframe'), 30)

    WebUI.delay(10)

    WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/ApproveLink'), 50)

    WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/ApproveLink'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)

    WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/input_Confirm Password'), 50)

    WebUI.setText(findTestObject('Regression BackOffice/CLINK-28578/input_Confirm Password'), GlobalVariable.G_Password)

    WebUI.delay(2)

    WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-28578/OkPOC'), 50)

    WebUI.click(findTestObject('Regression BackOffice/CLINK-28578/OkPOC'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)
}

WebUI.closeBrowser()


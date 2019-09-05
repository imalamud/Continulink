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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-31481/ManagementLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-31481/ManagementLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-31481/Business Unit Demographics'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-31481/Business Unit Demographics'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-31481/WeekDay'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-31481/WeekDay'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-31481/WeekDay'), 'Fr')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-31481/WeekDay'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-31354/frame_Capture object_BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-31354/SaveButton'))

WebUI.delay(5)

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.switchToDefaultContent()

not_run: WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/FinanceLink'), 100)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/FinanceLink'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Group Bill RulesLink'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Group Bill RulesLink'))

not_run: WebUI.delay(2)

not_run: WebUI.switchToDefaultContent()

not_run: WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/PayerName'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/PayerName'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/PayerName'), 'AC')

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/PayerName'), Keys.chord(Keys.ENTER))

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/PlanName'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/PlanName'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/PlanName'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/SearchButton'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/SearchButton'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Payer Searched'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Payer Searched'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30885/Frequency'), 50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK-30885/Frequency'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30885/Frequency'), Keys.chord(Keys.ARROW_UP, Keys.ARROW_UP, 
        Keys.ARROW_UP, Keys.ENTER))

not_run: WebUI.delay(5)


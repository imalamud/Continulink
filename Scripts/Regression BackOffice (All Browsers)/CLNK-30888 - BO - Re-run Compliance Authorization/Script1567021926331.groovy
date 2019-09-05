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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/ScheduleLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/ScheduleLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/Re-run Compliance  Authorization Link'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/Re-run Compliance  Authorization Link'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/Last name'), 50)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30888/Last name'), GlobalVariable.G_ClientLastName)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-30888/Last name'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/GetClientButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/GetClientButton'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/ClientSelected'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/ClientSelected'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/StartAutorization'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/StartAutorization'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-30888/span_Select all'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/span_Select all'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-30888/StartButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-30888/StartButton'))

WebUI.delay(600)

WebUI.closeBrowser()


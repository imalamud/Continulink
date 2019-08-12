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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/ScheduleIcon'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/ScheduleIcon'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/EnterNeeds'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/EnterNeeds'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/Client NameSearchNeeds'), 100)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/Client NameSearchNeeds'), GlobalVariable.G_ClientLastName)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-10235/Client NameSearchNeeds'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/ScheduleAssessmentCode'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/ScheduleAssessmentCode'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/ServiceTypeList'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/ServiceTypeList'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-10235/ServiceTypeList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLNK-10235/StartTime'), 10)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/StartTime'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/StartTime'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-10235/StartTime'), '1126')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/EndTime'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/EndTime'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-10235/EndTime'), '1136')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLNK-10235/CaregiverName'), 10)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/CaregiverName'), 100)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/CaregiverName'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(2)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/CaregiverName'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-10235/CaregiverName'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-17788/BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/SaveButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()


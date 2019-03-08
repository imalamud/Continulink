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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-17180/Client  Intake Reports Link'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/Client  Intake Reports Link'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/Admission Authorization Changes Report Link'), 
    50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/Admission Authorization Changes Report Link'))

WebUI.delay(2)

WebUI.waitForPageLoad(60)

// WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK-17180/Show Auth Comments'), 50)
// WebUI.delay(2)
WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/Search Client Link'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/Search Client Link'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToWindowUrl('http://qanewpoc.continulink.com:81/backoffice/Client/ClientSearch.aspx?search=true')

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/Last Name'), 50)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-17180/Last Name'), 'Rollback')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'))

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForPageLoad(60)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/EpisodeAdmisionDetails'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/EpisodeAdmisionDetails'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-17180/EpisodeAdmisionDetails'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/ServiceTypeHHA'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/ServiceTypeHHA'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-17180/ServiceTypeHHA'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/GroupSelfPayName'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/GroupSelfPayName'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-17180/GroupSelfPayName'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/FromDate'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-17180/FromDate'), '01/01/2017')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/ToDate'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-17180/ToDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-17180/a_Show Report'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-17180/a_Show Report'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.delay(4)


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

WebUI.callTestCase(findTestCase('Regression Clinical Edge (All Browsers)/CLNK-23349 - ContinuLink - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.delay(8)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/button_Close'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/button_Close'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/ClientLink'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/HomePage/ClientLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/Client Search'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/Client Search'))

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-23497/Client Search'), GlobalVariable.G_Client)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-23497/Client Search'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'))

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'))

WebUI.selectOptionByLabel(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'), 'Start of care - further visits planned (C2)', 
    false)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/SaveAssessment'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/SaveAssessment'))

WebUI.delay(3)


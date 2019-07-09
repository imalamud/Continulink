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

WebUI.delay(2)

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

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/AddDiagnosis'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/AddDiagnosis'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/a_Diagnosis'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/a_Diagnosis'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/DiagnosisSearch'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/DiagnosisSearch'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_1'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_1'), 'A')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_2'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_2'), '0')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_3'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_3'), '0')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_4'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/Codifier_Level_4'), '0')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/ApplyButton'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/ApplyButton'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/input_OE Date_txtOEDate'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/input_OE Date_txtOEDate'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/input_OE Date_txtOEDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumber'())

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/input_Effective Begin Date_txtBeginDate'), 
    50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/input_Effective Begin Date_txtBeginDate'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/input_Effective Begin Date_txtBeginDate'), 
    CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumber'())

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/button_OkDiagnosis'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Diagnosis/button_OkDiagnosis'))

WebUI.delay(5)

WebUI.closeBrowser()


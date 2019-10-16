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

WebUI.delay(8)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/ClientPage/HomeLink'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/ClientPage/HomeLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.verifyElementPresent(findTestObject('Regression Clinical Edge/CLINK-23467/a_CurrentClient'), 10)

if (WebUI.verifyElementPresent(findTestObject('Regression Clinical Edge/CLINK-23467/a_CurrentClient'), 10)) {
    WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23467/a_CurrentClient'))
} else if (WebUI.verifyElementNotPresent(findTestObject('Regression Clinical Edge/CLINK-23467/a_CurrentClient'), 10)) {
    WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/RequestTab'), 50)

    WebUI.click(findTestObject('Regression Clinical Edge/HomePage/RequestTab'))

    WebUI.delay(2)

    WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/SearchText'), 50)

    WebUI.setText(findTestObject('Regression Clinical Edge/HomePage/SearchText'), GlobalVariable.G_ClientLastName)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'), 60)

    WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'), 60)

    WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'))
}

WebUI.delay(5)

WebUI.waitForPageLoad(50)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/ClientLink'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/HomePage/ClientLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

not_run: WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'))

not_run: WebUI.selectOptionByLabel(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'), 'Start of care - further visits planned (D)', 
    false)

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'))

not_run: WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/SaveAssessment'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/SaveAssessment'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForPageLoad(50)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/a_Start of care - further visits planned (D) (10102019)'), 
    50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/a_Start of care - further visits planned (D) (10102019)'))

WebUI.delay(5)

WebUI.waitForPageLoad(50)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-26208/m0032'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/m0032'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/m0032'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0080'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0080'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0090'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0090'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/M0090'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/SaveButton'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/SaveButton'))

WebUI.delay(5)


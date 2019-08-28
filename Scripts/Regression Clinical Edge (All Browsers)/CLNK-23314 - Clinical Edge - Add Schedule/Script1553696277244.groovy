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

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/button_Add Schedule'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/button_Add Schedule'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/FilterBySubServices'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/FilterBySubServices'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/ServiceTypeList'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/ServiceTypeList'))

WebUI.delay(2)

WebUI.focus(findTestObject('Regression Clinical Edge/CLINK-23314/ServiceTypeList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23314/ServiceTypeList'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/StartTime'), 60)

WebUI.clearText(findTestObject('Regression Clinical Edge/CLINK-23314/StartTime'))

WebUI.delay(3)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/StartTime'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23314/StartTime'), GlobalVariable.G_StartTime)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/EndTime'), 60)

WebUI.clearText(findTestObject('Regression Clinical Edge/CLINK-23314/EndTime'))

WebUI.delay(2)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/EndTime'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23314/EndTime'), GlobalVariable.G_EndTime)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/SaveButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/SaveButton'))

WebUI.waitForPageLoad(100)

WebUI.delay(4)

WebUI.closeBrowser()


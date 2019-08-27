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

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/ClientPage/HomeLink'), 100)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/ClientPage/HomeLink'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/RequestTab'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/HomePage/RequestTab'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/SearchText'), 50)

not_run: WebUI.setText(findTestObject('Regression Clinical Edge/HomePage/SearchText'), GlobalVariable.G_ClientLastName)

not_run: WebUI.delay(3)

not_run: WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'), 60)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'), 60)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23314/a_Khur Heather (535592)'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-29104/PlayVisit'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-29104/PlayVisit'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-29104/Nursing Visit Link'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-29104/Nursing Visit Link'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/VisitBillingCode'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/VisitBillingCode'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-23511/VisitBillingCode'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/Sections'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Sections'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/Nursing Findings Physical Observation'), 
    50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Nursing Findings Physical Observation'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/Orientated1'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Orientated1'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23511/WNL2'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/WNL2'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23511/Clear3'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Clear3'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/textarea_Clear'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/textarea_Clear'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-23511/textarea_Clear'), 'Clear Text')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23511/NoProb4'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/NoProb4'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23511/Chronic5'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Chronic5'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23511/SaveButton'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/SaveButton'))

WebUI.delay(5)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/Sign Submit'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Sign Submit'))

WebUI.waitForPageLoad(50)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/Signature'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/Signature'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-23511/Signature'), 'qwerty')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23511/OkSignature'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23511/OkSignature'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.closeBrowser()


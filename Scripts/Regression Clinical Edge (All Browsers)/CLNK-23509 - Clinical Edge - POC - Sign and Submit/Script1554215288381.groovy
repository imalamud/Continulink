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

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/button_Close'), 100)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/button_Close'))

not_run: WebUI.delay(2)

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

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK - 23504/Plan of Care Section'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Plan of Care Client'))

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/GoNext'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/GoNext'))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/GoNext'), 50)

WebUI.delay(2)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/GoNext'))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/GoNext'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/GoNext'))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/EditBtn'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/EditBtn'))

not_run: WebUI.waitForPageLoad(50)

not_run: WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/CaneMedical Equipment'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/CaneMedical Equipment'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/SaveBtn'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/SaveBtn'))

WebUI.waitForPageLoad(50)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/div_SignSubmit'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/div_SignSubmit'))

WebUI.waitForPageLoad(50)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/b_Treatment Orders'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/b_Treatment Orders'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/AddTreatment Orders'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/AddTreatment Orders'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/ServiceType'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/ServiceType'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/ServiceType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Number of Visits'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Number of Visits'), '2')

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Frequency'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Frequency'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Frequency'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Order Duration'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Order Duration'), '2')

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Duration'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Duration'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/Duration'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/WeeklyLimit'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/WeeklyLimit'), '2')

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/button_OK'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Frequency/button_OK'))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForPageLoad(50, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/SaveBtn'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/SaveBtn'))

WebUI.waitForPageLoad(50)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/div_SignSubmit'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/div_SignSubmit'))

WebUI.waitForPageLoad(50)

WebUI.delay(15)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Question 22. Rehab Potential'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/Question 22. Rehab Potential'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Rehabilitation Potential'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Rehabilitation Potential'), 'Rehabilitation Potential')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/SaveBtn'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/SaveBtn'))

WebUI.waitForPageLoad(50)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/div_SignSubmit'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/div_SignSubmit'))

WebUI.waitForPageLoad(50)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/Signature'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-23509/Signature'), GlobalVariable.G_Password)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-23509/OkSignature'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-23509/OkSignature'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()


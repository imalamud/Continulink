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

if (WebUI.verifyElementVisible(findTestObject('Regression BackOffice/CLINK-23442/CaregiverDemographics'))== true)
{
	WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/CaregiverDemographics'))

	WebUI.delay(2)
}else
{
	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'))

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/CaregiverDemographics'), 50)

	WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/CaregiverDemographics'))

	WebUI.delay(2)
}

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), GlobalVariable.G_CaregiverFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Last NameHR'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23441/Last NameHR'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/CaregiverSearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/CaregiverSearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/ClientLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/ClientLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/NickName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23442/NickName'), 'Pache')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-23442/NewPhoneLink'), 50)

WebUI.delay(1)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/NewPhoneLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/PhoneTypeList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/PhoneTypeList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23442/PhoneTypeList'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/PhoneNumber'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23442/PhoneNumber'), '5896321472')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Add to List Button'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/Add to List Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Group'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23442/Group'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/SubGroup'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/SubGroup'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23442/SubGroup'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-23442/Add Discipline'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/Add Discipline'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/DisciplineList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/DisciplineList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23442/DisciplineList'), Keys.chord(Keys.PAGE_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Begin Date'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23442/Begin Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Add to List Discipline'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/Add to List Discipline'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Add Discipline'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/Add Discipline'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/DisciplineList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/DisciplineList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23442/DisciplineList'), Keys.chord(Keys.PAGE_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Begin Date'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23442/Begin Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/Add to List Discipline'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/Add to List Discipline'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/RequestChart'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/RequestChart'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/QAReviewForForms'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/QAReviewForForms'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK-23442/BannerFrame'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23442/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23442/SaveButton'))

WebUI.delay(2)

WebUI.closeBrowser()


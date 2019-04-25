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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23441/Caregiver  HRLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Caregiver Search'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Caregiver Search'))

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverFirst Name'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverFirst Name'), 'xxxxx')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverLast Name'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverLast Name'), 'xxxxx')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/SSN'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/SSN'), '999999995')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverBttnSearch'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverBttnSearch'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Add a new Caregiver Link'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Add a new Caregiver Link'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/CaregiverType'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/General Information/CaregiverType'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/General Information/CaregiverType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/LineOfBusiness'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/General Information/LineOfBusiness'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/General Information/LineOfBusiness'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/First Name Caregiver'), 
    50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/First Name Caregiver'), GlobalVariable.G_CaregiverFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/Last Name Caregiver'), 
    50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/Last Name Caregiver'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/SSNCaregiver'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/SSNCaregiver'), GlobalVariable.G_CaregiverSSN)

WebUI.delay(2)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/Address/Address'), '1628 NW 6 St')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/Address/City'), 'Miami')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/Address/Country'), 'United States')

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Address/State'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Address/State'), 'Florida')

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Address/State'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Address/BtnVerify'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Address/ChkVerify'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Phone/Add New Phone Link'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Phone/Add New Phone Link'))

WebUI.delay(2)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Phone/PhoneType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Phone/PhoneType'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/Phone/PhoneNumber'), '2345698789')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Phone/chkisprimary'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Phone/chkisprimary'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Phone/a_Add to List'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Phone/a_Add to List'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Add Discipline'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Add Discipline'))

WebUI.delay(2)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/DisciplineType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/DisciplineType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Begin Date'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Begin Date'), '04/04/2019')

WebUI.delay(4)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Effective EndDate'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Effective EndDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

not_run: WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/ChkPrimaryDiscipline'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/ChkPrimaryDiscipline'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Add to List Discipline'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Add to List Discipline'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/bttnSave'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/bttnSave'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Date Of Birth'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Date Of Birth'), '05/23/1970')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/u_Continue'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/u_Continue'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Caregiver HR Details'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Caregiver HR Details'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/ChkSameAddress'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/ChkSameAddress'))

WebUI.delay(5)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/RaceType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/RaceType'), Keys.chord(Keys.ARROW_UP, Keys.ARROW_UP, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/SexType'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/SexType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Date Of Hire'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Date Of Hire'), '04/04/2019')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/bttnSaveII'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/bttnSaveII'))

WebUI.delay(3)


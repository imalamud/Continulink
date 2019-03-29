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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Quick Intake Wizard Link'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Quick Intake Wizard Link'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/New Referral Button'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/New Referral Button'))

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ReferralType'), 50)

WebUI.focus(findTestObject('Regression BackOffice/CLNK-23449/ReferralType'))

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/ReferralType'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/ReferralType'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ReferralSourcePerson'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/ReferralSourcePerson'), GlobalVariable.G_ReferralSourcePerson)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClientFirstName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/ClientFirstName'), GlobalVariable.G_ClientFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClientMiddle'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/ClientMiddle'), GlobalVariable.G_ClientMiddleName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClientLastName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/ClientLastName'), GlobalVariable.G_ClientLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/FollowUpCallBack'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/FollowUpCallBack'), '3')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/PhysicianName'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/PhysicianName'))

WebUI.delay(2)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/PhysicianName'), GlobalVariable.G_PhisicanName)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/li_Black Larry'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/li_Black Larry'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/SaveButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/btnNext'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/btnNext'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/DOB'), '05/23/1970')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/SSN1'), '436120560')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Medicare ID'), '123456789a')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Address'), '320 Interlocken Parkway')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/City'), 'Broomfield')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/County'), 'United States')

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/State'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/State'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/btnVerify'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/btnVerify'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/UseVerifyAddress'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PhoneType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PhoneType'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PhoneNumber'), '2345698789')

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Zone'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Zone'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactFName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactFName'), 'Scott')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactLName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactLName'), 'Ward')

WebUI.delay(2)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Relationship'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Relationship'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PhoneTypeContact'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PhoneTypeContact'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ContactPhone'), '2345698789')

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/EpisodeType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/EpisodeType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PlaceOfServices'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/PlaceOfServices'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ClientStatus'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Demographics/ClientStatus'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Demographics/btnSaveDemo'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/btnSaveDemo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Demographics/btnNextDemo'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Demographics/btnNextDemo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/PayerList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/PayerList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/PayerList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/PlanList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/PlanList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/PlanList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/GroupList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/GroupList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/GroupList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/btnSavePayer'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/btnSavePayer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/btnNextPayer'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/btnNextPayer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Reporting Groups'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Reporting Groups'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/btnSaveServices'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/btnSaveServices'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/btnNextServices'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/btnNextServices'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Admit/SOCDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/DisasterCode'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/DisasterCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Admit/DisasterCode'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/ClasificationLevel'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/ClasificationLevel'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Admit/ClasificationLevel'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/HIPAA'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/HIPAA'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Admit/HIPAA'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/QCode'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/QCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLNK-23449/Admit/QCode'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Admit/Effective Begin Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnSaveAdmit'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnSaveAdmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnAdmit'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnAdmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()


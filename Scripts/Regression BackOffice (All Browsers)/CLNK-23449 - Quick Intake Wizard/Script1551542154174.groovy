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
// import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
// import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory 
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
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

ReferralType = WebUI.getText(findTestObject('Regression BackOffice/CLNK-23449/ReferralType - Option2'))

println(ReferralType)

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

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/FollowUpCallBack'), '1')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/FUCDPlus'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/FUCDPlus'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

CallBack = WebUI.getText(findTestObject('Regression BackOffice/CLNK-23449/CallBack'))

println(CallBack)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/PhysicianName'), 50)

PhysicianName = 'CYNTHIA ABBOTT-JONES'

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

DOB = '05/23/1970'

Sexo = 'M'

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/DOB'), DOB)

WebUI.delay(3)

SSN1 = '436'

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/SSN1'), '436120560')

WebUI.delay(3)

MedId = '123456789a'

WebUI.setText(findTestObject('Regression BackOffice/CLNK-23449/Demographics/Medicare ID'), MedId)

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

CellType = WebUI.getText(findTestObject('Regression BackOffice/CLNK-23449/Validation/Phone/CellType - Option2'))

println(CellType)

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

WebUI.delay(5)

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

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/Admission Rules_chkNoPOC'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/Admission Rules_chkNoPOC'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnSaveAdmit'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnSaveAdmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnAdmit'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Admit/btnAdmit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()

// Validation  Points
WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Dots'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Dots'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Client Inquiry DataLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Client Inquiry DataLink'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/SearchClient'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/SearchClient'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/ReferralTypeValue'), 50)

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.verifyMatch(CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'(), WebUI.getAttribute(findTestObject(
            'Regression BackOffice/CLNK-23449/Validation/DateValidation'), 'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyOptionSelectedByLabel(findTestObject('Regression BackOffice/CLNK-23449/Validation/ReferralTypeValue'), ReferralType, 
    false, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(GlobalVariable.G_ReferralSourcePerson, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/ReferralSourcePerson'), 
        'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(GlobalVariable.G_ClientFirstName, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/FirstNameValidation'), 
        'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(GlobalVariable.G_ClientMiddleName, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/MiddleInitialValidation'), 
        'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(GlobalVariable.G_ClientLastName, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/LastNameValidation'), 
        'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(DOB, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/DOBValidation'), 'value'), 
    false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(Sexo, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/SexValidation'), 
        'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyMatch(SSN1, WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/SSN1Validation'), 
        'value'), false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Phone/PhoneSelected'), 50)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLNK-23449/Validation/Phone/PhoneSelected'), 0)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Phone/PhoneSelected'))

WebUI.delay(2)

WebUI.verifyOptionSelectedByLabel(findTestObject('Regression BackOffice/CLNK-23449/Validation/Phone/CellTypeValidation'), 
    CellType, false, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

CallBack2 = WebUI.getText(findTestObject('Regression BackOffice/CLNK-23449/Validation/CallBackValidation'))

WebUI.delay(5)

WebUI.verifyMatch(CallBack, CallBack2, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Dots'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Dots'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Admision/AdmissionLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Admision/AdmissionLink'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForPageLoad(50)

WebUI.delay(5)

PNameValidation = WebUI.getText(findTestObject('Regression BackOffice/CLNK-23449/Validation/Admision/PhysicianNameValidation'))

WebUI.verifyMatch(PhysicianName, PNameValidation, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Dots'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Dots'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Payer/PayerSourcesLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Payer/PayerSourcesLink'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForPageLoad(50)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/Validation/Payer/PayerSearched'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/Validation/Payer/PayerSearched'))

WebUI.delay(2)

MediValidation = WebUI.getAttribute(findTestObject('Regression BackOffice/CLNK-23449/Validation/Payer/MediValidation'), 
    'value')

WebUI.verifyMatch(MedId, MediValidation, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()


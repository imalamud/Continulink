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

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverFirst Name'), GlobalVariable.G_CaregiverFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverLast Name'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverLast Name'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/SSN'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/SSN'), GlobalVariable.G_CaregiverSSN)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverBttnSearch'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverBttnSearch'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Add a new Caregiver Link'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Add a new Caregiver Link'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/a_Use This Caregiver'), 100)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/a_Use This Caregiver'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForPageLoad(50)

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

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/First Name Caregiver'), 
    50)

not_run: WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/First Name Caregiver'), GlobalVariable.G_CaregiverFirstName)

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/Last Name Caregiver'), 
    50)

not_run: WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/Last Name Caregiver'), GlobalVariable.G_CareGiverLastName)

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/SSNCaregiver'), 
    50)

not_run: WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/SSNCaregiver'), GlobalVariable.G_CaregiverSSN)

not_run: WebUI.delay(2)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/Address/Address'), '1628 NW 6 St')

WebUI.delay(3)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/Address/City'), 'Miami')

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

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/DisciplineType'), 'P')

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/DisciplineType'), Keys.chord(Keys.ENTER))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/DisciplineType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Begin Date'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Discipline/Begin Date'), '04/24/2019')

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

WebUI.delay(5)

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Caregiver HR Details'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Caregiver HR Details'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/First Name Caregiver'), 
    50)

not_run: WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/First Name Caregiver'), GlobalVariable.G_CaregiverFirstName)

not_run: WebUI.delay(4)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/General Information/Last Name Caregiver'), 
    50)

not_run: WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/General Information/Last Name Caregiver'), GlobalVariable.G_CareGiverLastName)

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverBttnSearch'), 100)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverBttnSearch'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverLink'), 100)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/CaregiverLink'))

not_run: WebUI.delay(5)

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

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Race and Sex/Date Of Hire'), '04/24/2019')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/bttnSaveII'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/bttnSaveII'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Locations/Caregiver Locations'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Locations/Caregiver Locations'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Locations/Add New Caregiver Location'), 
    100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Locations/Add New Caregiver Location'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Locations/ZoneNameType'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Locations/ZoneNameType'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Locations/ZoneNameType'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Locations/City'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Locations/City'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Locations/a_Add To List'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Locations/a_Add To List'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Locations/_bttnSaveLocations'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Locations/_bttnSaveLocations'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/License/Caregiver Attributes'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/Caregiver Attributes'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/License/EditAttrbiute'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/EditAttrbiute'))

WebUI.delay(5)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificationType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificationType'), 'Type')

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateProfessional'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateProfessional'), 'Profesional')

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateOrganization'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateOrganization'), 'Organization')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/License Expiration Date'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/License/License Expiration Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/License Renewal Date'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/License/License Renewal Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

not_run: WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateIssuedDate'), 
    50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateIssuedDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateIssuedDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateExpirationDate'), 
    50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateExpirationDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateExpirationDate'), '12/05/2019')

WebUI.delay(2)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedDate'), 
    50)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateIssuedDate'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateIssuedDate'), 
    CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

not_run: WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedBy'), 
    50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedBy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedBy'), 'Isaac')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedDate'), 
    50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/CertificateCheckedDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/a_Add To List'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/Hoyer Lift/a_Add To List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/HIPPA Signal'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/HIPPA Signal'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/Remarks'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/Remarks'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/Remarks'), 'Remark')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/CheckedBy'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/CheckedBy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/CheckedBy'), 'Isaac')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/CheckedDate'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/CheckedDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/CheckedDate'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/a_Add To List'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Attributes/HIPAA/a_Add To List'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/License/input_State Issued _txtStateIssued'), 
    'AC')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/License Checked'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/License/License Checked'), 'Isaac')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/License Checked Date'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/License/License Checked Date'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/License/Add To List License'), 
    100)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/Add To List License'))

not_run: WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/License/_btnSaveLicense'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/License/_btnSaveLicense'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Active/Caregiver Demographics'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/Caregiver Demographics'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Active/Status'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/Status'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/Status'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/Effective DateStatus'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/Effective DateStatus'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Active/ReasonCode'), 100)

not_run: WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/ReasonCode'))

not_run: WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/ReasonCode'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/Comments'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/Comments'), 'Isaac')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK - 28718/Active/Date Check was Sent'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/Date Check was Sent'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/Date Check was Sent'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/input_Date Check Received_txtDateCheckRecvd'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/input_Date Check Received_txtDateCheckRecvd'), 
    CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/Background Check Completed'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Active/Background Check Completed'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(6)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Active/bttnSaveActive'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Active/bttnSaveActive'))

WebUI.delay(6)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Administrators'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Administrators'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Admin  System Settings'), 
    100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Admin  System Settings'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Users'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Users'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Add New User'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Add New User'))

WebUI.delay(15)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/CaregiverChkBox'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/CaregiverChkBox'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Caregiver Name'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Caregiver Name'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Caregiver Name'), GlobalVariable.G_CareGiverLastName)

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Caregiver Name'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/User Name'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/User Name'), GlobalVariable.G_CaregiverUserName)

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Password'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Password'), GlobalVariable.G_PasswordBackOffice)

WebUI.delay(3)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Confirm newPassword'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Confirm newPassword'), GlobalVariable.G_PasswordBackOffice)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Email'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Email'))

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Email'), 'imm@gmail.com')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Caregiver_chk'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/Caregiver_chk'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLINK - 28718/BannerFrame'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/_btnUserSave'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/Administrator/_btnUserSave'))

WebUI.delay(3)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Regression Clinical Edge (All Browsers)/CLNK-23349 - ContinuLink - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(60)

WebUI.delay(8)

if (WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/HereLink'), 10)) 
{

	WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/HereLink'))

	WebUI.delay(2)

	WebUI.waitForPageLoad(50)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/Current Password'), 50)

	WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/Current Password'), GlobalVariable.G_Password)

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/New Password'), 50)

	WebUI.setText(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/New Password'), GlobalVariable.G_Password)

	WebUI.delay(2)

	WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/OKButton'), 100)

	WebUI.click(findTestObject('Regression BackOffice/CLINK - 28718/ChangePassword/OKButton'))

	WebUI.delay(2)

	WebUI.acceptAlert()
}
WebUI.closeBrowser()


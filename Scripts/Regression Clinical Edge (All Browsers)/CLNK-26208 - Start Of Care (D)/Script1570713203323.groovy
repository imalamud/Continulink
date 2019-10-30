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

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/HomePage/ClientLink'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/HomePage/ClientLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'))

WebUI.selectOptionByLabel(findTestObject('Regression Clinical Edge/CLNK-23497/AssessmentList'), 'Start of care - further visits planned (D)', 
    false)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-23497/DateAssessment'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumberwithSlash'())

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-23497/SaveAssessment'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-23497/SaveAssessment'))

WebUI.delay(3)

WebUI.waitForPageLoad(50)

not_run: WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLNK-23497/AddAssessments'), 50)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/a_Start of care - further visits planned (D) (10102019)'), 
    50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/a_Start of care - further visits planned (D) (10102019)'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForPageLoad(50)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-26208/M0032NA'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0032NA'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0080'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0080'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0090'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0090'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/M0090'), GlobalVariable.G_Date)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/NextButton'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextButton'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-26208/M0102 NA'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0102 NA'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0104'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0104'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/M0104'), GlobalVariable.G_Date)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0110'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0110'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/NextII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextII'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M0140'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M0140'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1000'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1000'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1005'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1005'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/M1005'), GlobalVariable.G_Date)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/NextIII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextIII'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1100 II'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1100 II'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1100 III'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1100 III'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/NextIV'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextIV'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1060'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1060'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Regression Clinical Edge/CLINK-26208/NextV'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextV'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1200'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1200'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1242'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1242'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/NextVI'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextVI'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1306'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1306'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1322'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1322'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1324NA'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1324NA'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1330'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1330'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1340'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1340'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/NextVII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/NextVII'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1400'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1400'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next8'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next8'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next9'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next9'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1600'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1600'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1610'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1610'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1620'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1620'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1630'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1630'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next10'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next10'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next11'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next11'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1870'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1870'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next12'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1700'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1700'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1710'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1710'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1720'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1720'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1730'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1730'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1740'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1740'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1745'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1745'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next15'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next15'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next16'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next16'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1860)_rad_6154_19066'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1860)_rad_6154_19066'))

WebUI.delay(5)

WebUI.waitForImagePresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1850)_rad_6153_19065'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1850)_rad_6153_19065'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1840)_rad_6151_19063'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1840)_rad_6151_19063'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1845)_rad_6152_19064'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1845)_rad_6152_19064'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1830)_rad_6150_19062'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1830)_rad_6150_19062'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1810)_rad_6148_19060'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1810)_rad_6148_19060'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1820)_rad_6149_19061'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1820)_rad_6149_19061'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1800)_rad_6147_19059'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/input_(M1800)_rad_6147_19059'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next17'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next17'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M2001'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M2001'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M2010'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M2010'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M2020'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M2020'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M2030'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M2030'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next18'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next18'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG0100'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG0100'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG100b'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG100b'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG100c'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG100c'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG100d'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG100d'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG110ANo'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG110ANo'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG110BNo'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG110BNo'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG110CNo'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG110CNo'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG110DNo'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG110DNo'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG110ENo'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG110ENo'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG110Z'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG110Z'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/G0130SOCII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/G0130SOCII'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/G0130SOCII'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/G0130GoalII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/G0130GoalII'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/G0130GoalII'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG0170'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG0170'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/GG0170'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/GG170No'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/GG170No'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1021Severity'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1021Severity'))

WebUI.delay(5)

WebUI.waitForImagePresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1028'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1028'))

WebUI.delay(5)

WebUI.waitForImagePresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1030'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1030'))

WebUI.delay(5)

WebUI.waitForImagePresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1033'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1033'))

WebUI.delay(5)

WebUI.waitForImagePresent(findTestObject('Regression Clinical Edge/CLINK-26208/M1910'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/M1910'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForImagePresent(findTestObject('Regression Clinical Edge/CLINK-26208/M2200'), 50)

WebUI.setText(findTestObject('Regression Clinical Edge/CLINK-26208/M2200'), '23')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Next19'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/SaveButton'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/SaveButton'))

WebUI.delay(10)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/div_SignSubmit'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/div_SignSubmit'))

WebUI.delay(5)

WebUI.waitForPageLoad(30)

not_run: WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Comprehensive Validation'), 50)

not_run: WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Comprehensive Validation'))

not_run: WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/OkButton'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/OkButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Accept'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Accept'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Continue to Signature'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/Continue to Signature'))

WebUI.delay(3)

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/Signature'), 50)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLINK-26208/Signature'), 'qwerty')

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLINK-26208/OkButtonII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLINK-26208/OkButtonII'))

WebUI.delay(15)


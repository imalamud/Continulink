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

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/a_Medication'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/a_Medication'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationName'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationName'))

WebUI.delay(2)

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationName'), 'IBUPROFEN')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationName'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationStarted'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationStarted'))

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/MedicationStarted'), CustomKeywords.'getDate.DateUtilities.getDateMonthDayYearNumber'())

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/StatusList'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/StatusList'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/StatusList'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/FrequencyI'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/FrequencyI'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/FrequencyI'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/FrequencyII'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/FrequencyII'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/FrequencyII'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/SaveMedication'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/SaveMedication'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/a_Administration'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/a_Administration'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Administration/NurseRol'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Administration/NurseRol'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Administration/SaveAdmin'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Administration/SaveAdmin'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/a_Review'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/a_Review'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes1'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes1'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes2'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes2'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes3'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes3'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes4'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes4'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes5'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes5'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes6'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes6'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes7'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/Yes7'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/SaveReview'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/SaveReview'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/ConfirmPassword'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/ConfirmPassword'))

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-13514/Review/ConfirmPassword'), GlobalVariable.G_Password)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Review/button_Ok'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Review/button_Ok'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/a_Infusion'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/a_Infusion'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Infusion/Quantity'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Infusion/Quantity'))

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-13514/Infusion/Quantity'), '10')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Infusion/SaveInfusion'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Infusion/SaveInfusion'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/a_Oxygen'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/a_Oxygen'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Oxygen/LPMOxygen'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Oxygen/LPMOxygen'))

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-13514/Oxygen/LPMOxygen'), '10')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Oxygen/SaveOxigen'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Oxygen/SaveOxigen'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/a_Pharmacy'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/a_Pharmacy'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/pharmacyName'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/pharmacyName'))

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/pharmacyName'), 'Pharmacy Test')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/pharmacyPhone'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/pharmacyPhone'))

WebUI.setText(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/pharmacyPhone'), '5555558888')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/SavePharmacy'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Pharmacy/SavePharmacy'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Medication/AddMedicationButton'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/a_Allergy'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/a_Allergy'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Allergy/DrugClass'), 50)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Allergy/DrugClass'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression Clinical Edge/CLNK-13514/Allergy/DrugClass'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression Clinical Edge/CLNK-13514/Allergy/SaveAllergy'), 100)

WebUI.click(findTestObject('Regression Clinical Edge/CLNK-13514/Allergy/SaveAllergy'))

WebUI.delay(5)


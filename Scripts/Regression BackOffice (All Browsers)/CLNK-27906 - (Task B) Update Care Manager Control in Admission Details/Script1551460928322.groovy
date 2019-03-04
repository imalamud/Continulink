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

WebUI.callTestCase(findTestCase('Regression BackOffice (All Browsers)/Login/Verify Successful Login Backoffice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/AdmissionDetails'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/AdmissionDetails'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/Last NameAdmission'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 27906/Last NameAdmission'), GlobalVariable.G_LastNameAdd)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/ClinicalManagersLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/ClinicalManagersLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/AddNewClinicalManagerLink'), 60)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/SameCareManagerChk'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/SameCareManagerChk'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/SameCareManagerChk'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/SameCareManagerChk'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/AddNewClinicalManagerLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/AddNewClinicalManagerLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/Id'), 60)

WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/CareManagerName'), 60)

WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/Discipline'), 60)

WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/Delete'), 60)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/ClinicalManagerNameText'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK - 27906/ClinicalManagerNameText'), GlobalVariable.G_ClinicalManager)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/li_Admin'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/li_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/AddToListLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/AddToListLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/DeleteIcon'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/DeleteIcon'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)


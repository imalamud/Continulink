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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/ClientLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/ClientLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/PayerLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/PayerLink'))

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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/PatientList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/PatientList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/PatientList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/PatientID'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/PatientID'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-23451/PatientID'), '2345')

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-23451/MedicareAdminList'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-23451/btnSave'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-23451/btnSave'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)


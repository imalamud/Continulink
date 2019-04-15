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

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/AdministratorsTab'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/AdministratorsTab'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/AdminSystemSettingsLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/AdminSystemSettingsLink'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-27759/AdministratorReportsLink'), 50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/AdministratorReportsLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/AdministratorReportsLink'))

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/RoleAccessSecurityReportLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/RoleAccessSecurityReportLink'))

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/DemoDemoChk'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/DemoDemoChk'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'), 50)

WebUI.focus(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'))

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'))

WebUI.setText(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'), GlobalVariable.G_SpecificUser)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ShowReportLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ShowReportLink'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'), 50)

WebUI.focus(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'))

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ExportToFile'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ExportToFile'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/Demo_DemoObject'), 50)

WebUI.verifyElementPresent(findTestObject('Regression BackOffice/CLINK-27759/Demo_DemoObject'), 30)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ResetLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ResetLink'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/DemoDemoChk'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/DemoDemoChk'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'), 50)

WebUI.focus(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'))

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'))

WebUI.setText(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'), 'Test')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-27759/SpecificUser'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ShowReportLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ShowReportLink'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'), 50)

WebUI.focus(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'))

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Regression BackOffice/CLINK-27759/ExportToLink'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-27759/ExportToFile'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-27759/ExportToFile'))

WebUI.delay(2)

WebUI.closeBrowser()


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

WebUI.callTestCase(findTestCase('Regression BackOffice (All Browsers)/CLNK-23439 - Clink - Back office Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

if (WebUI.verifyElementVisible(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'))== true)
{
	WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'))

	WebUI.delay(2)
}else
{
			WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'), 100)

			WebUI.click(findTestObject('Regression BackOffice/CLNK-23449/ClienIntakeICon'))

			WebUI.delay(2)

			WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'), 50)

			WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/SearchforaClient'))

			WebUI.delay(2)
}

WebUI.waitForPageLoad(50)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/FirstNameSearch'), GlobalVariable.G_ClientFirstName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/LastNameSearch'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLNK-10235/LastNameSearch'), GlobalVariable.G_ClientLastName)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/SearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK - 27906/ClientRollbackLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameLeft'), 30)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/Puntitos'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/Puntitos'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForPageLoad(50)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLNK-10235/ClientIntakeClose'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLNK-10235/ClientIntakeClose'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-10620/ClinicalLink'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-10620/ClinicalLink'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Regression BackOffice/CLINK-10620/Medication ProfileLink'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-10620/Medication ProfileLink'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Regression BackOffice/CLNK-23449/FrameMain'), 30)

WebUI.waitForPageLoad(50)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-10620/MedboxChk'), 100)

WebUI.click(findTestObject('Regression BackOffice/CLINK-10620/MedboxChk'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-10620/AddAPharmacy.'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-10620/AddAPharmacy.'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Regression BackOffice/CLINK-10620/PharmacyName'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-10620/PharmacyName'), 'Lo encontre')

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Regression BackOffice/CLINK-10620/PharmacyPhone'), 50)

WebUI.setText(findTestObject('Regression BackOffice/CLINK-10620/PharmacyPhone'), '4586957555')

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Regression BackOffice/CLINK-10620/SaveButton'), 50)

WebUI.click(findTestObject('Regression BackOffice/CLINK-10620/SaveButton'))

WebUI.delay(2)

WebUI.closeBrowser()


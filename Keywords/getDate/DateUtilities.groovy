package getDate

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class DateUtilities {

	@Keyword
	def getDateDayNumber(){
		def date = new Date()
		String newDate = date.format( 'dd' )
		newDate
	}
	@Keyword
	def getDateMonthNumber(){
		def date = new Date()
		String newDate = date.format( 'MM' )
		newDate
	}
	@Keyword
	def getDateYearNumber(){
		def date = new Date()
		String newDate = date.format( 'yyyy' )
		newDate
	}
	@Keyword
	def getDateDayMonthNumber(){
		def date = new Date()
		String newDate = date.format( 'ddMM' )
		newDate
	}
	@Keyword
	def getDateDayMonthYearNumber(){
		def date = new Date()
		String newDate = date.format( 'ddMMyyyy' )
		newDate
	}
	@Keyword
	def getDateMonthDayYearNumber(){
		def date = new Date()
		String newDate = date.format( 'MMddyyyy' )
		newDate
	}
	@Keyword
	def getDateMonthDayYearNumberwithSlash(){
		def date = new Date()
		String newDate = date.format( 'MM/dd/yyyy' )
		newDate
	}
}
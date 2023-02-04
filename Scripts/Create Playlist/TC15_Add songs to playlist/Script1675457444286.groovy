import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Pre-Condition/Precondition_Succesfully Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Playlist/Add songs inside playlist/div_Liked Songs_AINMAUImkAYJd4ertQxy'))

if (WebUI.waitForElementPresent(findTestObject('Create Playlist/Add songs inside playlist/input_concat(Let, , s find something for your playlist)_Type__TypeElement-sc-goli3j-0 hGXzYa FeWwGSRANj36qpOBoxdx'), 3, FailureHandling.OPTIONAL) == true) {
	WebUI.setText(findTestObject('Create Playlist/Add songs inside playlist/input_concat(Let, , s find something for your playlist)_Type__TypeElement-sc-goli3j-0 hGXzYa FeWwGSRANj36qpOBoxdx'),
		'begadang')
} else {
	WebUI.click(findTestObject('Object Repository/Create Playlist/Add songs inside playlist/Find More'))
	WebUI.setText(findTestObject('Create Playlist/Add songs inside playlist/input_concat(Let, , s find something for your playlist)_Type__TypeElement-sc-goli3j-0 hGXzYa FeWwGSRANj36qpOBoxdx'),
		'begadang')
}

WebUI.click(findTestObject('Create Playlist/Add songs inside playlist/button_Add'))

WebUI.verifyElementVisible(findTestObject('Create Playlist/Add songs inside playlist/div_1BegadangRhoma IramaBacain 0 seconds309'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()


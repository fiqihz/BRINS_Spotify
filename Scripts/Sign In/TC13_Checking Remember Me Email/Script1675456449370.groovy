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

WebUI.callTestCase(findTestCase('Pre-Condition/Precondition_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Sign In/input_Email address or username_login-username'), 'testing.brins@gmail.com')

WebUI.setText(findTestObject('Sign In/input_Password_login-password'), 'testingbrins!')

WebUI.click(findTestObject('Sign In/div_Log In'))

WebUI.click(findTestObject('Dashboard/svg_Testing Brins_Svg-sc-ytk21e-0 uPxdw eAXFT6yvz37fvS1lmt6k'))

WebUI.click(findTestObject('Dashboard/button_Log out'))

WebUI.click(findTestObject('Sign In/span_Log in'))

WebUI.verifyTextNotPresent('testing.brins@gmail.com', false)

WebUI.closeBrowser()
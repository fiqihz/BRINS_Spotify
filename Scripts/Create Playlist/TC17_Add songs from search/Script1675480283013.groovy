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

WebUI.click(findTestObject('Create Playlist/Add songs from search/a_Search'))

WebUI.setText(findTestObject('Create Playlist/Add songs from search/input__Type__TypeElement-sc-goli3j-0 hGXzYa QO9loc33XC50mMRUCIvf'), 
    'Indonesia Raya')

WebUI.click(findTestObject('Create Playlist/Add songs from search/svg_Merpati Choir_Svg-sc-ytk21e-0 uPxdw'))

WebUI.mouseOver(findTestObject('Create Playlist/Add songs from search/button_Add to playlist'))

WebUI.click(findTestObject('Create Playlist/Add songs from search/button_My Playlist 1'))

WebUI.delay(2)

WebUI.closeBrowser()


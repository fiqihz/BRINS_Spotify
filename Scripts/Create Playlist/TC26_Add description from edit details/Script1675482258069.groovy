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

WebUI.click(findTestObject('Create Playlist/Change name from playlist title/div_Liked Songs_AINMAUImkAYJd4ertQxy'))

WebUI.click(findTestObject('Create Playlist/Change name from edit details/svg_Testing Brins_Svg-sc-ytk21e-0 uPxdw'))

WebUI.click(findTestObject('Create Playlist/Change name from edit details/span_Edit details'))

WebUI.setText(findTestObject('Create Playlist/Create Playlist/textarea_Description_f0GjZQZc4c_bKpqdyKbq c0CddR8wF7kDxvU6uM8B'), 
    'Deskripsi playlist')

WebUI.click(findTestObject('Create Playlist/Change name from edit details/span_Save'))

WebUI.delay(2)

WebUI.closeBrowser()


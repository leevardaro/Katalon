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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea__q'), 'katalon')

WebUI.click(findTestObject('Object Repository/Page_katalon - Google Search/h3_Katalon AI-augmented Software Quality Ma_052690'))

WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/button_Reject All'))

WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Platform'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Katalon TestOps'))

WebUI.click(findTestObject('Object Repository/Page_Katalon AI-augmented Software Quality _596167/div_Katalon TestOps'))

WebUI.click(findTestObject('Object Repository/Page_Katalon TestOps  Test Planning, Manage_fbbf2f/h1_Katalon TestOps'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Katalon TestOps  Test Planning, Manage_fbbf2f/h1_Katalon TestOps'), 
    'Katalon TestOps')

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.closeBrowser()


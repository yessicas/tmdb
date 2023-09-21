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
import java.lang.String as String
import java.lang.StringBuffer as StringBuffer

WebUI.click(findTestObject('Object Repository/Page_top_TMDB/imgLogoHeader'))

WebUI.click(findTestObject('Object Repository/Page_HomeTMDB/imgDetailing/divActionBurgerButton'))

WebUI.verifyElementPresent(findTestObject('Page_HomeTMDB/imgDetailing/favoriteButtonHomepage'), 0)

WebUI.click(findTestObject('Page_HomeTMDB/imgDetailing/favoriteButtonHomepage'))

WebUI.verifyTextPresent('Success', false)

WebUI.verifyTextPresent('A Million Miles Away was added to your favourite list.', false)

WebUI.delay(5)

WebUI.click(findTestObject('Page_UserProfileTMDB/spanUserProfileButton'))

WebUI.mouseOver(findTestObject('Page_My Profile  The Movie Database (TMDB)/p_Discussions'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_UserProfileTMDB/viewProfileButton'))

WebUI.click(findTestObject('Object Repository/Page_UserProfileTMDB/OverviewAction/spanOverviewListButton'))

WebUI.waitForElementPresent(findTestObject('Page_UserProfileTMDB/OverviewAction/spanOverviewtoFavoritesListButton'), 3)

WebUI.click(findTestObject('Object Repository/Page_UserProfileTMDB/OverviewAction/spanOverviewtoFavoritesListButton'))

WebUI.verifyTextPresent('Favorite', false)

WebUI.waitForElementPresent(findTestObject('Page_UserProfileTMDB/OverviewAction/overviewToFavoriteToMovieListButton'), 3)

WebUI.verifyTextPresent('Movie', false)

WebUI.doubleClick(findTestObject('Page_UserProfileTMDB/OverviewAction/overviewToFavoriteToMovieListButton'))

WebUI.click(findTestObject('Object Repository/Page_DetailMovieTMDB/divDescMovieAMillionMilesAway'))

WebUI.closeBrowser()


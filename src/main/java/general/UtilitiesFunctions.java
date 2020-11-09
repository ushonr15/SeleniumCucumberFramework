package general;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

public class UtilitiesFunctions {
	public static HashMap<String, String> hmap = new HashMap<String, String>();

	public static String getValue(String key) throws IOException {
		Properties properrtyObj = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Piyush\\eclipse-workspace\\SeleniumCucumber\\src\\test\\java\\data.properties");
		properrtyObj.load(fis);

		return properrtyObj.getProperty(key);

	}

	public static String getRandomString(String value) {
		Random rnd = new Random();
		String randomString;
		String randomNoInString = Integer.toString(rnd.nextInt(1000000));

		if (!value.contains("%u")) {
			randomString = value;
		} else if (hmap.containsKey(value)) {
			randomString = hmap.get(value);
		} else {
			randomString = value.replace("%u", randomNoInString);
			hmap.put(value, randomString);
		}
		return randomString;
	}
	/*
	 * public String copyReport() throws InterruptedException { File sourceDir = new
	 * File("D:\\Selenium_All\\SeleniumCucumber\\Report"); Desktop d =
	 * Desktop.getDesktop(); Random rnd = new Random(); String randomNoInString =
	 * Integer.toString(rnd.nextInt(1000000));
	 * 
	 * String dir = "D:\\Selenium_All\\SeleniumCucumber\\SharedReports\\jvm_Result_"
	 * + randomNoInString; System.out.println(dir); File destDir = new File(dir);
	 * 
	 * try { UtilitiesFunctions.copyDirectory(sourceDir, destDir);
	 * Thread.sleep(5000); d.browse(new URI("http://localhost/jvm_Result_" +
	 * randomNoInString + "/cucumber-html-reports/overview-features.html")); } catch
	 * (IOException ex) { ex.printStackTrace(); } catch (URISyntaxException e) {
	 * 
	 * e.printStackTrace(); } return dir; }
	 * 
	 * /** Copy a whole directory to another location.
	 * 
	 * @param sourceDir a File object represents the source directory
	 * 
	 * @param destDir a File object represents the destination directory
	 * 
	 * @throws IOException thrown if IO error occurred.
	 */
	/*
	 * public static void copyDirectory(File sourceDir, File destDir) throws
	 * IOException { // creates the destination directory if it does not exist if
	 * (!destDir.exists()) { destDir.mkdirs(); }
	 * 
	 * // throws exception if the source does not exist if (!sourceDir.exists()) {
	 * throw new IllegalArgumentException("sourceDir does not exist"); }
	 * 
	 * // throws exception if the arguments are not directories if
	 * (sourceDir.isFile() || destDir.isFile()) { throw new
	 * IllegalArgumentException("Either sourceDir or destDir is not a directory"); }
	 * 
	 * copyDirectoryImpl(sourceDir, destDir); }
	 */
	/**
	 * Internal implementation of the copy method.
	 * 
	 * @param sourceDir a File object represents the source directory
	 * @param destDir   a File object represents the destination directory
	 * @throws IOException thrown if IO error occurred.
	 */
	/*
	 * public static void copyDirectoryImpl(File sourceDir, File destDir) throws
	 * IOException { File[] items = sourceDir.listFiles(); if (items != null &&
	 * items.length > 0) { for (File anItem : items) { if (anItem.isDirectory()) {
	 * // create the directory in the destination File newDir = new File(destDir,
	 * anItem.getName()); System.out.println("CREATED DIR: " +
	 * newDir.getAbsolutePath()); newDir.mkdir();
	 * 
	 * // copy the directory (recursive call) copyDirectory(anItem, newDir); } else
	 * { // copy the file File destFile = new File(destDir, anItem.getName());
	 * copySingleFile(anItem, destFile); } } } }
	 */

	/**
	 * Copy a file from a location to another
	 * 
	 * @param sourceFile a File object represents the source file
	 * @param destFile   a File object represents the destination file
	 * @throws IOException thrown if IO error occurred.
	 */
	/*
	 * public static void copySingleFile(File sourceFile, File destFile) throws
	 * IOException { System.out.println("COPY FILE: " + sourceFile.getAbsolutePath()
	 * + " TO: " + destFile.getAbsolutePath()); if (!destFile.exists()) {
	 * destFile.createNewFile(); }
	 * 
	 * FileChannel sourceChannel = null; FileChannel destChannel = null;
	 * 
	 * try { sourceChannel = new FileInputStream(sourceFile).getChannel();
	 * destChannel = new FileOutputStream(destFile).getChannel();
	 * sourceChannel.transferTo(0, sourceChannel.size(), destChannel); } finally {
	 * if (sourceChannel != null) { sourceChannel.close(); } if (destChannel !=
	 * null) { destChannel.close(); } } }
	 */

}

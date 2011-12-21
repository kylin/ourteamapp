package com.ourteam.app;

import net.ui.eclipse.ImageChache;

import org.eclipse.swt.graphics.Image;

public class SharedImage {

	private static final String SEARCH_IMG = "search";
	
	private static final String CLEAR_IMG = "clear";
	
	
	public static Image getSearchImage(){
		return ImageChache.getImage(SEARCH_IMG);
	}
	
	public static Image getClearImage(){
		return ImageChache.getImage(CLEAR_IMG);
	}
}

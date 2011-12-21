package net.ui.eclipse;

import java.util.HashMap;
import java.util.Map;

import net.ui.UIConfigFactory;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class ImageChache {

	private static final Map<String, Image> IMAGE_CHACHE = new HashMap<String, Image>();
	
	public static ImageDescriptor getImageDescriptor(String aImagePath){
		return ImageDescriptor.createFromImage(getImage(aImagePath));
	}

	public static Image getImage(String aImagePath) {
		
		
		if (IMAGE_CHACHE.containsKey(aImagePath) == false) {
			
			String imagePath = UIConfigFactory.getInstance().getIconConfig(aImagePath);
			
			if(StringUtils.isNotBlank(imagePath)){
				aImagePath = imagePath;
			}
			
			Image image = ImageDataDescriptor.createFromFile(ImageChache.class,
					aImagePath).createImage();

			IMAGE_CHACHE.put(aImagePath, image);

		}

		Image image = IMAGE_CHACHE.get(aImagePath);

		if (image.isDisposed()) {
			IMAGE_CHACHE.remove(aImagePath);
			return getImage(aImagePath);
		} else {
			return image;
		}

	}
}

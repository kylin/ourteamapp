/*
 * 创建日期 2005-5-19
 *
 */
package net.ui.eclipse;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;


/**
 * @author qilin
 *
 */
public class ImageDataDescriptor extends ImageDescriptor {
    
    private ImageData imageData;

    /**
     * 
     */
    public ImageDataDescriptor(ImageData aImageData) {
        super();
        imageData = aImageData;
    }
    /* （非 Javadoc）
     * @see org.eclipse.jface.resource.ImageDescriptor#getImageData()
     */
    public ImageData getImageData() {
        return imageData;
    }

}

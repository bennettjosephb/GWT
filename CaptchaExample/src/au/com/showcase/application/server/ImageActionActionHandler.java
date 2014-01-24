package au.com.showcase.application.server;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;

import au.com.showcase.application.client.ImageAction;
import au.com.showcase.application.client.ImageActionResult;

import com.google.gwt.user.server.Base64Utils;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class ImageActionActionHandler implements
		ActionHandler<ImageAction, ImageActionResult> {

	@Inject
	public ImageActionActionHandler() {
	}

	@Override
	public ImageActionResult execute(ImageAction action,
			ExecutionContext context) throws ActionException {
		System.out.println("" + action.getImage());

		ImageActionResult imageActionResult = new ImageActionResult(
				encodeasBase64());

		return imageActionResult;
	}

	public String getImageData() {
		byte[] res = null;
		try {
			BufferedImage image = ImageIO
					.read(new File(
							"D:/PFG_Applications/workspace/CaptchaExample/war/WEB-INF/icon.jpg"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image, "png", baos);
			res = baos.toByteArray();
			String encodedImage = null;// Base64.encode(baos.toByteArray());
			// System.out
			// .println("The encoded image byte array is shown below.Please use this in your webpage image tag.\n"
			// + encodedImage);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem has occurred. Please try again");
		}

		String base64 = Base64Utils.toBase64(res);
		base64 = "data:image/png;base64," + base64;
		System.out.println(base64);
		return base64;
	}

	public String encodeasBase64() {
		byte[] res = null;
		try {
			BufferedImage image = ImageIO
					.read(new File(
							"D:/PFG_Applications/workspace/CaptchaExample/war/images/icon.jpg"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image, "png", baos);
			res = baos.toByteArray();
			String encodedImage = null;// Base64.encode(baos.toByteArray());
			// System.out
			// .println("The encoded image byte array is shown below.Please use this in your webpage image tag.\n"
			// + encodedImage);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some problem has occurred. Please try again");
		}
		StringBuilder imageDataAsbase64String = new StringBuilder();
		String encodedString = new String(Base64.encodeBase64(res));

		imageDataAsbase64String.append("data:image/jpg;base64,");

		imageDataAsbase64String.append(encodedString);

		return imageDataAsbase64String.toString();
	}

	@Override
	public void undo(ImageAction action, ImageActionResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<ImageAction> getActionType() {
		return ImageAction.class;
	}
}

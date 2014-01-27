package com.javacodegeeks.captcha.server.servlet;

import static nl.captcha.Captcha.NAME;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nl.captcha.Captcha;
import nl.captcha.backgrounds.BackgroundProducer;
import nl.captcha.backgrounds.GradiatedBackgroundProducer;
import nl.captcha.gimpy.DropShadowGimpyRenderer;
import nl.captcha.servlet.CaptchaServletUtil;
import nl.captcha.servlet.SimpleCaptchaServlet;
import nl.captcha.text.producer.DefaultTextProducer;
import nl.captcha.text.producer.TextProducer;

public class ExtendedCaptchaServlet extends SimpleCaptchaServlet {

	private static final long serialVersionUID = 6560171562324177699L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		HttpSession session = req.getSession();

		TextProducer textProducer = new TextProducer() {

			@Override
			public String getText() {

				return "Hai";
			}
		};

		BackgroundProducer backgroundProducer = new BackgroundProducer() {

			@Override
			public BufferedImage getBackground(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BufferedImage addBackground(BufferedImage arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};

		// DefaultTextProducer

		Captcha captcha = new Captcha.Builder(_width, _height)
				.addText(new DefaultTextProducer(9))
				.addBackground(new GradiatedBackgroundProducer())
				.gimp(new DropShadowGimpyRenderer()).addNoise().addBorder()
				.build();

		session.setAttribute(NAME, captcha);
		CaptchaServletUtil.writeImage(resp, captcha.getImage());

	}
}

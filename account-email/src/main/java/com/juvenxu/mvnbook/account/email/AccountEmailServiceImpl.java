package com.juvenxu.mvnbook.account.email;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by huifeng.hxl on 2014/8/19.
 */
public class AccountEmailServiceImpl implements AccountEmailService {

    private JavaMailSender javaMailSender;

    private String systemEmail;

    @Override
    public void sendEmail(String to, String subject, String htmlText) throws AccountEmailException {

        try {
            MimeMessage msg = javaMailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
            msgHelper.setFrom(systemEmail);
            msgHelper.setTo(to);
            msgHelper.setSubject(subject);
            msgHelper.setText(htmlText, true);
            javaMailSender.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new AccountEmailException("Failed to send email.", e);
        }

    }

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public String getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }
}

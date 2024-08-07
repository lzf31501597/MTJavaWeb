package com.itheima.service.impl;

import com.itheima.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author
 * @version 1.0
 * @date 2024/07/30 17:19
 * @description
 */

@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    private String from = "315001597@qq.com";
    private String to = "lzf2586@gmail.com";
    private String subject = "测试邮件";
    // private String context = "测试邮件正文内容";
    // private String context = "<a href='https://www.itcast.cn'>点开有惊喜</a>";
    // private String context = "<img src='http://img.netbian.com/file/2024/0716/212518Dk2Ab.jpg'>点开有惊喜</img>";
    private String context = "<img src='/Users/dreamtank77/IdeaProjects/springboot2/springboot_23_mail/src/main/resources/img.png'></img>";

    @Override
    public void sendMail() {

/*         SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(context); */

        MimeMessage mimeMessage = null;
        try {
            mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(from); // + "(小甜甜)"
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(context, true);

            File f1 = new File("/Users/dreamtank77/IdeaProjects/springboot2/springboot_23_mail/target/springboot_23_mail-0.0.1-SNAPSHOT.jar");
            File f2 = new File("/Users/dreamtank77/IdeaProjects/springboot2/springboot_23_mail/src/main/resources/img.png");

            mimeMessageHelper.addAttachment(f1.getName(), f1);
            mimeMessageHelper.addAttachment("xianni.png", f2);

            //javaMailSender.send(mimeMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);

    }
}

package top.wingcloud.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.wingcloud.api.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {



    @Autowired
    private MailService mailService;

    @Test
    public void testSimpleMail() {
        mailService.sendSimpleMail("xljpublic@sina.com","这是一封简单邮件","大家好，这是我的第一封邮件！");
    }

}

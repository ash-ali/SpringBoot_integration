package top.wingcloud.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.wingcloud.api.service.MailService;

/**
 * @author: linjie
 * @description: 请求处理控制器
 * @create: 2018/09/18 21:23
 */
@Controller
public class WingCloudController {
    @Autowired
    private MailService mailService;

    /*
     * 调用发送邮件接口
     */
    @RequestMapping("/sendmail")
    public String SendMail(){
        mailService.sendSimpleMail("932834897@qq.com","这是一封邮件","这是邮件的内容");
        return "ok";
    }
}

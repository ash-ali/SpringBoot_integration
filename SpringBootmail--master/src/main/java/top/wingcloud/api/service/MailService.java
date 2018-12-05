package top.wingcloud.api.service;

/**
 * @author: linjie
 * @description: 邮件服务接口
 * @create: 2018/09/18 21:08
 */
public interface MailService {

    /*
     * 发送邮件接口
     */
    void sendSimpleMail(String to, String subject, String content);
}

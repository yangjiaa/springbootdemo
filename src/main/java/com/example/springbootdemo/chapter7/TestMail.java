package com.example.springbootdemo.chapter7;

import com.example.springbootdemo.chapter7.core.MailSender;
import com.example.springbootdemo.chapter7.enums.MailContentTypeEnum;

import java.util.ArrayList;

public class TestMail {
    public static void main(String[] args) throws Exception
    {
        new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送2")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("yangjia8651@dingtalk.com");
                    add("302831892@qq.com");
                }})
                .send();
    }
}

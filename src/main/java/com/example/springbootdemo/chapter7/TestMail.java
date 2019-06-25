package com.example.springbootdemo.chapter7;

public class TestMail {
    public static void main(String[] args) throws Exception {
//        StringJoiner joiner = new StringJoiner(",");
//        System.out.println(joiner.add("a").add(null).add("c"));
       /* new MailSender()
                .title("测试SpringBoot发送邮件")
                .content("简单文本内容发送2")
                .contentType(MailContentTypeEnum.TEXT)
                .targets(new ArrayList<String>(){{
                    add("yangjia8651@dingtalk.com");
                    add("302831892@qq.com");
                }})
                .send();*/
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i] = i;
        }
        System.out.println("数组长度：" + a.length + System.currentTimeMillis());
       // Binary_Search(a, 10000, 299);
        System.out.println("==="+ Binary_Search(a, 10000, 299));

    }

    static int Binary_Search(int[] a, int n, int key) {
        int low, high, mid;
        int index = -1;
        low = 1;     /*定义最底下标为记录首位*/
        high = n;    /*定义最高下标为记录末位*/
        while (low <= high) {
            mid = (low + high) / 2;    /*折半*/
            if (key < a[mid])
                high = mid - 1;
            if (key > a[mid])
                low = mid + 1;
            else if (a[mid] == key) {
                System.out.println(System.currentTimeMillis());
                index = mid;
                return mid;
            }
        }

        return index;
    }

}

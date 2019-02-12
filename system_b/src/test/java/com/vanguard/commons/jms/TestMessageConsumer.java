package com.vanguard.commons.jms;

import com.vanguard.SystemBApplicationTest;
import com.vanguard.commons.jms.MessageConsumer;
import com.vanguard.commons.jms.MessageObject;
import com.vanguard.domain.Test1;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/02/12
 */
public class TestMessageConsumer extends SystemBApplicationTest {

    @Autowired
    private MessageConsumer messageConsumer;

    @Test
    public void test1() {
        Test1 test1 = new Test1();
        test1.setName("Tom");
        test1.setAge(30);
        test1.setSex("男");
        MessageObject messageObject = new MessageObject("test1", "add", test1);
        messageConsumer.synchronousData(messageObject);
    }
}

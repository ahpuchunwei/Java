package com.jxnu.app.util;

import junit.framework.Assert;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

public class InterfaceToMockTest
{ 
    @Test
    public void test1()
{

InterfaceToMock mockInstance = new MockUp<InterfaceToMock>()
{ 
    @Mock
    public String method1()
{ 
    return "beMocked";
}
}.getMockInstance();

    Assert.assertNotNull(mockInstance);

    Assert.assertEquals("beMocked", mockInstance.method1());

    Assert.assertEquals(0, mockInstance.method2());
}

@Test
public void test2()
        {
        InterfaceToMock mockInstance = new MockUp<InterfaceToMock>()
        {
// 需要使用@Mock标记,否则jmockit不会处理;
//而且方法的签名必须与接口中方法签名一致，否则jmockit会报错
public String method1()
        {
        return "beMocked";
        }
        }.getMockInstance();
        Assert.assertNotNull(mockInstance);
        Assert.assertEquals(null, mockInstance.method1());
        }
        }
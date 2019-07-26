# 用java实现责任链设计模式

[![Build status](https://travis-ci.org/iluwatar/java-design-patterns.svg?branch=master)](https://travis-ci.org/iluwatar/java-design-patterns)
[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/LICENSE.md)
[![Join the chat at https://gitter.im/iluwatar/java-design-patterns](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/iluwatar/java-design-patterns?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=com.iluwatar%3Ajava-design-patterns&metric=alert_status)](https://sonarcloud.io/dashboard/index/com.iluwatar%3Ajava-design-patterns)

# 介绍

责任链模式
        让链上得每个对象做好自己的任务，将不能完成的工作推给下一个责任类去完成。
        使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
        将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
这是这个设计模式的基本，该demo是基于这个设计模式的变种，叫做管道模型。
然后基于常见的下单业务场景运用这个管道模型，流程图和设计图还有少量代码截图如下。
如果图片文件失效项目中也会有

# 项目截图

![图片说明]( https://cymagic.oss-cn-shanghai.aliyuncs.com/file/2018/10/16/0.png "图片说明")
![图片说明]( https://cymagic.oss-cn-shanghai.aliyuncs.com/file/2018/10/16/1.png "图片说明")
![图片说明]( https://cymagic.oss-cn-shanghai.aliyuncs.com/file/2018/10/16/2.png "图片说明")
![图片说明]( https://cymagic.oss-cn-shanghai.aliyuncs.com/file/2018/10/16/3.png "图片说明")
![图片说明]( https://cymagic.oss-cn-shanghai.aliyuncs.com/file/2018/10/16/4.png "图片说明")


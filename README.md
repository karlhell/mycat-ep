# mycat-ep
采用bootstrap + spring-boot

目前是动静分离的，所以部署测试上会有点复杂。

部署：

1、mvn install mycat-mvc工程

2、构建后的jar包放到服务器上

3、运行jar，端口8123

4、mycat-ep-html 部署到nginx里

5、nginx 反向代理8123

6、就可以访问并从mycat-mvc获取数据呈现了



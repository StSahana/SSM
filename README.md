# SSM

## 项目说明

SpringMVC+Spring4+Mybatis3框架搭建demo，完成了框架的整合

## 配置说明

- 数据库连接使用的本地数据库，数据库的连接配置文件在src/main/resources/jdbc.properties
- 数据库的数据信息在src/main/resources/ssm.sql
- spring-mvc为Springmvc配置文件
- spring为spring配置文件
- spring-mybaits为SM整合的文件
- branch中SSM-mongo增加了对mongoDB的支持
- beanch中SSM-redis增加了对monogoDB和redis的支持

## 测试说明

- src/test/main下为测试文件，测试时需要稍微改动一下spring.xml,在spring.xml中有注释
- 项目整体运行后，进入/SSM/test  进入登录页面，说明测试成功
- 进入/SSM/druid，转到druid监测界面
- 进入/SSM/test0,返回用户信息
- 三个页面验证成功说明搭建成功


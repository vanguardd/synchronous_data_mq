# synchronous_data_mq

https://gitee.com/vanguardd/synchronous_data_mq

#### 安装教程
    (1) 使用IDEA导入synchronous_data_mq
    (2) 导入SQL文件夹中的数据库system_a和system_b;
    (3) 修改system_a和system_b两个项目中Application_dev.yml中数据库用户名和密码以及activeMQ的用户名和密码
    (4) 运行SystemAApplication类中的main方法即可运行system_a系统；
    (5) 运行SystemBApplication类中的main方法即可运行system_b系统

#### 介绍
    利用ActiveMQ实现A和B两个系统之间的数据同步

#### 功能说明
    建议使用Postman测试A和B系统的接口
    system_a系统执行更新操作时，包含新增、更新和删除操作，会发送同步消息到B系统，B系统收到消息执行相应的操作，保证两个系统之前数据同步。
    一、system_a系统
    1、test1的接口：
    （1）新增数据
        请求类型：POST
        url:http://localhost:8081/system_a/test1/add
        请求数据：
        {
        	"name": "小王",
        	"age": "29",
        	"sex": "男"
        }
    （2）修改数据
        请求类型：PUT
        url: http://localhost:8081/system_a/test1/update
        请求数据：
        {
            "id": 1,
            "name": "小王",
            "age": "29",
            "sex": "男"
        }
    （3）删除数据
        请求类型：DELETE
        url: http://localhost:8081/system_a/test1/{id}
    （4）查询所有的数据
        请求类型：GET
        url: http://localhost:8081/system_a/test1/list
    （5）根据id查询数据
        请求类型：GET
        url: http://localhost:8081/system_a/test1/{id}
    2、test2的接口：
    （1）新增数据
        请求类型：POST
        url:http://localhost:8081/system_a/test3/add
        请求数据：
        {
        	"subid": "001",
        	"meid": "001",
        	"acid": "002",
        	"acname": "xxx",
        	"number": "10",
        	"name": "xxx"
        }
    （2）修改数据
        请求类型：PUT
        url: http://localhost:8081/system_a/test3/update
        请求数据：
        {
            "id": 1,
        	"subid": "001",
        	"meid": "001",
        	"acid": "002",
        	"acname": "xxx",
        	"number": "10",
        	"name": "xxx"
        }
    （3）删除数据
        请求类型：DELETE
        url: http://localhost:8081/system_a/test3/{id}
    （4）查询所有的数据
        请求类型：GET
        url: http://localhost:8081/system_a/test3/list
    （5）根据id查询数据
        请求类型：GET
        url: http://localhost:8081/system_a/test3/{id}
    3、test3的接口：
    （1）新增数据
        请求类型：POST
        url:http://localhost:8081/system_a/test3/add
        请求数据：
        {
        	"telephone": "15529960414",
        	"email": "vanguardd@outlook.com",
        	"address": "陕西省西安市高新区科技四路"
        }
    （2）修改数据
        请求类型：PUT
        url: http://localhost:8081/system_a/test3/update
        请求数据：
        {
            "id": 1,
        	"telephone": "15529960414",
        	"email": "vanguardd@outlook.com",
        	"address": "陕西省西安市高新区科技四路"
        }
    （3）删除数据
        请求类型：DELETE
        url: http://localhost:8081/system_a/test3/{id}
    （4）查询所有的数据
        请求类型：GET
        url: http://localhost:8081/system_a/test3/list
    （5）根据id查询数据
        请求类型：GET
        url: http://localhost:8081/system_a/test3/{id} 
    二、system_b系统
    该系统对应的接口和system_a系统相似，端口号为8082，contextPath:system_b
    test1接口：
    （1）查询所有的数据
        请求类型：GET
        url: http://localhost:8082/system_b/test1/list
    （2）根据id查询数据
        请求类型：GET
        url: http://localhost:8082/system_b/test1/{id}
    test2接口：
    （1）查询所有的数据
        请求类型：GET
        url: http://localhost:8082/system_b/test2/list
    （1）根据id查询数据
        请求类型：GET
        url: http://localhost:8082/system_b/test2/{id} 
    test3接口：
    （1）查询所有的数据
        请求类型：GET
        url: http://localhost:8082/system_b/test2/list
    （1）根据id查询数据
        请求类型：GET
        url: http://localhost:8082/system_b/test2/{id} 
    



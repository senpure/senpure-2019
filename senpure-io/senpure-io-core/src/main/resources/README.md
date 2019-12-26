|参数             |说明                                       |备注 |
|:----            |:-----                                     |:----|
|import           |导入引用的其它io文件                       |    |
|namespace        | 协议命名空间                              |默认com.senpure.io|
|javaPackage      | 生成java文件的包名                        |默认命名空间+.protocol|
|luaNamespace     | 生成lua文件的命名空间                     |默认命名空间最后一部分首字母大写|
|jsNamespace      | 生成js文件的命名空间                      |默认命名空间最后一部分首字母大写|
|bean             |定义一个结构体             |至少要有一个字段|
|enum             |定义一个枚举                               |至少要有两个字段|
|message          |定义一个消息                               | |
|event            |定义一个事件                               | |

####bean message event 基础字段说明
|参数             |说明                                       |备注 |
|:----            |:-----                                     |:----|
|int              | var32                    |    |
|long             | var64                   |    |
|sint             |负数时可提升编码空间                    |    |
|slong            |  负数时可提升编码空间                     |    |
|boolean            | 布尔                     |    |
|String           |    字符串                  |    |
|float           |   浮点型  大端                 |    |
|double           |   双精度浮点型  大端                  |    |
|fixed32          |   编码固定4位 大端                  |    |
|fixed64           |   编码固定8位 大端                    |    |
|bytes           |     二进制                 |    |

bean message event 可引用其它定义的bean 和enum
###格式
[]中表示可选 
####字段定义
字段定义 [[]] 字段名 [= index ];[//字段注释]

如 

int age;//年龄

Book [] books = 2;//喜欢的书本

####message 定义

[//消息注释]

message messageType（cs|sc） 消息名 消息 id {

            [字段定义]
}

###message传输编码格式
|消息长度            |请求id        |消息id                           |消息类容 |
|:----            |:-----                                     |:----| :----|
|var32不含自身             | var32       |   var32      | 根据字段编码|

###语言实现 
可查看相关demo 或自己实现

|语言             |说明                                       |备注 |
|:----            |:-----                                     |:----|
|java             | 基于netty 实现                            |          
|c# + lua         | 基于doNetty 实现                          |        
|javaScript       | 基于nodejs 实现                           |      

###其它
基于idea编辑器实现了一个辅助插件

|选项             |说明      |                              
|:----            |:----- |
|语法高亮         |   √      
|代码格式化       |   √  (ctr + alt + l)    
|引用提示         |   √           
|自动补全         |   √      
|重命名           |   √      

提供了一个应用于notepad++的风格 xml                  









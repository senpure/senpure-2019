-Dsilence=true 使用静默方式启动
    静默模式下的一些命令
    -DuseProject=projectName            使用的项目名                          默认为userProject值
    -Dsensitive=true                    使敏感设置生效(如handler覆盖,合并等)  默认false
    -DgenerateJava=true                 生成java代码                          默认false
    -DgenerateLua=true                  生成lua代码                           默认false
    -DgenerateJs=true                   生成js代码                            默认false
    -DprotocolFile=protocolFlePath      协议文件路径多个,隔开文件夹获文件     默认读取配置文件
    -DjavaOut=javaCodePath              生成java代码的根路径,该值存在时       默认读取配置文件
                                        明确-DgenerateJava=false时不生成
                                        java代码
    -DluaOut=javaCodePath               生成lua代码的根路径                   默认读取配置文件
    -DjsOut=javaCodePath                生成js代码的根路径                    默认读取配置文件



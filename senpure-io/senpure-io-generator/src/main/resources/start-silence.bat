@echo off
set currentPath=%cd%
::echo %currentPath%
set fileName=""
for  %%a in (*) do (
   echo %%a|find /i "senpure-io-generator" >nul && set fileName=%%a
)
if %fileName% =="" (
    echo "没有找到可运行的jar文件"
    goto :end
)

::echo %fileName%
call java -Dsilence=true -jar %fileName% 
echo 3秒后关闭该窗口,要想停止请按ctrl + c
ping /n 2 127.1 >nul
echo 2秒后关闭该窗口,要想停止请按ctrl + c
ping /n 2 127.1 >nul
echo 1秒后关闭该窗口,要想停止请按ctrl + c
ping /n 2 127.1 >nul


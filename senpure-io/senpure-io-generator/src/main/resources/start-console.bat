@echo off
set size=%1
set rr="HKCU\Console\%%SystemRoot%%_system32_cmd.exe"
if "%size%" == "" (
  reg add %rr% /v "WindowPosition" /t REG_DWORD /d 0x00080008 /f>nul
  reg add %rr% /v "ScreenBufferSize" /t REG_DWORD /d 0x03e800c8 /f>nul
  reg add %rr% /v "WindowSize" /t REG_DWORD /d 0x03200c8 /f>nul
  start /i %~n0 1
  exit
) else (
  reg delete %rr% /f>nul
)
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
title %fileName%
java -jar %fileName%
:end
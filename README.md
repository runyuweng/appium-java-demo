# Appium java demo

## 一些基础概念
- maven：java包管理工具，类似node的npm
- testng：单元测试框架

## 环境配置
- appium环境配置：
    - http://appium.io/
    - appium-doctor验证通过即可
- android环境配置：
    - https://developer.android.com/studio
    - 打开android studio安装standard的配置即可
- java环境配置：
    - mac自带

## 一些需要用到的命令
```
# 获取appPackage字段：第一行的name
# 获取appActivity字段：launchable-activity中的name
aapt dump badging apk_file_path

# 获取deviceName
adb devices
```
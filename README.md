
## 介绍
Blog是基于RuoYi-Vue前后端分离基础平台开发的**博客网站**。

## 系统需求

- JDK >= 1.8
- MySQL >= 5.7
- Maven >= 3.0
- Node >= 12

## 技术选型

1、系统环境

- Java EE 8
- Servlet 3.0
- Apache Maven 3

2、主框架

- Spring Boot 2.2.x
- Spring Framework 5.2.x
- Spring Security 5.2.x

3、持久层

- Apache MyBatis 3.5.x
- Hibernate Validation 6.0.x
- Alibaba Druid 1.2.x

4、视图层

- Vue 2.6.x
- Axios 0.21.x
- Element 2.15.x

## 内置功能

 用户管理：用户是系统操作者，该功能主要完成系统用户配置。
 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
 通知公告：系统通知公告信息发布维护。
 操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
 登录日志：系统登录日志记录查询包含登录异常。
 内容管理：管理博客网站所有内容。
 文章管理：管理博客文章内容。
 随笔管理：管理博客随笔内容。
 分类管理：对博客分类的管理。
 标签管理：对博客标签的管理。
 留言管理：管理博客网站留言信息。
 评论管理：管理博客评论信息。
 文件管理：管理博客网站所有上传文件信息。

## 演示图

<table>

</table>


## 开发

```bash
# 克隆项目
git https://gitee.com/Ning310975876/ruo-yi-vue-blog.git

# 进入项目目录
cd blog-ui

# 安装依赖
npm install

# 建议不要直接使用 cnpm 安装依赖，会有各种诡异的 bug。可以通过如下操作解决 npm 下载速度慢的问题
npm install --registry=https://registry.npm.taobao.org

# 启动服务
npm run dev
```

浏览器访问 http://localhost:80

## 发布

```bash
# 构建测试环境
npm run build:stage

# 构建生产环境
npm run build:prod
```


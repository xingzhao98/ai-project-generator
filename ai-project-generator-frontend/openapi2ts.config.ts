/**
 * 根据后端接口生成前段请求和TS模型代码
 * API请求配置对象
 * 用于配置API文档生成工具的相关路径和设置
 */
export default {
  // 指定项目中request库的导入路径，用于API请求
  requestLibPath: "import request from '@/request'",
  // 指定OpenAPI schema文档的URL路径，用于获取API文档
  schemaPath: 'http://localhost:8123/api/v3/api-docs',
  // 指定项目源代码的目录路径，用于生成API客户端代码
  serversPath: './src',
}

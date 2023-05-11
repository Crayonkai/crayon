const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
});

/*<title><%= htmlWebpackPlugin.options.title %></title> 修改标题*/
module.exports = {
  pages: {
    index: {
      entry: 'src/main.js', // 入口文件
      title: 'jikaigggggg'
    }
  }
}

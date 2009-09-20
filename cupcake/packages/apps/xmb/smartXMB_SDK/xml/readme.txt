1. 运行cmd 终端
2. 进入SDK/tools 目录
3. 用adb push 命令将 workspace/smartXMB/xml/applist.xml push到 /data 目录
   adb push <local path> <des path>
   如果在tools目录定位 workspace/smartXMB/xml/applist.xml 比较麻烦， 建议先将applist.xml拷贝到/tools目录下
   输入 adb push ./applist.xml /data 即可。
4  参照3，把workspace/smartXMB/xml/layout.xml push到/data目录下
5  applist_1.xml layout_1.xml的使用与不加_1的文件相同。只是另外样式的xmb。push的data目录前要rename回applist.xml 和layout.xml。
6  复制workspace/smartXMB/res/drawable到SDK/tools， 输入命令：
   adb push drawable /data 
 push 所有图片到data目录
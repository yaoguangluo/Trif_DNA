# 卡在Updating Homebrew好久
brew install ansible
Updating Homebrew...

# 关闭自动更新，在.zshrc文件中加入下方命令，如果是bash请加在.bash_profile文件中，全局变量可以sudo vi /etc/profile
vim ~/.zshrc
export HOMEBREW_NO_AUTO_UPDATE=true

# 刷新环境变量
source ~/.zshrc

brew install --build-from-source
brew upgrade --build-from0source

#超时镜像 git
#sudo vim /etc/hosts
#i
#:exit
172.67.28.102 mvnrepository.com
104.22.60.77 mvnrepository.com
104.22.61.77 mvnrepository.com
172.67.28.102 mvnrepository.com

#185.199.108.153 assets-cdn.github.com
#185.199.109.153 assets-cdn.github.com
#185.199.110.153 assets-cdn.github.com
#185.199.111.153 assets-cdn.github.com

#raw.githubusercontent.com 185.199.109.133 3116854661GitHub泛播 ip138提供
#raw.githubusercontent.com 185.199.111.133 3116855173GitHub泛播 ip138提供
#raw.githubusercontent.com 185.199.110.133 3116854917GitHub
sudo killall -HUP mDNSResponder
稍后整理 可exec的 sh脚本流编码
#home brew temp replace
#https://mirrors4.tuna.tsinghua.edu.cn
#https://raw.githubusercontent.com
#rollback

#After installed opencv by using 'brew install ...', and 'brew edit' the 'build-java=ON', then I did a problem as below two lines...

#Homebrew % brew reinstall --build-from-source opencv
#Warning: building from source is not supported!

#......
#Finally even I didn't see any 'opencv.jar' file under the 'usr/..share/java/' category...

#Environment: Mac iOS + idea 学习版+ home brew + 中国电信网 + 国内git镜像

#Yaoguang.Luo
#yaoguangluo@outlook.com
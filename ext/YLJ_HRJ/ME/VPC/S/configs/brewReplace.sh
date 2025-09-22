#第一步，替换 brew.git：
cd "$(brew --repo)"
git remote set-url origin https://mirrors.ustc.edu.cn/brew.git
#第二步，替换 homebrew-core.git：
cd "$(brew --repo)/Library/Taps/homebrew/homebrew-core"
git remote set-url origin https://mirrors.ustc.edu.cn/homebrew-core.git
#选择
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://mirrors.ustc.edu.cn/homebrew-bottles' >> ~/.bash_profile
source ~/.bash_profile
#选择
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://mirrors.ustc.edu.cn/homebrew-bottles' >> ~/.zshrc
source ~/.zshrc

#预防镜像卡顿 备选
#qt tqinghua https://mirrors4.tuna.tsinghua.edu.cn

cd "$(brew --repo)"
git remote set-url origin https://mirrors4.tuna.tsinghua.edu.cn/brew.git
#第二步，替换 homebrew-core.git：
cd "$(brew --repo)/Library/Taps/homebrew/homebrew-core"
git remote set-url origin https://mirrors4.tuna.tsinghua.edu.cn/homebrew-core.git
#选择
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://mirrors4.tuna.tsinghua.edu.cn/homebrew-bottles' >> ~/.bash_profile
source ~/.bash_profile
#选择
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://mirrors4.tuna.tsinghua.edu.cn/homebrew-bottles' >> ~/.zshrc
source ~/.zshrc

//.file

cd "$(brew --repo)"
git remote set-url origin https://raw.githubusercontent.com/brew.git
#第二步，替换 homebrew-core.git：
cd "$(brew --repo)/Library/Taps/homebrew/homebrew-core"
git remote set-url origin https://raw.githubusercontent.com/homebrew-core.git
#选择
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://raw.githubusercontent.com/homebrew-bottles' >> ~/.bash_profile
source ~/.bash_profile
#选择
echo 'export HOMEBREW_BOTTLE_DOMAIN=https://raw.githubusercontent.com/homebrew-bottles' >> ~/.zshrc
source ~/.zshrc
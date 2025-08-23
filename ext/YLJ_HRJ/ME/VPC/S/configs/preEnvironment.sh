brew install openCV
xcode-select --install
brew install ant
brew info ..


#Google翻译：AArch64是Armv8-A架构中引入的64位状态。
#向后兼容Armv7-A和先前的32位Arm架构的32位状态称为AArch32。
#因此，用于64位ISA的GNU三元组是aarch64。
#Linux内核社区选择将其内核端口称为该体系结构arm64，而不是aarch64，因此这是一些arm64用法的来源。
#据我所知，用于aarch64的Apple后端称为arm64，
#而LLVM社区开发的后端称为aarch64（因为它是64位ISA的规范名称），后来将两者合并，现在的后端称为aarch64
#因此aarch64和arm64指的是同一件事
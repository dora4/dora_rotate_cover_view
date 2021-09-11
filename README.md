# DoraRotateCoverView

描述：一个无缝衔接的旋转封面

复杂度：★☆☆☆☆

分组：【Dora大控件组】

关系：暂无

技术要点：基本绘图、ObjectAnimator

### 照片

![avatar](https://github.com/dora4/dora_rotate_cover_view/blob/main/art/dora_rotate_cover_view.png)

### 动图

![avatar](https://github.com/dora4/dora_rotate_cover_view/blob/main/art/dora_rotate_cover_view.gif)

### 软件包

https://github.com/dora4/dora_rotate_cover_view/blob/main/art/dora_rotate_cover_view.apk

### 用法

```kotlin
val rotateCoverView = findViewById<DoraRotateCoverView>(R.id.rotateCoverView)
        // 设置转一圈的时间为10秒钟
        rotateCoverView.setRotateDuration(10000)
				// 智能启动
        rotateCoverView.start(R.drawable.cover, true)
```

| 类                  | API                 | 描述                                                         |
| ------------------- | ------------------- | ------------------------------------------------------------ |
| DoraRotateCoverView | start()             | 开始动画运行，如果isSmart传true，则自行处理start和resume，非第一次启动则调用resume |
| DoraRotateCoverView | stop()              | 终止动画运行                                                 |
| DoraRotateCoverView | pause()             | 暂停动画运行                                                 |
| DoraRotateCoverView | resume()            | 继续动画运行                                                 |
| DoraRotateCoverView | setRotateDuration() | 设置旋转一圈所需的时间                                       |
| DoraRotateCoverView | borderColor         | 边框的颜色                                                   |
| DoraRotateCoverView | borderWidth         | 边框的宽度                                                   |


#### DWRefreshLayout
**DWRefreshLayout**是一个`功能强大` `使用简单` `扩展便捷`的Android刷新布局,它即支持下拉刷新，也支持上拉加载更多。同时支持所有的View,支持自动刷新,支持自定义各种样式的刷新头加载尾控件。

**1.功能**
+ 上拉刷新  -----支持
+ 下拉刷新  -----支持
+ 自动刷新  -----支持
+ 自定义刷新头  -----支持
+ 自定义加载头  -----支持
+ 刷新TextView  -----支持
+ 刷新ImageView  -----支持
+ 刷新ScrollView  -----支持
+ 刷新WebView  -----支持
+ 刷新LinearLayout  -----支持
+ 刷新FrameLayout  -----支持
+ 刷新ListView  -----支持
+ 无刷新头实现回弹效果 -----支持
+ 其它View -----支持
+ 其它ViewGroup -----支持
+ 刷新头在内容之下 -----支持
+ 刷新头在内容之上 -----支持
+ 刷新头在内容之并排 -----支持
+ .... -----支持

**2. 依赖添加:**

````groovy
api 'com.github.123ufo:DWRefreshLayout:1.0.0'
````


**3. DWRefreshLayout属性**
````groovy
<declare-styleable name="DWRefreshLayout">
    <attr name="refresh_style">
        <enum name="style_below" value="1"/>
        <enum name="style_default" value="2"/>
        <enum name="style_material" value="3"/>
    </attr>
</declare-styleable>
````

`style_below`:表示刷新头在布局的内容下面.

`style_default`:表示刷新头与内容是线性上下排列,默认就是这种样式.

`style_material`:表示刷新头在内容之上,也就是Material Design风格.



**4. 最简单的使用示例:**

````xml
<com.ufo.dwrefresh.view.DWRefreshLayout
    android:id="@+id/dwRefreshLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <任何控件单一>
</com.ufo.dwrefresh.view.DWRefreshLayout>
````

```java	
    DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
    dwRefreshLayout.setOnRefreshListener(new DWRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            //刷新回调
        }

        @Override
        public void onLoadMore() {
            //加载更多回调
        }
    });
```
**5. 其它功能:**

        //禁止加载更多功能，默认是允许的
       dwRefreshLayout.lockLoadMore(true);

       //获取当前是否在刷新中或是在加载更多中
       dwRefreshLayout.isRefresh();

       //手动触发刷新(设置为true)
       dwRefreshLayout.setRefresh(true)

**6. 自定义刷新头:**

    1自定义一个View or ViewGroup 然后实现IRefreshHead接口
    2然后实现IRefreshHead接口的相关方法
    更多详情请看Demo里的代码
**7. 自定义加载尾:**

     1自定义一个View or ViewGroup 然后实现ILoadMoreFoot接口
     2然后实现ILoadMoreFoot接口的相关方法
     更多详情请看Demo里的代码


**8. 内置请求头有**
DefaultHeadView     传统风格
MaterialHeadView    MD风格
EmptyHeadView   空请求头，用于实现下拉回弹效果

**9. 内置加载更多尾有**

    DefaultFootView     传统风格
    EmptyFootView   空加载更多尾,用于实同上拉回弹效果o

**10. 经典刷新头**

[DWRefreshLayoutComponent][1]

**12. Gif图展示**

##### TextView
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/1.gif?raw=true" width="280"/>

##### RecyclerView
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/2.gif?raw=true" width="280"/>

##### Material Design
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/3.gif?raw=true" width="280"/>


##### 更多功能请参照Demo里的例子

---

## 扫我安装体验
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/3qrcode.png?raw=true" width="280"/>



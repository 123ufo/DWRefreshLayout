# DWRefreshLayout
一个支持上拉和下拉,支持所有的View,支持自动刷新,支持自定义各种样式的刷新Layout.

##### 上拉刷新  -----支持
##### 下拉刷新  -----支持
##### 自动刷新  -----支持
##### 自定义刷新头  -----支持
##### 自定义加载头  -----支持
##### 刷新TextView  -----支持
##### 刷新ImageView  -----支持
##### 刷新ScrollView  -----支持
##### 刷新WebView  -----支持
##### 刷新LinearLayout  -----支持
##### 刷新FrameLayout  -----支持
##### 刷新ListView  -----支持
##### 无刷新头实现回弹效果 -----支持
##### 其它View -----支持
##### 其它ViewGroup -----支持
##### 刷新头在内容之下 -----支持
##### 刷新头在内容之上 -----支持
##### 刷新头在内容之并排 -----支持
##### .... -----支持

### Gradle compile dependency:

	compile 'com.ufo:DWRefreshLayout:0.9.0'


### DWRefreshLayout属性

     <declare-styleable name="DWRefreshLayout">
            <attr name="refresh_style">
                <enum name="style_below" value="1"/>
                <enum name="style_default" value="2"/>
                <enum name="style_material" value="3"/>
            </attr>

        </declare-styleable>


**1** style_below:表示刷新头在布局的内容下面.

**2** style_default:表示刷新头与内容是线性上下排列,默认就是这种样式.

**3** style_material:表示刷新头在内容之上,也就是Material Design风格.



### 1最简单的使用示例:
	


	 <com.ufo.dwrefresh.view.DWRefreshLayout
        android:id="@+id/dwRefreshLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <任何控件>

    </com.ufo.dwrefresh.view.DWRefreshLayout>

.
	
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

### TextView
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/1.gif?raw=true" width="280"/>

### RecyclerView
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/2.gif?raw=true" width="280"/>

### Material Design
<img src="https://github.com/123ufo/DWRefreshLayout/blob/master/shotimg/3.gif?raw=true" width="280"/>
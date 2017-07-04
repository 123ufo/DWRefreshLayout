# DWRefreshLayout
一个支持上拉和下拉,支持所有的View,支持自动刷新,支持自定义各种样式的刷新Layout.

###Gradle compile dependency:

	compile 'com.ufo:DWRefreshLayout:0.9.0'


###1最简单的使用示例:
	


	 <com.ufo.dwrefresh.view.DWRefreshLayout
        android:id="@+id/dwRefreshLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <任何控件>

    </com.ufo.dwrefresh.view.DWRefreshLayout>

.
	
        final DWRefreshLayout dwRefreshLayout = (DWRefreshLayout) findViewById(R.id.dwRefreshLayout);
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